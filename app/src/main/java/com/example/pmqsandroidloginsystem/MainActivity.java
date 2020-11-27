package com.example.pmqsandroidloginsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.BufferedWriter;
import java.io.FileInputStream;

public class MainActivity extends AppCompatActivity {
    private EditText edit_text;
    private EditText edit_password;
    private MyDatabaseHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dbHelper=new MyDatabaseHelper(this,"StudentStore.db",null,1);
        Button button1 = (Button) findViewById(R.id.button1);
        Button button2 = (Button) findViewById(R.id.button2);
        edit_text=(EditText)findViewById(R.id.edit_text);
        edit_password=(EditText)findViewById(R.id.edit_password);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputText3=edit_text.getText().toString();
                String inputText4=edit_password.getText().toString();
                SQLiteDatabase db=dbHelper.getWritableDatabase();
                Cursor cursor=db.query("Student",null,null,null,null,null,null);
                //String edit_text=cursor.getString(cursor.getColumnIndex(inputText3));
                //String edit_password=cursor.getString(cursor.getColumnIndex(inputText4));
                Intent intent = new Intent(MainActivity.this, Bulb.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "登录成功", Toast.LENGTH_SHORT).show();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, zhuce.class);
                startActivity(intent);

            }
        });
    }
}
