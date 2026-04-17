package com.example.demo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class prueba2 extends AppCompatActivity {

    EditText etNumero;
    Button btnCalcular;
    TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prueba2);

        etNumero = findViewById(R.id.etNumero);
        btnCalcular = findViewById(R.id.btnCalcular);
        tvResultado = findViewById(R.id.tvResultado);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String valor = etNumero.getText().toString();

                if (valor.isEmpty()) {
                    tvResultado.setText("Ingresa un número");
                    return;
                }

                int numero = Integer.parseInt(valor);

                if (numero % 2 == 0) {
                    tvResultado.setText("El número es PAR");
                } else {
                    tvResultado.setText("El número es IMPAR");
                }
            }
        });
    }
}