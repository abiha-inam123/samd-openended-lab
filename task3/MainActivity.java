package com.example.task3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Float result;
        String num1, num2;
        EditText TextNumber;
        EditText TextNumber2;
        Spinner spinner1;
        Button calbutton1;
        Button resetbutton2;
        TextView textView;
        TextNumber = (EditText) findViewById(R.id.editTextNumber);
        TextNumber2 = (EditText) findViewById(R.id.editTextNumber2);
        textView = (TextView) findViewById(R.id.textView);
        spinner1 = (Spinner) findViewById(R.id.spinner);
        calbutton1 = findViewById(R.id.button2);
        resetbutton2 = findViewById(R.id.button7);
        calbutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a, b;
                float result_number;
                if (TextUtils.isEmpty(TextNumber.getText().toString())) {
                    Toast.makeText(MainActivity.this, "Kindly Enter First Number",
                            Toast.LENGTH_SHORT).show();
                } else if (TextUtils.isEmpty(TextNumber2.getText().toString())) {
                    Toast.makeText(MainActivity.this, "Kindly Enter Second Number", Toast.LENGTH_SHORT).show();
                } else if (spinner1.getSelectedItemId() == 0) {
                    a = Integer.parseInt(TextNumber.getText().toString());
                    b = Integer.parseInt(TextNumber2.getText().toString());
                    result_number = a + b;
                    textView.setText(String.valueOf(result_number));
                } else if (spinner1.getSelectedItemId() == 1) {
                    a = Integer.parseInt(TextNumber.getText().toString());
                    b = Integer.parseInt(TextNumber2.getText().toString());
                    result_number = a - b;
                    textView.setText(String.valueOf(result_number));
                } else if (spinner1.getSelectedItemId() == 2) {
                    a = Integer.parseInt(TextNumber.getText().toString());
                    b = Integer.parseInt(TextNumber2.getText().toString());
                    result_number = a * b;
                    textView.setText(String.valueOf(result_number));
                } else if (spinner1.getSelectedItemId() == 3) {
                    a = Integer.parseInt(TextNumber.getText().toString());
                    b = Integer.parseInt(TextNumber2.getText().toString());
                    result_number = a / b;
                    textView.setText(String.valueOf(result_number));
                } else
                    textView.setText("Error");
            }
        });
        resetbutton2.setOnClickListener(new View.OnClickListener() {
            @Override

            public void
            onClick(View
                            v) {
                TextNumber.setText("");
                TextNumber2.setText("");
                textView.setText("");
            }
        });
    }
}
