package com.example.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.administrator.myapplication.MainActivity;
import com.example.administrator.myapplication.R;

/**
 * Created by Administrator on 2016/5/6.
 */
public class MyAdapter extends BaseAdapter{
    Context context;
    String[] cityName;
    public MyAdapter(Context context, String[] cityName) {
        this.context=context;
        this.cityName=cityName;

    }

    @Override
    public int getCount() {
        return cityName.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if(convertView==null){
            convertView= LayoutInflater.from(context).inflate(R.layout.activity_item,null);
            viewHolder=new ViewHolder();
            viewHolder.title= (TextView) convertView.findViewById(R.id.title);
            convertView.setTag(viewHolder);
        }else{
            viewHolder= (ViewHolder) convertView.getTag();

        }
        viewHolder.title.setText(cityName[position]);
        return convertView;
    }
    class  ViewHolder{
        TextView title;
    }
}
