package com.example.administrator.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity { // 앱만들 때 꼭 필요한 부모 클래스

    // 앱 켜지면 실행되는 순서 onCreate() -> onStart() -> onResume() -> onPause() -> onStop() -> onDestroy() 외워!!
    // 객체를 생성하는 메소드 ( 화면을 구성하는 객체가 생성될 때 )
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); // 재정의 하고도, 부모클래스 내의 메소드의 내용이 필요해서 쓴거
        setContentView(R.layout.activity_main); // R은 res, layout은 layout, activity_main은 activity_main.xml을 나타낸다
        Log.i("mylog", "onCreate()");
    }

    // 서비스를 실행하는 코드를 작성하는 메소드
    @Override
    protected void onStart() {
        super.onStart();
        Log.i("mylog", "onStart()");
    }

    // 사용자가 사용할 상태가 됐을 때 실행되는 메소드 ( 잠시 일시적으로 멈췄던 것을 재시작 )
    @Override
    protected void onResume() {
        super.onResume();
        Log.i("mylog", "onResume()");
    }

    // 사용자가 화면을 당장 사용할 수 없는 상태가 되면 실행되는 메소드 ( 일시정지 )
    @Override
    protected void onPause() {
        super.onPause();
        Log.i("mylog", "onPause()");
    }

    // 서비스를 정지하는 메소드
    @Override
    protected void onStop() {
        super.onStop();
        Log.i("mylog", "onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("mylog", "onDestroy()");
    }

    public void onClickBtnSecond(View view) {
        Log.i("mylog", "onClickBtnSecond()");
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }

    public void onClickBtnThird(View view) {
        Log.i("mylog", "onClickBtnThird()");
        Intent intent = new Intent(this, ThirdActivity.class);
        startActivity(intent);
    }
}
