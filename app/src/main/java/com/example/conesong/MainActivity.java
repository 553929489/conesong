package com.example.conesong;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.RadioGroup;

import com.example.conesong.mission_package.Order_List_Fragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Fragment> fragmentList = new ArrayList<>();
    RadioGroup Group_one;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addfragment();
        replacefragment(fragmentList.get(0));
        Group_one = findViewById(R.id.bottom_button);
        RadioGroupListener rl = new RadioGroupListener();
        Group_one.setOnCheckedChangeListener(rl);
    }
    public void replacefragment(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.exchange,fragment);
        transaction.commit();
    }
    public void addfragment(){
        fragmentList.add(new Order_List_Fragment());
        fragmentList.add(new Message_Fragment());
    }

    public class RadioGroupListener implements RadioGroup.OnCheckedChangeListener{
        @Override
        public void onCheckedChanged(RadioGroup radioGroup, int i) {
            if(radioGroup == Group_one){
                switch (i){
                    case R.id.homepage:
                        replacefragment(fragmentList.get(0));
                        break;
                    case R.id.message:
                        replacefragment(fragmentList.get(1));
                }
            }

        }
    }
}