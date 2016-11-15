package com.example.administrator.myapplication;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class FoodActivity extends AppCompatActivity {
    private ImageView imageLarge;
    private ListView foodList;
    private FoodAdapter foodAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageLarge = (ImageView) findViewById(R.id.imageLarge);

        foodList = (ListView) findViewById(R.id.foodList);
        foodList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                final Light light = (Light) foodAdapter.getItem(position);
                Thread thread = new Thread() {
                    @Override
                    public void run() {
                        final Bitmap bitmap = getBitmap(light.getImageLargeFileName());
                        imageLarge.post(new Runnable() {
                            @Override
                            public void run() {
                                imageLarge.setImageBitmap(bitmap);
                            }
                        });
                    }
                };
                thread.start();
            }
        });

        fillItems();
    }


    public void fillItems() {
        // HTTP 통신 코드
        Thread thread = new Thread() {
            @Override
            public void run() {
                try {
                    URL url = new URL("http://192.168.0.29:8080/myandroid/foodList");
                    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                    conn.connect();

                    if (conn.getResponseCode() == HttpURLConnection.HTTP_OK) {
                        InputStream is = conn.getInputStream();
                        Reader reader = new InputStreamReader(is);
                        BufferedReader br = new BufferedReader(reader);
                        String strJson = "";
                        while (true) {
                            String data = br.readLine();
                            if (data == null) break;
                            strJson += data;
                        }
                        br.close(); reader.close(); is.close();
                        final List<Light> list = parseJson(strJson);
                        foodList.post(new Runnable() {
                            // post메소드가 메인 스레스에서 실행하게끔 요청한다.
                            // 이렇게 하면 이 run()은 Main Thread가 실행한다.
                            @Override
                            public void run() {
                                foodAdapter = new FoodAdapter(FoodActivity.this);
                                foodAdapter.setList(list);
                                foodList.setAdapter(foodAdapter);
                                imageLarge.setImageBitmap(list.get(0).getImage());
                            }
                        });
                    }
                    conn.disconnect();
                } catch (Exception e) {
                    Log.i("mylog", e.getMessage());
                }
            }
        };
        thread.start();
    }

    public List<Light> parseJson(String strJon) {
        List<Light> list = new ArrayList<>();
        try {
            JSONArray jsonArray = new JSONArray(strJon);
            for ( int i = 0 ; i < jsonArray.length() ; i++ ) {
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                Light light = new Light();
                light.setImage(getBitmap(jsonObject.getString("image")));
                if ( i == 0 ) {
                    light.setImageLarge(getBitmap(jsonObject.getString("imageLarge")));
                }
                light.setImageFileName(jsonObject.getString("image"));
                light.setImageLargeFileName(jsonObject.getString("imageLarge"));
                light.setTitle(jsonObject.getString("title"));
                light.setContent(jsonObject.getString("content"));
                list.add(light);
            }
        } catch (JSONException e) {
            Log.i("mylog", e.getMessage());
        }
        return list;
    }

    public Bitmap getBitmap(String fileName) {
        Bitmap bitmap = null;
        try {
            URL url = new URL("http://192.168.0.29:8080/myandroid/getImage?fileName=" + fileName);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.connect();

            if ( conn.getResponseCode() == HttpURLConnection.HTTP_OK ) {
                InputStream is = conn.getInputStream();
                bitmap = BitmapFactory.decodeStream(is);
            }

            conn.disconnect();
        } catch (Exception e) {
            Log.i("mylog", e.getMessage());
        }
        return bitmap;
    }


}
