package com.kahyalar.android.Uni2Guess;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by kahyalar on 10/01/2017.
 */

public class LoginActivity extends AppCompatActivity {
    private EditText txtMail, txtPassword;
    private Button btnSignup, btnLogin;

    private void initElements(){
        txtMail = (EditText)findViewById(R.id.txtMail);
        txtPassword = (EditText)findViewById(R.id.txtPassword);
        btnLogin = (Button)findViewById(R.id.btnLogin);
        btnSignup = (Button)findViewById(R.id.btnSignup);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initElements();
    }
}
