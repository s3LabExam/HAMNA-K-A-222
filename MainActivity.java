package com.example.football;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn;
    EditText cname,place,playername,pass, cpass;
    RadioGroup radioGroup;
    boolean isAllChecked = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);
        cname= findViewById(R.id.cname);
        place = findViewById(R.id.place);
        playername = findViewById(R.id.playername);
        pass = findViewById(R.id.pass);
        cpass = findViewById(R.id.cpass);
        radioGroup= findViewById(R.id.radio);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isAllChecked = CheckAll();
                if (isAllChecked) {
                    int selectedId = radioGroup.getCheckedRadioButtonId();
                    RadioButton radioButton = (RadioButton) findViewById(selectedId);
                    Intent i = new Intent(MainActivity.this, MainActivity2.class);
                    startActivity(i);
                    Toast.makeText(MainActivity.this,"Register Successfull",Toast.LENGTH_LONG).show();

                }
            }
        });
    }

    private boolean CheckAll() {
        final String ccname = cname.getText().toString();
        final String pplace = place.getText().toString();
        final String pplayername = playername.getText().toString();
        final String ppass = pass.getText().toString();
        final String ccpass = cpass.getText().toString();
        if (ccname.length() == 0) {
            cname.setError("This Field is required");
            return false;
        }
        if (pplace.length() == 0) {
            cname.setError("This Field is required");
            return false;
        }
        if (pplayername.length() == 0) {
            cname.setError("This Field is required");
            return false;
        }
        if (ppass.length()==0)
        {
            pass.setError("This Field is required");
            return false;
        }
        if(ppass.length()<8){
            pass.setError("password must be minimum 8 characters");
            return false;
        }
        if(!ppass.matches("^(?=.*[0-9])" + "(?=.*[a-z])(?=.*[A-Z])" + "(?=.*[@#$%^&+=])" + "(?=\\S+$).{8,20}$"))
        {
            pass.setError("Invalid password");
            return false;
        }
        if(ccpass.length()==0)
        {
            cpass.setError("This Field is required");
        }
        if(!ppass.matches(ccpass))
        {
            cpass.setError("Password is not matching");
            return false;
        }
        return true;
    }

}
