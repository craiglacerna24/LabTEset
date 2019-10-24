package com.lacerna.labexer2;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    EditText etSchool, etSchool1, etSchool2, etSchool3, etSchool4, etSchool5, etSchool6, etSchool7;
    SharedPreferences sp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        etSchool = findViewById(R.id.editText);

    }

    public void finishna(View v){
        sp = getSharedPreferences("data1", MODE_PRIVATE);
        String schoolSP = sp.getString("school", null);
        String school1SP = sp.getString("school1", null);
        String school2SP = sp.getString("school2", null);
        String school3SP = sp.getString("school3", null);
        String school4SP = sp.getString("school4", null);
        String school5SP = sp.getString("school5", null);
        String school6SP = sp.getString("school6", null);
        String school7SP = sp.getString("school7", null);
        String school = etSchool.getText().toString();

        if(schoolSP.equals(school) || school1SP.equals(school) || school2SP.equals(school) || school3SP.equals(school) || school4SP.equals(school) || school5SP.equals(school)
                || school6SP.equals(school) || school7SP.equals(school)){
            Toast.makeText(this,"school is competing in UAAP...", Toast.LENGTH_LONG).show();
        }
        else {
            Toast.makeText(this, "school is not competing in UAAP...", Toast.LENGTH_LONG).show();
        }



    }


}
