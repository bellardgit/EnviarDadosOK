package com.example.enviardados;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SegundaActivity extends AppCompatActivity {
    TextView tvNome, tvIdade, tvEmail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);
        tvNome = (TextView)findViewById(R.id.txtNome);
        tvIdade = (TextView)findViewById(R.id.txtIdade);
        tvEmail = (TextView)findViewById(R.id.txtEmail);

        Bundle dados = getIntent().getExtras();

        String nome = dados.getString("nome");
        int idade = dados.getInt("idade");

        Usuario usuario = (Usuario)dados.getSerializable("objeto");

        //tvNome.setText(nome);
        //tvIdade.setText(String.valueOf(idade));
        tvNome.setText(usuario.getNome());
        tvEmail.setText(usuario.getEmail());
        setTitle("Segunda Activity");

    }

    public static class usuario {

    }
}

