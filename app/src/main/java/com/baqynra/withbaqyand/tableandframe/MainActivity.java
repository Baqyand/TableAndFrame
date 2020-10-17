package com.baqynra.withbaqyand.tableandframe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TableRow;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = findViewById(R.id.btnreal);
        btn1.setOnClickListener(this);

        Button btn2 = findViewById(R.id.btnrelative);
        btn2.setOnClickListener(this);

        Button btn3 = findViewById(R.id.btnlinear);
        btn3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.btnreal:
                Intent a = new Intent(MainActivity.this, TableLayout.class);
                startActivity(a);
                break;
            case R.id.btnrelative:
                Intent b = new Intent(MainActivity.this, Frameone.class);
                startActivity(b);
                break;
            case R.id.btnlinear:
                Intent c = new Intent(MainActivity.this, Frametwo.class);
                startActivity(c);
                break;

        }
    }
}