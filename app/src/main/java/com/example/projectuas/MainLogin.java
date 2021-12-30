package com.example.projectuas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainLogin extends AppCompatActivity {

    String email="n";
    String Password="n";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_login);

        EditText txtUser=findViewById(R.id.txtUser);
        EditText txtPass=findViewById(R.id.txtPass);
        Button Login=findViewById(R.id.login);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txtUser.getText().toString().equalsIgnoreCase(email)&&txtPass.getText().toString().equalsIgnoreCase(Password)){
                    startActivity(new Intent(MainLogin.this,menu.class));
                }else{
                    Toast.makeText(MainLogin.this,"Email atau Password Salah",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}