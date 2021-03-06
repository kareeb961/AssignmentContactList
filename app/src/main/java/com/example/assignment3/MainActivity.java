package com.example.assignment3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    FloatingActionButton B1;
    ListView L1;
    String Name[]={"Hamza","Areeb","Fahad","Faizan"};
    String Email[]={"hamza@gmail.com","areeb@gmail.com","fahad@gmail.com","faizan@gmail.com"};
    int img[]={R.drawable.hamza,R.drawable.areeb,R.drawable.fahad,R.drawable.faizan};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        B1=findViewById(R.id.btnAdd);
        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent);
            }
        });




        L1 = findViewById(R.id.allcont);
        MyAdapter adapter = new MyAdapter(this,Name,Email,img);
        L1.setAdapter(adapter);

        L1.setOnItemClickListener((parent, view, position, id) ->{
            String s = L1.getItemAtPosition(position).toString();
            Toast.makeText(this,s, Toast.LENGTH_SHORT).show();
        });

    }
}