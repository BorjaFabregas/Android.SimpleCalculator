package com.example.fabregas.ejercicio7;

import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

/**
 * Created by Fabregas on 18/10/16.
 */

public class Controlador {

    private int a, b;
    private EditText operandoA, operandoB;
    private Button ok;
    private Spinner opcion;

    public void lanzar(){

        this.a = Integer.parseInt(operandoA.getText().toString());
        this.b = Integer.parseInt(operandoB.getText().toString());



    }

}
