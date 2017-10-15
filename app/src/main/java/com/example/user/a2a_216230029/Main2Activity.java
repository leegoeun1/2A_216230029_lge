package com.example.user.a2a_216230029;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    int year=2017;
    EditText birthyear;
    Button result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setTitle("나이 계산기");
        agecal();
    }

    private void agecal() {
        result = (Button)findViewById(R.id.result);
        birthyear = (EditText)findViewById(R.id.birthyear);

        result.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view) {
                String temp = birthyear.getText().toString();
                int age = year-Integer.parseInt(temp) +1;
                Toast toast = Toast.makeText(getApplicationContext(), "당신의 나이는 "+age+" 입니다.", Toast.LENGTH_SHORT);
                toast.show();
            }
        });
    }
}
