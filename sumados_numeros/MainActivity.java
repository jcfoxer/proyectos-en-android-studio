package com.jcfoxer.sumados_numeros;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    TextView txt_1,txt_2;
    Button btn_1,btn_2,btn_3;

//aca se declaran todas las variables  puse dos textview y tre botones

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        // de aca empiezaza el codigo
        txt_1=(TextView) findViewById(R.id.txt_1);
        txt_2=(TextView) findViewById(R.id.txt_2);

        btn_1=(Button) findViewById(R.id.btn_1);
        btn_2=(Button) findViewById(R.id.btn_2);
        btn_3=(Button) findViewById(R.id.btn_3);

       btn_1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               Toast.makeText(getBaseContext(),"Se a presionado el boton 1", Toast.LENGTH_SHORT).show();
               txt_1.setText("HOLA MUNDO");
           }
       });


        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
           Toast.makeText(getBaseContext(),"Se a presionado el boton 1", Toast.LENGTH_SHORT).show();
           txt_2.setText("como estas");

            }

        });


        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(),"Se a presionado el boton 1", Toast.LENGTH_SHORT).show();

            String StrTexto_1=txt_1.getText().toString();
            String StrTexto_2=txt_2.getText().toString();

                Toast.makeText(getBaseContext(),StrTexto_1 + " @ "+StrTexto_2, Toast.LENGTH_SHORT).show();
              txt_1.setText("");
              txt_2.setText("");


            }
        });


        //aca tertmian el codigo











    }
}