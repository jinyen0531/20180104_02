package com.yenyu.a20180104_02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    String []str;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv =(ListView) findViewById(R.id.listView); //條列式顯示
        str= new String []{"眼睛","腳","胃","發燒"}; //寫一個陣列
        ArrayAdapter<String> adapter=new ArrayAdapter<String>
                //利用Adapter連接ListView 跟 Array
                (MainActivity.this,
                        android.R.layout.simple_list_item_1,
                        str);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, str[i], Toast.LENGTH_SHORT).show();
            }
        });
    }


}

