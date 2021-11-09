package com.example.makharij_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class makharij_page extends AppCompatActivity {


    private Button learnButton;
    private Button testButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_makharij_page);

        learnButton = (Button)findViewById(R.id.learnButton);
        testButton = (Button)findViewById(R.id.testButton);


        learnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openInsideActivity1();
            }
        });
        testButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openInsideActivity2();
            }
        });
    }
    public void openInsideActivity1()
    {
        Intent intent = new Intent(this,learn_page.class);
        startActivity(intent);
    }
    public void openInsideActivity2()
    {
        Intent intent = new Intent(this,test_page.class);
        startActivity(intent);
    }
}