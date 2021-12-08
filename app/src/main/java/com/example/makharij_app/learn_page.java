package com.example.makharij_app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class learn_page extends AppCompatActivity {

    Toolbar toolbar;
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
        toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ActionBar actionBar=getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(false);

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
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id=item.getItemId();
        if (id==R.id.action_tasks){
            Toast.makeText(this, "Task Clicked", Toast.LENGTH_SHORT).show();
        } else if(id==R.id.action_settings){
            Toast.makeText(this, "Setting clicked", Toast.LENGTH_SHORT).show();
        }else if(id==R.id.about){
            Toast.makeText(this, "Learn More Clicked", Toast.LENGTH_SHORT).show();
        } else if (id==R.id.exit){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}