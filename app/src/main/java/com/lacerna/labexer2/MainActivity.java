package com.lacerna.labexer2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etSchool, etSchool1, etSchool2, etSchool3, etSchool4, etSchool5, etSchool6, etSchool7;
    SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etSchool = findViewById(R.id.et_School);
        etSchool1 = findViewById(R.id.et_School1);
        etSchool2 = findViewById(R.id.et_School2);
        etSchool3 = findViewById(R.id.et_School3);
        etSchool4 = findViewById(R.id.et_School4);
        etSchool5 = findViewById(R.id.et_School5);
        etSchool6 = findViewById(R.id.et_School6);
        etSchool7 = findViewById(R.id.et_School7);
    }

    public void saveData(View v){
        sp = getSharedPreferences("data1", MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        String school = etSchool.getText().toString();
        String school1 = etSchool1.getText().toString();
        String school2 = etSchool2.getText().toString();
        String school3 = etSchool3.getText().toString();
        String school4 = etSchool4.getText().toString();
        String school5 = etSchool5.getText().toString();
        String school6 = etSchool6.getText().toString();
        String school7 = etSchool7.getText().toString();
        editor.putString("school", school);
        editor.putString("school1", school1);
        editor.putString("school2", school2);
        editor.putString("school3", school3);
        editor.putString("school4", school4);
        editor.putString("school5", school5);
        editor.putString("school6", school6);
        editor.putString("school7", school7);
        editor.commit();
        Toast.makeText(this, "data saved in data1.xml", Toast.LENGTH_LONG).show();
    }

    public void verify(View v){
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }
}
