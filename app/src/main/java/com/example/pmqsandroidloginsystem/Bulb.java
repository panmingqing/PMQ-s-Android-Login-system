package com.example.pmqsandroidloginsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class Bulb extends AppCompatActivity{

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bulb);
        Button button3 = (Button) findViewById(R.id.button3);
        Button button4 = (Button) findViewById(R.id.button4);
        imageView = (ImageView) findViewById(R.id.image_view1);
        button3.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View v){
                imageView.setImageResource(R.drawable.img_1);
            Toast.makeText(Bulb.this, "灯泡已打开", Toast.LENGTH_SHORT).show();
            }
        });

        button4.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View v){
                imageView.setImageResource(R.drawable.img_2);
            Toast.makeText(Bulb.this, "灯泡已关闭", Toast.LENGTH_SHORT).show();
            }
        });

    }



}