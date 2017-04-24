package com.example.maryvianneybrion.sampleforgit_042417;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtName;
    EditText edtName;
    Button btnSubmit,btnClear;
    String kiminonawa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        edtName = (EditText) findViewById(R.id.editTextName);
        txtName = (TextView) findViewById(R.id.textViewHello);
        btnSubmit = (Button) findViewById(R.id.buttonSubmit);
        btnClear = (Button)findViewById(R.id.buttonClear);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kiminonawa = edtName.getText().toString();
                txtName.setText(kiminonawa);
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtName.setText("");
            }
        });
    }
}
