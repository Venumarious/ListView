package com.dialog_listview;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.eduadministrative.listview_tutorial.R;
import com.toast_listview.toast_listview;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class dialog_listview extends AppCompatActivity {

    private ListView lst;
    // Custom Dialog
    TextView txtItem;

    List<String> array_list = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_listview);

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
                show_dialog(item);
            }
        });
    }

    public void show_dialog(String itemNm){
        final Dialog dialog = new Dialog(dialog_listview.this);
        dialog.setContentView(R.layout.custom_dialog);
        dialog.setTitle("Selected Item");

        txtItem=(TextView)dialog.findViewById(R.id.txtItem);
        txtItem.setText(itemNm);

        dialog.show();
    }
}
