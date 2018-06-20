package com.crud.jo.demorice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private Button btnLoginLink;
    private Button btnRegisterLink;
    private ImageButton ricebtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLoginLink = (Button) findViewById(R.id.btnLogin);
        btnRegisterLink = (Button) findViewById(R.id.btnRegister);
        ricebtn = (ImageButton) findViewById(R.id.btn_rice);

        //link to Sign In
        btnLoginLink.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,
                        LoginActivity.class);
                startActivity(i);
                finish();
            }
        });

        //link to Sign Up
        btnRegisterLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,
                        RegisterActivity.class);
                startActivity(i);
                finish();
            }
        });

        ricebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,
                        Main.class);
                startActivity(i);
                finish();
            }
        });
    }}
        //link to menurice
//        ricebtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent i = new Intent(MainActivity.this,
//                        ShowAllStudentsActivity.class);
//                startActivity(i);
//                finish();
//            }
//        });
//            setContentView(R.layout.activity_my);
