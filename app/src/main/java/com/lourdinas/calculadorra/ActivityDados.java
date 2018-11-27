package com.lourdinas.calculadorra;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.lourdinas.calculadorra.ActivityLogin;
import com.lourdinas.calculadorra.MainActivity;
import com.lourdinas.calculadorra.R;

public class ActivityDados extends AppCompatActivity {

    TextView nome, idade, endereco, nascimento, sexo;

    Button inicio, calcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dados);

        nome = (TextView)findViewById(R.id.Name);
        idade = (TextView)findViewById(R.id.Idade);
        endereco = (TextView)findViewById(R.id.Endereço);
        nascimento = (TextView)findViewById(R.id.Nascimento);
        sexo = (TextView)findViewById(R.id.Sexo);

        inicio = (Button)findViewById(R.id.Inicio);
        calcular = (Button)findViewById(R.id.Calculadora);

        final Intent intentRecbido = getIntent();
        final String tNome = intentRecbido.getStringExtra("nome");
        final String tIdade = intentRecbido.getStringExtra("idade");
        final String tEndereco = intentRecbido.getStringExtra("endereco");
        final String tNascimento = intentRecbido.getStringExtra("nascimento");
        final String tSexo = intentRecbido.getStringExtra("sexo");

        nome.setText(tNome);
        idade.setText(tIdade);
        endereco.setText(tEndereco);
        nascimento.setText(tNascimento);
        sexo.setText(tSexo);

        inicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityDados.this, ActivityLogin.class);
                startActivity(intent);
                finish();
            }
        });

        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityDados.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}