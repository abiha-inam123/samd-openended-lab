package com.example.toast;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClickShowToast(View view) {
        Spinner mySpinner = findViewById(R.id.spinner);
        EditText editText = findViewById(R.id.input);
        long spinnerSelectedItemId = mySpinner.getSelectedItemId();
        int x = 0, y = 0;
        if (spinnerSelectedItemId == 0) {
            x = 500;
            y = 500;
        } else if (spinnerSelectedItemId == 1) {
            x = 250;
            y = 250;
        } else if (spinnerSelectedItemId == 2) {
            x = 100;
            y = 100;
        }
        Toast toast = Toast.makeText(this, editText.getText().toString(),
                Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, x, y);
        toast.show();
    }
}
