package com.example.mypercentage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText etGrades;
    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnCalculate;

        etGrades = findViewById(R.id.etGrades);
        tvResult = findViewById(R.id.tvResult);
        btnCalculate = findViewById(R.id.btnCalculate);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String strGrades = etGrades.getText().toString();

                double dblGrades = Double.parseDouble(strGrades);

                String percentage = Double.toString(((dblGrades) - 0.5) * 10);

                tvResult.setText(percentage + " %");
            }
        });
    }
}