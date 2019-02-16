package com.eduadministrative.listview_tutorial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.dialog_listview.dialog_listview;
import com.populating_listview.populating_listview;
import com.toast_listview.toast_listview;

public class MainActivity extends AppCompatActivity {

    private Button btnPPLst, btnTLst, btnDLst;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPPLst=(Button)findViewById(R.id.btnPPLst);
        btnTLst=(Button)findViewById(R.id.btnTLst);
        btnDLst=(Button)findViewById(R.id.btnDLst);

        btnPPLst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, populating_listview.class);
                startActivity(intent);
            }
        });

        btnTLst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, toast_listview.class);
                startActivity(intent);
            }
        });

        btnDLst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, dialog_listview.class);
                startActivity(intent);
            }
        });
    }
}
