package com.example.administrator.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity { // 앱만들 때 꼭 필요한 부모 클래스

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); // 재정의 하고도, 부모클래스 내의 메소드의 내용이 필요해서 쓴거
        setContentView(R.layout.activity_main); // R은 res, layout은 layout, activity_main은 activity_main.xml을 나타낸다
        Log.i("mylog", "onCreate()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("mylog", "onDestroy()");
    }
}
