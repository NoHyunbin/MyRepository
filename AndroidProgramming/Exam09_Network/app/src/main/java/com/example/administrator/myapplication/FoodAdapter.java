package com.example.administrator.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class FoodAdapter extends BaseAdapter{
    private List<Food> list;
    public void setList(List<Food> list) {
        this.list = list;
    }

    private Context context;
    private LayoutInflater layoutInflater;

    public FoodAdapter(Context context) {
        this.context = context;
        layoutInflater = layoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) { return list.get(position); }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if ( convertView == null ) {
            // inflation
            convertView = layoutInflater.inflate(R.layout.food_item, null);
        }

        // data setting
        Food food = list.get(position);
        ImageView foodImage = (ImageView) convertView.findViewById(R.id.foodImage);
        foodImage.setImageBitmap(food.getImage());

        TextView foodTitle = (TextView) convertView.findViewById(R.id.foodTitle);
        foodTitle.setText(food.getTitle());

        TextView foodContent = (TextView) convertView.findViewById(R.id.foodContent);
        foodContent.setText(food.getContent());

        return convertView;
    }
}