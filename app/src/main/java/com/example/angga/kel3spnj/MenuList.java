package com.example.angga.kel3spnj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class MenuList extends AppCompatActivity {
    Button hot,grid;
    LinearLayout conten;
    RelativeLayout det;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_list);

        hot = (Button)findViewById(R.id.hotList);
        grid = (Button)findViewById(R.id.grid);
        conten = (LinearLayout)findViewById(R.id.containe);
        det = (RelativeLayout) findViewById(R.id.det);

        hot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(conten.getVisibility() == View.VISIBLE){
                    conten.setVisibility(View.GONE);
                }else{
                    conten.setVisibility(View.VISIBLE);
                }
            }
        });

        grid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              startActivity(new Intent(MenuList.this, ListFood.class));
            }
        });

        det.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuList.this, DetailFood.class));
            }
        });
    }
}
