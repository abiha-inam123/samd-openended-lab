package com.example.samdopenended;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        String name = intent.getStringExtra("_name");
        String enrol= intent.getStringExtra("_enrol");
        String mark1 = intent.getStringExtra("english");
        String mark2 = intent.getStringExtra("Urdu");
        String mark3 = intent.getStringExtra("Maths");
        String mark4 = intent.getStringExtra("PakistanStudies");
        String mark5 = intent.getStringExtra("Science");

        TextView textView= (TextView)findViewById(R.id.name1);
        textView.setText(name);

        TextView textView2= (TextView)findViewById(R.id.enrol1);
        textView2.setText(enrol);

        TextView textView3= (TextView)findViewById(R.id.eng1);
        textView3.setText(mark1);

        TextView textView4= (TextView)findViewById(R.id.urdu1);
        textView4.setText(mark2);

        TextView textView5= (TextView)findViewById(R.id.maths1);
        textView5.setText(mark3);

        TextView textView6= (TextView)findViewById(R.id.pst1);
        textView6.setText(mark4);

        TextView textView7= (TextView)findViewById(R.id.sci1);
        textView7.setText(mark5);
    }
}