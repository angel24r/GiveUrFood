package com.example.giveufood;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class recibir extends AppCompatActivity {
    String mTitle[] = {"Tacos","Hamburgesas","Sopa","Sandwiches","Atole"};
    String mDesc[] ={"Tacos de picadillo","Hamburgesas gratis","Sopa de pollo","Sandwiches sin orillas","Atole de cajeta"};
    int images[]={R.drawable.tacos,R.drawable.hamburger,R.drawable.sopa,R.drawable.sandwi,R.drawable.atole};
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recibir);
        listView = findViewById(R.id.listView);

        MyAdapter adapter = new MyAdapter(this,mTitle,mDesc,images);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    Intent intent = new Intent(getApplicationContext(), AnotherActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("image",images[0]);
                    intent.putExtras(bundle);
                    intent.putExtra("title",mTitle[0]);
                    intent.putExtra("desc",mDesc[0]);
                    intent.putExtra("position",""+0);
                    startActivity(intent);
                }
                if(position==1){
                    Intent intent = new Intent(getApplicationContext(), AnotherActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("image",images[1]);
                    intent.putExtras(bundle);
                    intent.putExtra("title",mTitle[1]);
                    intent.putExtra("desc",mDesc[1]);
                    intent.putExtra("position",""+1);
                    startActivity(intent);
                }
                if(position==2){
                    Intent intent = new Intent(getApplicationContext(), AnotherActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("image",images[2]);
                    intent.putExtras(bundle);
                    intent.putExtra("title",mTitle[2]);
                    intent.putExtra("desc",mDesc[2]);
                    intent.putExtra("position",""+2);
                    startActivity(intent);
                }
                if(position==3){
                    Intent intent = new Intent(getApplicationContext(), AnotherActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("image",images[3]);
                    intent.putExtras(bundle);
                    intent.putExtra("title",mTitle[3]);
                    intent.putExtra("desc",mDesc[3]);
                    intent.putExtra("position",""+3);
                    startActivity(intent);
                }
                if(position==4){
                    Intent intent = new Intent(getApplicationContext(), AnotherActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("image",images[4]);
                    intent.putExtras(bundle);
                    intent.putExtra("title",mTitle[4]);
                    intent.putExtra("desc",mDesc[4]);
                    intent.putExtra("position",""+4);
                    startActivity(intent);
                }
            }
        });

    }
    class MyAdapter extends ArrayAdapter<String>{
        Context context;
        String rTitle[];
        String rDesc[];
        int rImg[];

        MyAdapter(Context c, String title[], String desc[],int img[]){
            super(c,R.layout.row,R.id.textViwe1,title);
            this.context=c;
            this.rTitle=title;
            this.rDesc=desc;
            this.rImg=img;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater=(LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = layoutInflater.inflate(R.layout.row,parent,false);
            ImageView images= row.findViewById(R.id.image);
            TextView myTitle = row.findViewById(R.id.textViwe1);
            TextView myDesc = row.findViewById(R.id.textViwe2);

            images.setImageResource(rImg[position]);
            myTitle.setText(rTitle[position]);
            myDesc.setText(rDesc[position]);

            return row;
        }
    }
}