package com.arm.herecompanion;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity {

    public Button btnIngresar, btnRegistrar;
    public EditText txtUser, txtPass;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        txtUser = (EditText) findViewById(R.id.txtUser);
        txtPass = (EditText) findViewById(R.id.txtPass);
        btnIngresar= (Button) findViewById(R.id.btnIngresar);
    }

}
