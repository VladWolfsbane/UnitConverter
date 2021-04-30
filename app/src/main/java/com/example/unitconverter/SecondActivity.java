package com.example.unitconverter;

import android.content.Intent;
import android.graphics.Color;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button kbutton, sbutton2;
        final EditText kET;
        final TextView kTV;

        kbutton= (Button) findViewById(R.id.buttonM_K);
        kET=(EditText) findViewById(R.id.editText2);
        kTV=(TextView) findViewById(R.id.textView2);

        kbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double convert= Double.parseDouble(kET.getText().toString());
                kTV.setText(String.valueOf(convert*1.60934));
                kTV.setTextColor(Color.RED);
            }
        });

        sbutton2= (Button) findViewById(R.id.swapButton2);
        sbutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFirstActivity();
            }
        });
    }

    public void openFirstActivity(){
        Intent intent2 = new Intent(this, MainActivity.class);
        startActivity(intent2);
    }
}