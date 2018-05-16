package com.example.arnoldo.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edt1,edt2;//especifico el nombre de los editext donde se almasenaran los datos obtenidos
    // por la interfaz
    int Resultado;//creo una bariable para plasmar el resultado en pantalla


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt1= findViewById(R.id.edtNum1);//asocio las cajas de texto para obtener los datos
        edt2=findViewById(R.id.edtNum2);
       //lo asocio para programar el evento clik
        Button btnResta=findViewById(R.id.btnResta);
        Button btnSuma=findViewById(R.id.btnSuma);
        final ClaseGenerica<Integer> Numeros=new ClaseGenerica<>();
        btnSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numero_1=Integer.parseInt(edt1.getText().toString());//combierto los datos de la interfaz de tipo string a enteros
                int numero_2=Integer.parseInt(edt2.getText().toString());
               //instancio la clase generica
                //y le especifico con que tipo de dato quiero trabajar dentro de
                Numeros.setNumero(numero_1);//Envio los numeros a la clase genrica
                Numeros.setNumero2(numero_2);
                int numero1=Numeros.getNumero();//obtengo los numeros atraves del metodo get de la clase generica
                int numero2=Numeros.getNumero2();
               Resultado=numero1+numero2;


           //imprimo en patalla los resultados obtenidos de dicha operacion
                Toast.makeText(MainActivity.this, "Resultado es;" + Resultado, Toast.LENGTH_SHORT).show();
            }
        });

       btnResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               int numero_1=Integer.parseInt(edt1.getText().toString());
               int numero_2=Integer.parseInt(edt2.getText().toString());
               Numeros.setNumero(numero_1);
               Numeros.setNumero2(numero_2);
                int numero1=Numeros.getNumero();
                int numero2=Numeros.getNumero2();
                Resultado=numero1-numero2;
               Toast.makeText(MainActivity.this, "Resultado es;" + Resultado, Toast.LENGTH_SHORT).show();

            }
        });
    }
}
