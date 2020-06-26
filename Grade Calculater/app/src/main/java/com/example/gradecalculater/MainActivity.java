package com.example.gradecalculater;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       final EditText x = findViewById(R.id.quizes);
       final EditText y = findViewById(R.id.HW);
       final EditText w = findViewById(R.id.midterms);
       final EditText z = findViewById(R.id.Final);

        Button cal = findViewById(R.id.Calculate);
        Button res = findViewById(R.id.reset);

        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float a = float.parsefloat(x.getText().toString());
                float b = float.parsefloat(y.getText().toString());
                float c = float.parsefloat(w.getText().toString());
                float d = float.parsefloat(z.getText().toString());

                double sum = (a + b + c + d);
                System.out.println(sum);
                




            }
        });


    }
}