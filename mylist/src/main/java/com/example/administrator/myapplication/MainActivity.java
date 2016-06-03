package com.example.administrator.myapplication;

import android.app.Activity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class MainActivity extends Activity {

     private ListView lv;
    private String[] cityName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //设置数据

        cityName = new String[]{"长沙","北京","杭州","广州","武汉","重庆","上海","深圳","长春","乌鲁木齐","哈尔滨","郑州","成都","大连","南昌","兰州","齐齐哈尔","汕头","苏州"
                ,"拉萨","南京","呼和浩特","厦门","合肥","沈阳","张家界","贵州","宁夏","济南","天津","石家庄","西安","澳门"};
        init();
    }
    public  void init(){
        lv= (ListView)findViewById(R.id.lv);
        getdata();


    }
    public void getdata(){

       ArrayAdapter<String> adapter=new ArrayAdapter<String>
               (MainActivity.this,android.R.layout.simple_list_item_1,android.R.id.text1,cityName);
lv.setAdapter(adapter);

    }


}
