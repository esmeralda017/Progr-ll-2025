package com.ugb.primeraaplicacion;
<<<<<<< HEAD

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
=======
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
>>>>>>> 45cdc74 (opciones de Suma resta multoplicion y divicion)
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button btn;
    TextView tempVal;
<<<<<<< HEAD

=======
    RadioGroup rgb;
    RadioButton opt;
>>>>>>> 45cdc74 (opciones de Suma resta multoplicion y divicion)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
<<<<<<< HEAD
=======

>>>>>>> 45cdc74 (opciones de Suma resta multoplicion y divicion)
        btn = findViewById(R.id.btnCalcular);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tempVal = findViewById(R.id.txtNum1);
                double num1 = Double.parseDouble(tempVal.getText().toString());
<<<<<<< HEAD
                tempVal = findViewById(R.id.txtNum2);
                double num2 = Double.parseDouble(tempVal.getText().toString());
                double respuesta = num1 + num2;
                tempVal = findViewById(R.id.lblRespuesta);
                tempVal.setText("Respuesta: " + respuesta);
=======

                tempVal = findViewById(R.id.txtNum2);
                double num2 = Double.parseDouble(tempVal.getText().toString());

                double respuesta = 0.0;

                opt = findViewById(R.id.optSuma);
                if (opt.isChecked()) {
                    respuesta = num1 + num2;
                }
                opt = findViewById(R.id.optResta);
                if (opt.isChecked()) {
                    respuesta = num1 - num2;
                }
                opt = findViewById(R.id.optMultiplicacion);
                if (opt.isChecked()) {
                    respuesta = num1 * num2;
                }
                opt = findViewById(R.id.optDivision);
                if (opt.isChecked()) {
                    respuesta = num1 / num2;
                }
                tempVal = findViewById(R.id.lblRespuesta);
                tempVal.setText("Respuesta: "+ respuesta);
>>>>>>> 45cdc74 (opciones de Suma resta multoplicion y divicion)
            }
        });
    }
}