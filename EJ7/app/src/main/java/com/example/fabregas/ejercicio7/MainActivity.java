package com.example.fabregas.ejercicio7;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int a, b, resultado;
    private EditText operandoA, operandoB;
    private Button ok;
    private Spinner opcion;
    private TextView res;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        operandoA = (EditText) findViewById(R.id.operandoA);
        operandoB = (EditText) findViewById(R.id.operandoB);
        ok = (Button) findViewById(R.id.aceptar);
        opcion = (Spinner) findViewById(R.id.opciones);
        res = (TextView) findViewById(R.id.resultado);




    }

    public void lanzar(View v){

        this.a = Integer.parseInt(operandoA.getText().toString());
        this.b = Integer.parseInt(operandoB.getText().toString());
        
        String op = opcion.getSelectedItem().toString();
        switch(op){
            case "Suma":
                resultado = a + b;
                break;
            case "Resta":
                resultado = a - b;
                break;
            case "Multiplicacion":
                resultado = a * b;
                break;
            case "Division":
                resultado = a / b;
        }
        res.setText(String.valueOf(resultado));
    }

}
