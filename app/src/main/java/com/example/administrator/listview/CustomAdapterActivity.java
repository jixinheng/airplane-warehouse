package com.example.administrator.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.administrator.listview.adapter.CustomAdapter;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapterActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_custom_adapter);

            ListView listView = (ListView) findViewById(R.id.lv);
            List<String> data = new ArrayList<>();

            for (int i = 1; i < 101; i++) {
                data.add(i%2==0?"this is a dog?":"this is a picture");
            }
            CustomAdapter adapter = new CustomAdapter(data, R.layout.item_custom_adapter,this);
            listView.setAdapter(adapter);
        }
}
