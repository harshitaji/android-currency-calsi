package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
EditText edt;
Button euro;
Button pounds;
Button dirham;
Button bitCoin;
Button ausDollar;
Button canDollar;
Button yen;
Button ruble;
TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt=findViewById(R.id.editText);
        tv=findViewById(R.id.textView);
        euro=findViewById(R.id.euro);
        euro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value=edt.getText().toString();
                if(value.isEmpty()){
                    edt.setError("NO INPUT");
                }
                else{
                    double k;
                            tv.setText(null);
                    k=0.012*Double.parseDouble(value);
                    DecimalFormat decimalFormat=new DecimalFormat("#.00");
                    tv.setText("€ "+decimalFormat.format(k));
                }
            }
        });



        pounds=findViewById(R.id.pounds);
        pounds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value=edt.getText().toString();
                if(value.isEmpty()){
                    edt.setError("NO INPUT");
                }
                else{
                    double k;
                    tv.setText("");
                    k=0.011*Double.parseDouble(value);
                    DecimalFormat decimalFormat=new DecimalFormat("#.00");
                    tv.setText("£ "+decimalFormat.format(k));
                }
            }
        });
        yen=findViewById(R.id.yen);
        yen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value=edt.getText().toString();
                if(value.isEmpty()){
                    edt.setError("NO INPUT");
                }
                else{
                    double k;
                    tv.setText(null);
                    k=1.45*Double.parseDouble(value);
                    DecimalFormat decimalFormat=new DecimalFormat("#.00");
                    tv.setText("¥ "+decimalFormat.format(k));
                }
            }
        });




        canDollar=findViewById(R.id.candollar);
        canDollar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value=edt.getText().toString();
                if(value.isEmpty()){
                    edt.setError("NO INPUT");
                }
                else{
                    double k;
                    tv.setText(null);
                    k=0.018*Double.parseDouble(value);
                    DecimalFormat decimalFormat=new DecimalFormat("#.00");
                    tv.setText("CAN$ "+decimalFormat.format(k));
                }
            }
        });

        ausDollar=findViewById(R.id.ausDollar);
        ausDollar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value=edt.getText().toString();
                if(value.isEmpty()){
                    edt.setError("NO INPUT");
                }
                else{
                    double k;
                    tv.setText(null);
                    k=0.019*Double.parseDouble(value);
                    DecimalFormat decimalFormat=new DecimalFormat("#.00");
                    tv.setText("AUS$ "+decimalFormat.format(k));
                }
            }
        });



        dirham=findViewById(R.id.dhirham);
        dirham.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value=edt.getText().toString();
                if(value.isEmpty()){
                    edt.setError("NO INPUT");
                }
                else{
                    double k;
                    tv.setText(null);
                    k=0.049*Double.parseDouble(value);
                    DecimalFormat decimalFormat=new DecimalFormat("#.00");
                    tv.setText("  د.إ"+decimalFormat.format(k));
                }
            }
        });

        bitCoin=findViewById(R.id.bitcoin);
        bitCoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value=edt.getText().toString();
                if(value.isEmpty()){
                    edt.setError("NO INPUT");
                }
                else{
                    double k;
                    tv.setText(null);
                    k=0.0000014*Double.parseDouble(value);
                    DecimalFormat decimalFormat=new DecimalFormat("#.00");
                    tv.setText("₿ "+decimalFormat.format(k));
                }
            }
        });
        ruble=findViewById(R.id.ruble);
        euro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value=edt.getText().toString();
                if(value.isEmpty()){
                    edt.setError("NO INPUT");
                }
                else{
                    double k;
                    tv.setText(null);
                    k=0.91*Double.parseDouble(value);
                    DecimalFormat decimalFormat=new DecimalFormat("#.00");
                    tv.setText("₽ "+decimalFormat.format(k));
                }
            }
        });
       /* dot=findViewById(R.id.dot);
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value=edt.getText().toString();
                tv.setText(value+".");

            }
        });*/


    }
}
