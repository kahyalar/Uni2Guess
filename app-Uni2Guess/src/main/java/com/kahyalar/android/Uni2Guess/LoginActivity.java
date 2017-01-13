package com.kahyalar.android.Uni2Guess;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

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

    private void initEvents(){
        btnSignup_Click();
        btnLogin_Click();
    }

    private void btnSignup_Click(){
        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent signupIntent = new Intent(LoginActivity.this, SignupActivity.class);
                startActivity(signupIntent);
            }
        });
    }

    private void checkEduTr(){
        String test = txtMail.getText().toString();
        if(!test.contains("edu.tr")){
            Toast.makeText(LoginActivity.this, R.string.btnLogin_ClickError, Toast.LENGTH_LONG).show();
        }
    }

    private void btnLogin_Click(){
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkEduTr();
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initElements();
        initEvents();
    }
}
