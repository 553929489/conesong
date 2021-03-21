package com.example.conesong.mission_package;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import com.example.conesong.R;

import java.util.List;


public class MissionAdapter extends ArrayAdapter<Mission> {
    private int resource;
    private View view;
    private ViewHolder viewHolder;
    public MissionAdapter(@NonNull Context context, int resource, @NonNull List<Mission> objects) {
        super(context, resource, objects);
        this.resource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Mission mission = getItem(position);
        if (convertView == null){
            view = LayoutInflater.from(getContext()).inflate(resource,parent,false);
            viewHolder.food_image = view.findViewById(R.id.food_image);
            viewHolder.food_name = view.findViewById(R.id.food_all);
            viewHolder.shop_image = view.findViewById(R.id.shop_image);
            viewHolder.shop_name = view.findViewById(R.id.shop_name);
        }
        return super.getView(position, convertView, parent);
    }

    public class ViewHolder{

        ImageView shop_image;
        TextView shop_name;
        ImageView food_image;
        TextView food_name;
        TextView total;
        TextView getMoney_text;
        TextView RMB_image;
        TextView getMoney;

    }
}
