package com.example.app4;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements  View.OnClickListener {
    private EditText etNum1, etNum2;
    private TextView tvResult;
    private Button btnPlus, btnMinus,btnMultiply,btnDivision;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etNum1 = findViewById(R.id.etNum1);
        etNum2 = findViewById(R.id.etNum2);
        tvResult = findViewById(R.id.tvResult);
        btnPlus = findViewById(R.id.btnPlus);
        btnPlus.setOnClickListener(this);
        btnMinus = findViewById(R.id.btnMinus);
        btnMinus.setOnClickListener(this);
        btnMultiply = findViewById(R.id.btnMultiply);
        btnMultiply.setOnClickListener(this);
        btnDivision = findViewById(R.id.btnDivision);
        btnDivision.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        int num1, num2;
        if (!(etNum1.getText().toString().isEmpty() || etNum2.getText().toString().isEmpty())) {
            num1 = Integer.parseInt(etNum1.getText().toString());
            num2 = Integer.parseInt(etNum2.getText().toString());
            if (view.getId() == R.id.btnPlus) {
                tvResult.setText(String.valueOf(num1 + num2));
            }
            if (view.getId() == R.id.btnMinus) {
                tvResult.setText(String.valueOf(num1 - num2));
            }
            if (view.getId() == R.id.btnMultiply) {
                tvResult.setText(String.valueOf(num1 * num2));
            }
            if (view.getId() == R.id.btnDivision) {
                tvResult.setText(String.valueOf(num1 / num2));
            }

        }
        else{
            tvResult.setText("Please enter numbers");
        }
    }
}