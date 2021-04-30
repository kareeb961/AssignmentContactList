package com.example.assignment3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity {
EditText Cname, Email, Address, cellNum;
ImageView dummy;
Button btnCAdd,btnBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btnCAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String contactName = Cname.getText().toString().trim();
                String contactEmail = Email.getText().toString().trim();
                String contactAddress = Address.getText().toString().trim();
                String contactNumber = cellNum.getText().toString().trim();
                if(contactName.isEmpty()){
                    Cname.setError("Name required");
                }
                else if(contactEmail.isEmpty()){
                    Email.setError("Email required");
                }
                else if(contactAddress.isEmpty()){
                    Address.setError("Address required");
                }
                else if(contactNumber.isEmpty()){
                    cellNum.setError("Number required");
                }
            }
        });

    }
}