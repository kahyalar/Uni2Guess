package com.kahyalar.android.Uni2Guess;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by kahyalar on 11/01/2017.
 */

public class SignupActivity extends AppCompatActivity {
    private EditText txtName, txtSurname, txtBirthDate, txtUniversity, txtDepartment, txtGrade, txtCurrentGPA, txtStudentMail;
    private Button btnCreateNewUser;

    private void initElements(){
        txtName = (EditText)findViewById(R.id.txtName);
        txtSurname = (EditText)findViewById(R.id.txtSurname);
        txtBirthDate = (EditText)findViewById(R.id.txtBirthDate);
        txtUniversity = (EditText)findViewById(R.id.txtUniversity);
        txtDepartment = (EditText)findViewById(R.id.txtDepartment);
        txtGrade = (EditText)findViewById(R.id.txtGrade);
        txtCurrentGPA = (EditText)findViewById(R.id.txtCurrentGPA);
        txtStudentMail = (EditText)findViewById(R.id.txtStudentMail);
        btnCreateNewUser = (Button)findViewById(R.id.btnCreateNewUser);
    }

    private void initEvents(){
        btnCreateNewUser_Click();
    }

    private void btnCreateNewUser_Click(){
        btnCreateNewUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String yazilacakText = String.format("Adınız: %s\nSoyadınız: %s\nDoğum Gününüz: %s\n" +
                        "Üniversiteniz: %s\nBölümünüz: %s\nSınıfınız: %s\nŞuanki Not Ortalamanız: %s\n" +
                        "Öğrenci Mailiniz: %s\n",txtName.getText(),txtStudentMail.getText(),txtBirthDate.getText(),txtUniversity.getText(),
                        txtDepartment.getText(),txtGrade.getText(),txtCurrentGPA.getText(),txtStudentMail.getText());
                Toast.makeText(SignupActivity.this, yazilacakText, Toast.LENGTH_LONG).show();
            }
        });
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        initElements();
        initEvents();
    }
}
