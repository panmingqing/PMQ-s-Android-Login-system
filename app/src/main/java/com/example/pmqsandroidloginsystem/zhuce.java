package com.example.pmqsandroidloginsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class zhuce extends AppCompatActivity {
    private EditText edit_text;
    private EditText edit_password;
    private MyDatabaseHelper dbHelper;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zhuce);
        dbHelper=new MyDatabaseHelper(this,"StudentStore.db",null,1);
        Button button5 = (Button) findViewById(R.id.button5);
        Button button6 = (Button) findViewById(R.id.button6);
        edit_text=(EditText)findViewById(R.id.edit_text);
        edit_password=(EditText)findViewById(R.id.edit_password);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputText1=edit_text.getText().toString();
                String inputText2=edit_password.getText().toString();
                SQLiteDatabase db=dbHelper.getWritableDatabase();
                ContentValues values=new ContentValues();
                values.put("edit_text",inputText1);
                values.put("edit_text_password",inputText2);
                db.insert("Student",null,values);
                Intent intent = new Intent(zhuce.this, MainActivity.class);
                startActivity(intent);
                Toast.makeText(zhuce.this, "注册成功", Toast.LENGTH_SHORT).show();
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(zhuce.this, MainActivity.class);
                startActivity(intent);
                Toast.makeText(zhuce.this, "取消注册", Toast.LENGTH_SHORT).show();
            }
        });
    }

}

