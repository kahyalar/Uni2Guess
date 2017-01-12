package com.kahyalar.android.Uni2Guess;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

/**
 * Created by kahyalar on 11/01/2017.
 */

public class SignupActivity extends AppCompatActivity {
    private EditText txtName, txtSurname, txtBirthDate, txtUniversity, txtDepartment, txtGrade, txtCurrentGPA, txtStudentMail;

    private void initElements(){
        txtName = (EditText)findViewById(R.id.txtName);
        txtSurname = (EditText)findViewById(R.id.txtSurname);
        txtBirthDate = (EditText)findViewById(R.id.txtBirthDate);
        txtUniversity = (EditText)findViewById(R.id.txtUniversity);
        txtDepartment = (EditText)findViewById(R.id.txtDepartment);
        txtGrade = (EditText)findViewById(R.id.txtGrade);
        txtCurrentGPA = (EditText)findViewById(R.id.txtCurrentGPA);
        txtStudentMail = (EditText)findViewById(R.id.txtStudentMail);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        initElements();
    }
}
