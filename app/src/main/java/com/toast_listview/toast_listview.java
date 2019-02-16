package com.toast_listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.eduadministrative.listview_tutorial.R;

import java.util.ArrayList;
import java.util.List;

public class toast_listview extends AppCompatActivity {

    private ListView lst;

    List<String> array_list = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.toast_listview);

        lst=(ListView)findViewById(R.id.lst);

        array_list.add("Item 1");
        array_list.add("Item 2");
        array_list.add("Item 3");
        array_list.add("Item 4");
        array_list.add("Item 5");
        array_list.add("Item 6");
        array_list.add("Item 7");
        array_list.add("Item 8");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, array_list );

        lst.setAdapter(arrayAdapter);

        lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item = ((TextView)view).getText().toString();
                Toast.makeText(toast_listview.this, item + " has been clicked ", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
