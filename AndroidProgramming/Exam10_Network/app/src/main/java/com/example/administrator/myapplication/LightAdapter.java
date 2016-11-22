package com.example.administrator.myapplication;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class LightAdapter extends BaseAdapter{
    private List<Light> list;
    public void setList(List<Light> list) {
        this.list = list;
    }

    // 아래 두개는 LayoutInflater를 얻기 위함이다
    private Context context;
    private LayoutInflater layoutInflater;

    public LightAdapter(Context context) {
        this.context = context;
        layoutInflater = layoutInflater.from(context);
    }
/*
    // 이렇게 하면 인플레이터를 얻을 수 있는데, 이렇게하면 MainActivity에서만 쓸 수 있어서
    // 여러 곳에서 쓰기 위해서 위에처럼 쓴다
    // Context는 Activity라 생각하면 편하다
    // MainActivity는 Context를 상속받고있다.

    public LightAdapter(MainActivity mainActivity) {
        this.context = context;
        layoutInflater = mainActivity.getLayoutInflater();
    }
*/

    // light의 데이터 갯수가 몇개냐
    @Override
    public int getCount() {
        return list.size();
    }

    // light에서 해당 인덱스(position)에 있는 데이터가 뭐냐
    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    // light에서 해당 인덱스(position)에 있는 id(값)가 뭐냐. 없다면 position을 리턴
    // 이 객체의 식별값을 리턴한다. (board라면 bno를 리턴하게 하면 된다)
    @Override
    public long getItemId(int position) {
        return position;
    }

    // 리스트에 들어가는 하나의 항목을 생성해서 리턴 ( light_item.xml을 가지고 만듬 )
    // getView(객체의 순서, [1]번 Inflation한 객체, ListView)
    // convertView가 null이 아니면 재사용(Scroll되서 올라갈 때), null이면 객체 생성
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if ( convertView == null ) {
            // inflation
            convertView = layoutInflater.inflate(R.layout.light_item, null);
        }

        // data setting
        Light light = list.get(position);
        ImageView lightImage = (ImageView) convertView.findViewById(R.id.lightImage);
        lightImage.setImageBitmap(light.getImage());

        TextView lightTitle = (TextView) convertView.findViewById(R.id.lightTitle);
        lightTitle.setText(light.getTitle());

        TextView lightContent = (TextView) convertView.findViewById(R.id.lightContent);
        lightContent.setText(light.getContent());

        return convertView;
    }
}