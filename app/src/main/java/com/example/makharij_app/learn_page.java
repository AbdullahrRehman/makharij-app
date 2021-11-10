package com.example.makharij_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class learn_page extends AppCompatActivity {


    private Button halqiyahButton;
    private Button lahatiyahButton;
    private Button tarfiyahButton;
    private Button lisaveyahButton;
    private Button niteeyahButton;
    private Button ghunnaButton;
    private Button shajariyahButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_page);

        halqiyahButton = (Button)findViewById(R.id.button);
        lahatiyahButton = (Button)findViewById(R.id.button2);
        tarfiyahButton = (Button)findViewById(R.id.button3);
        lisaveyahButton = (Button)findViewById(R.id.button4);
        niteeyahButton = (Button)findViewById(R.id.button5);
        ghunnaButton = (Button)findViewById(R.id.button6);
        shajariyahButton = (Button)findViewById(R.id.button7);

        halqiyahButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openInsideActivity1();
            }
        });
        lahatiyahButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openInsideActivity2();
            }
        });
        tarfiyahButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openInsideActivity3();
            }
        });
        lisaveyahButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openInsideActivity1();
            }
        });
        niteeyahButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openInsideActivity2();
            }
        });
        ghunnaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openInsideActivity3();
            }
        });
        shajariyahButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openInsideActivity7();
            }
        });

    }
    public void openInsideActivity1()
    {
        Intent intent = new Intent(this,halqiyah_page.class);
        startActivity(intent);
    }
    public void openInsideActivity2()
    {
        Intent intent = new Intent(this,lahatiyah_page.class);
        startActivity(intent);
    }
    public void openInsideActivity3()
    {
        Intent intent = new Intent(this,tarfiyah_page.class);
        startActivity(intent);
    }

    public void openInsideActivity7()
    {
        Intent intent = new Intent(this,shajariyah_page.class);
        startActivity(intent);
    }
}