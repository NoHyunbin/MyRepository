package com.example.administrator.myapplication;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.renderscript.ScriptGroup;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ImageView imageLarge;
    private ListView lightList;
    private LightAdapter lightAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageLarge = (ImageView) findViewById(R.id.imageLarge);

        lightList = (ListView) findViewById(R.id.lightList);
        lightList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                final Light light = (Light) lightAdapter.getItem(position);

                AsyncTask<Void, Void, Bitmap> asyncTask = new AsyncTask<Void, Void, Bitmap>() {
                    @Override
                    protected Bitmap doInBackground(Void... params) {
                        return getBitmap(light.getImageLargeFileName());
                    }

                    @Override
                    protected void onPostExecute(Bitmap bitmap) {
                        imageLarge.setImageBitmap(bitmap);
                    }
                };

                asyncTask.execute();
            }
        });

        testAsyncTask();
        fillItems();
    }


    public void testAsyncTask() {
        Log.i("mylog", "1 : " + Thread.currentThread().getName());
        // 어떠한 데이터도 받지 않겠다는 의미로 Void를 사용함
        // 첫번째 제네릭 파라미터의 타입은 asyncTask.excute();의 매개값의 타입이다. 그리고 그 값은 doInBackground의 파라미터의 타입이다.
        // 두번째 제네릭 파라미터의 타입은 publishProgress()가 실행될 때의 매개값이다. onProgressUpdate()의 파라미터 타입도 같게 해줘야 한다.
        // 세번째 제네릭 파라미터의 타입은 doInBackground의 리턴타입이다. onPostExecute()의 파라미터로 리턴값이 전달되므로 파라미터 타입도 같게 해줘야 한다.
        AsyncTask<String, Integer, String> asyncTask = new AsyncTask<String, Integer, String>() {
            @Override
            protected String doInBackground(String... params) {
                Log.i("mylog", "2 : " + Thread.currentThread().getName());
                Log.i("mylog", params[0]);
                // publishProgress(); // 이걸 메인스레드에 제출하면 onProgressUpdate가 실행됨
                Log.i("mylog", params[1]);
                Log.i("mylog", params[2]);

                for (int i = 1; i <= 100; i++) {
                    if (i == 1) {
                        publishProgress(1);
                    } else if (i == 50) {
                        publishProgress(50);
                    } else if (i == 100) {
                        publishProgress(100);
                    }
                }

                return "작업스레드결과";
            }

            // 현재 작업이 얼마나 진행됐는지 알고자 할 때 실행하는 부분
            // doInBackground에서 실행하라고 요청했을 때에만 실행됨
            @Override
            protected void onProgressUpdate(Integer... values) {
                Log.i("mylog", "3 : " + Thread.currentThread().getName());
                Log.i("mylog", "작업 진행 정도 : " + values[0]);
            }

            // 아래 부분은 main thread에서 실행된다.
            // UI 변경은 main thread에서만 해야하므로 여기서 UI 변경코드를 넣으면 된다.
            // doInBackground의 리턴값이 파라미터로 온다.
            @Override
            protected void onPostExecute(String aVoid) {
                Log.i("mylog", "4 : " + Thread.currentThread().getName());
                Log.i("mylog", aVoid);
            }
        };

        asyncTask.execute("실행매개값1", "실행매개값2", "실행매개값3");
    }


    public void fillItems() {
        AsyncTask<Void, Void, List<Light>> asyncTask = new AsyncTask<Void, Void, List<Light>>() {
            @Override
            protected List<Light> doInBackground(Void... params) {
                List<Light> list = null;
                try {
                    URL url = new URL("http://192.168.0.29:8080/myandroid/lightList");
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
                        br.close();
                        reader.close();
                        is.close();
                        list = parseJson(strJson);
                    }
                    conn.disconnect();
                } catch (Exception e) {
                    Log.i("mylog", e.getMessage());
                }
                return list;
            }

            @Override
            protected void onPostExecute(List<Light> lights) {
                lightAdapter = new LightAdapter(MainActivity.this);
                lightAdapter.setList(lights);
                lightList.setAdapter(lightAdapter);
                imageLarge.setImageBitmap(lights.get(0).getImageLarge());
            }
        };

        asyncTask.execute();

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
