package com.example.week9_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout linear;

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        linear = findViewById(R.id.linear);
    }// on Create method
        // 추가메소드 옵션 메뉴 나타나기

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
       // MenuInflater minflater = getMenuInflater();
       // minflater.inflate(R.menu.menu1,menu);
        //2
        menu.new


        return true;
    }


    // 추가메소드 옵션기능 실핼할 소스
}//menu1