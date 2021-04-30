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

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button mbutton, sbutton1;
        final EditText mET;
        final TextView mTV;

        mbutton= (Button) findViewById(R.id.buttonK_M);
        mET=(EditText) findViewById(R.id.editText1);
        mTV=(TextView) findViewById(R.id.textView1);

        mbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double convert= Double.parseDouble(mET.getText().toString());
                mTV.setText(String.valueOf(convert*0.621371));
                mTV.setTextColor(Color.RED);
            }
        });

        sbutton1= (Button) findViewById(R.id.swapButton1);
        sbutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSecondActivity();
            }
        });
    }

    public void openSecondActivity(){
        Intent intent1 = new Intent(this, SecondActivity.class);
        startActivity(intent1);
    }
}