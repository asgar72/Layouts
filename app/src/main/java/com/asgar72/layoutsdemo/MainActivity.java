package com.asgar72.layoutsdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.asgar72.layoutsdemo.Linear_Layout.LinearLayoutOne;
import com.asgar72.layoutsdemo.Linear_Layout.linear_layout_template;
import com.asgar72.layoutsdemo.Linear_Layout.linear_layout_template2;
import com.asgar72.layoutsdemo.Linear_Layout.linear_layout_template3;
import com.asgar72.layoutsdemo.R;
import com.asgar72.layoutsdemo.Relative_layout.Relative_temp1;

public class MainActivity extends AppCompatActivity {
    Button btn1, btn2, btn3, btn4,btn5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ob = new Intent(getApplicationContext(), LinearLayoutOne.class);
                startActivity(ob);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ob = new Intent(getApplicationContext(), linear_layout_template.class);
                startActivity(ob);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ob = new Intent(getApplicationContext(), linear_layout_template2.class);
                startActivity(ob);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ob = new Intent(getApplicationContext(), linear_layout_template3.class);
                startActivity(ob);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ob = new Intent(getApplicationContext(), Relative_temp1.class);
                startActivity(ob);
            }
        });

    }
}