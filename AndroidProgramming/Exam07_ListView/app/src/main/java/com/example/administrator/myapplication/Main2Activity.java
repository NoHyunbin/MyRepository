package com.example.administrator.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    private LinearLayout itemContainer2;
    private LayoutInflater layoutInflater;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        itemContainer2 = (LinearLayout) findViewById(R.id.itemContainer2);
        layoutInflater = getLayoutInflater();
        fillItems();
    }

    public void fillItems() {
        int[] arrImage = {
                R.drawable.food01,
                R.drawable.food02,
                R.drawable.food03,
                R.drawable.food04,
                R.drawable.food05
        };


        for ( int i = 0 ; i < 5 ; i++ ) {
            // Inflation
            LinearLayout itemLayout = (LinearLayout) layoutInflater.inflate(R.layout.food_item, null);

            // Data Setting
            ImageView foodImage = (ImageView) itemLayout.findViewById(R.id.foodImage);
            foodImage.setImageResource(arrImage[i]);

            TextView foodTitle = (TextView) itemLayout.findViewById(R.id.foodTitle);
            foodTitle.setText("Name");

            TextView foodPrice = (TextView) itemLayout.findViewById(R.id.foodPrice);
            foodPrice.setText("35,000 Won");

            TextView foodContent = (TextView) itemLayout.findViewById(R.id.foodContent);
            foodContent.setText("Information about popular Korean food dishes and local restaurant listings in the Tri-state area.");

            // itemContainer의 내부 객체로 추가
            itemContainer2.addView(itemLayout);
        }
    }
}
