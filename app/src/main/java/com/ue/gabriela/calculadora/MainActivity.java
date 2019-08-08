package com.ue.gabriela.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView v1;
    private TextView v2;
    private Button btnSoma;
    private Button btnSub;
    private Button btnMult;
    private Button btnDiv;
    private TextView resultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        v1 = (EditText) findViewById(R.id.v1);
        v2 = (EditText) findViewById(R.id.v2);
        btnSoma = (Button) findViewById(R.id.btnSomaId);
        btnSub = (Button) findViewById(R.id.btnSubId);
        btnMult = (Button) findViewById(R.id.btnMultId);
        btnDiv = (Button) findViewById(R.id.btnDivId);
        resultado = (TextView) findViewById(R.id.resultado);

        btnSoma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String n1 = v1.getText().toString();
                String n2 = v2.getText().toString();

                double val1 = Double.parseDouble(n1);
                double val2 = Double.parseDouble(n2);

                double result = val1 + val2;

                resultado.setText("A operação escolhida foi Soma e o valor é:" + result);

            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String n1 = v1.getText().toString();
                String n2 = v2.getText().toString();

                double val1 = Double.parseDouble(n1);
                double val2 = Double.parseDouble(n2);

                double result = val1 - val2;

                resultado.setText("A operação escolhida foi Subtração e o valor é:" + result);

            }
        });

        btnMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String n1 = v1.getText().toString();
                String n2 = v2.getText().toString();

                double val1 = Double.parseDouble(n1);
                double val2 = Double.parseDouble(n2);

                double result = val1 * val2;

                resultado.setText("A operação escolhida foi Multiplicação e o valor é:" + result);

            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String n1 = v1.getText().toString();
                String n2 = v2.getText().toString();

                double val1 = Double.parseDouble(n1);
                double val2 = Double.parseDouble(n2);

                double result = val1 / val2;

                resultado.setText("A operação escolhida foi Divisão e o valor é:" + result);

            }
        });

        Log.d("Calculadora", "O app está no onCreate");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Calculadora", "O app está no onStart");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Calculadora", "O app está no onResume");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Calculadora", "O app está no onPause");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Calculadora", "O app está no onStop");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Calculadora", "O app está no onRestart");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Calculadora", "O app está no onDestroy");

    }
}