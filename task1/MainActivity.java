package com.example.samdopenended;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText name = (EditText)  findViewById(R.id.edname);
        EditText enrol = (EditText)  findViewById(R.id.edenrol);
        EditText mark1 = (EditText)  findViewById(R.id.mark);
        EditText mark2 = (EditText)  findViewById(R.id.mark2);
        EditText mark3 = (EditText)  findViewById(R.id.mark3);
        EditText mark4 = (EditText)  findViewById(R.id.mark4);
        EditText mark5 = (EditText)  findViewById(R.id.mark5);
        String _name = name.getText().toString();
        String _enrol = enrol.getText().toString();
        String _mark1 = mark1.getText().toString();
        String  _mark2 = mark2.getText().toString();
        String  _mark3 = mark3.getText().toString();
        String  _mark4 = mark4.getText().toString();
        String  _mark5 = mark5.getText().toString();
        Button calculate_btn = (Button) findViewById(R.id.cal);
        calculate_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

              grade g1=new grade(_mark1);
              String m1g=g1.Calculate();
              grade g2=new grade(_mark2);
              String m2g=g1.Calculate();
              grade g3=new grade(_mark3);
              String m3g=g1.Calculate();
              grade g4=new grade(_mark4);
              String m4g=g1.Calculate();
              grade g5=new grade(_mark5);
              String m5g=g1.Calculate();

              Intent intent = new Intent(MainActivity.this, MainActivity2.class);
              intent.putExtra("name", _name);
              intent.putExtra("Enrolment", _enrol);
              intent.putExtra("english", m1g);
              intent.putExtra("Urdu", m2g);
              intent.putExtra("Maths", m3g);
              intent.putExtra("PakistanStudies", m4g);
              intent.putExtra("Science", m5g);
              startActivity(intent);
            }

         });
        Button clear_btn = findViewById(R.id.clear);
        clear_btn.setOnClickListener(new View.OnClickListener() {
            @Override

            public void
            onClick(View
                            v) {
                name.setText("");
                enrol.setText("");
                mark1.setText("");
                mark2.setText("");
                mark3.setText("");
                mark4.setText("");
                mark5.setText("");
            }
        });

    }
}