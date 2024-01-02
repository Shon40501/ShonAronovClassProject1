package com.example.shonaronovclassproject1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt = (Button) findViewById(R.id.bt1);
        bt.setText("Click me");
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                bt.setText("Oh , yea , I've been clicked!");
            }

        });


    }
}