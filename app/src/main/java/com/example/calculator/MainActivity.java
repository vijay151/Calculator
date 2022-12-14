package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etFirstValue,etSecondValue;
    TextView tvAns;
    Button add,subtract,multiply,divide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etFirstValue = findViewById(R.id.etFirstValue);
        etSecondValue = findViewById(R.id.etSecondValue);
        tvAns = findViewById(R.id.tvAns);
        add = findViewById(R.id.btnAdd);
        subtract = findViewById(R.id.btnSubtract);
        multiply = findViewById(R.id.btnMultiply);
        divide = findViewById(R.id.btnDivide);
        Log.d("Calcular app","Update");

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstValue,SecondValue,ans;
                firstValue=Integer.parseInt(etFirstValue.getText().toString());
                SecondValue = Integer.parseInt(etSecondValue.getText().toString());

                ans=firstValue+SecondValue;
                tvAns.setText("Ans is = "+ans);
            }
        });
        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstValue,SecondValue,ans;
                firstValue=Integer.parseInt(etFirstValue.getText().toString());
                SecondValue = Integer.parseInt(etSecondValue.getText().toString());

                ans=firstValue-SecondValue;
                tvAns.setText("Ans is = "+ans);
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstValue,SecondValue,ans;
                firstValue=Integer.parseInt(etFirstValue.getText().toString());
                SecondValue = Integer.parseInt(etSecondValue.getText().toString());

                ans=firstValue*SecondValue;
                tvAns.setText("Ans is = "+ans);
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstValue,SecondValue,ans;
                firstValue=Integer.parseInt(etFirstValue.getText().toString());
                SecondValue = Integer.parseInt(etSecondValue.getText().toString());

                ans=firstValue/SecondValue;
                tvAns.setText("Ans is = "+ans);
            }
        });
    }
}