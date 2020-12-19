package com.example.giveufood;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Home extends AppCompatActivity {
    CardView donar,recibir;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        donar = findViewById(R.id.donar);
        recibir = findViewById(R.id.recibir);
        donar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this,RegisterActivity.class);
                Home.this.startActivity(intent);
                finish();
            }
        });
        recibir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this,recibir.class);
                Home.this.startActivity(intent);
                finish();
            }
        });
    }
}