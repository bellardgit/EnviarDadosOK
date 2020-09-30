package com.example.enviardados;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnEnviar=(Button)findViewById(R.id.cmdEnviarDados);
        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Usuario usuario = new Usuario("Rogerio", "rogerio@gmail.com");
                Intent intent = new Intent(MainActivity.this, SegundaActivity.class);
               // intent.putExtra("nome", "jose");
               // intent.putExtra("idade", 45);
               //para que eu possa enviar um objeto via Extras eu devo primeiro
               //transformar minha classe Usuario em uma classe serilizavel.
                intent.putExtra("objeto", usuario);
                startActivity(intent);

            }
        });
    }
}