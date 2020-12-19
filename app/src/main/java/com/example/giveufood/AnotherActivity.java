package com.example.giveufood;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class AnotherActivity extends AppCompatActivity {
    ImageView imageView;
    TextView title, desc;
    int position;
    Button btnpedir;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);
        ActionBar actionBar = getSupportActionBar();
        btnpedir = findViewById(R.id.btnpedir);
        btnpedir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AnotherActivity.this,Home.class);
                AnotherActivity.this.startActivity(intent);
                finish();
            }
        });
        if(actionBar !=null)
        {
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setDisplayShowCustomEnabled(true);
        }
        imageView = findViewById(R.id.another_image);
        title = findViewById(R.id.titleText);
        desc = findViewById(R.id.titleDesc);
        if(position==0)
        {
            Intent intent = getIntent();
            Bundle bundle = this.getIntent().getExtras();
            int pic = bundle.getInt("image");
            String aTitle = intent.getStringExtra("title");
            String aDesc = intent.getStringExtra("desc");

            imageView.setImageResource(pic);
            title.setText(aTitle);
            desc.setText(aDesc);

            actionBar.setTitle(aTitle);
        }
        if(position==1)
        {
            Intent intent = getIntent();
            Bundle bundle = this.getIntent().getExtras();
            int pic = bundle.getInt("image");
            String aTitle = intent.getStringExtra("title");
            String aDesc = intent.getStringExtra("desc");

            imageView.setImageResource(pic);
            title.setText(aTitle);
            desc.setText(aDesc);

            actionBar.setTitle(aTitle);
        }
        if(position==2)
        {
            Intent intent = getIntent();
            Bundle bundle = this.getIntent().getExtras();
            int pic = bundle.getInt("image");
            String aTitle = intent.getStringExtra("title");
            String aDesc = intent.getStringExtra("desc");

            imageView.setImageResource(pic);
            title.setText(aTitle);
            desc.setText(aDesc);

            actionBar.setTitle(aTitle);
        }
        if(position==3)
        {
            Intent intent = getIntent();
            Bundle bundle = this.getIntent().getExtras();
            int pic = bundle.getInt("image");
            String aTitle = intent.getStringExtra("title");
            String aDesc = intent.getStringExtra("desc");

            imageView.setImageResource(pic);
            title.setText(aTitle);
            desc.setText(aDesc);

            actionBar.setTitle(aTitle);
        }
        if(position==4)
        {
            Intent intent = getIntent();
            Bundle bundle = this.getIntent().getExtras();
            int pic = bundle.getInt("image");
            String aTitle = intent.getStringExtra("title");
            String aDesc = intent.getStringExtra("desc");

            imageView.setImageResource(pic);
            title.setText(aTitle);
            desc.setText(aDesc);
            actionBar.setTitle(aTitle);
        }
    }
}