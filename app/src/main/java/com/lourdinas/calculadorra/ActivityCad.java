package com.lourdinas.calculadorra;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ActivityCad extends AppCompatActivity {

    EditText nome, idade, endereco, nascimento, sexo;
    Button salvar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cad);

        nome = (EditText) findViewById(R.id.Name);
        idade = (EditText) findViewById(R.id.Idade);
        nascimento = (EditText) findViewById(R.id.Nascimento);
        endereco = (EditText) findViewById(R.id.Endereço);
        sexo = (EditText) findViewById(R.id.Sexo);

        salvar = (Button) findViewById(R.id.Salvar);

        Intent intentRecbido = getIntent();
        final String name = intentRecbido.getStringExtra("nome");

        nome.setText(name);

        salvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityCad.this, ActivityDados.class);
                intent.putExtra("nome", nome.getText().toString());
                intent.putExtra("idade", idade.getText().toString());
                intent.putExtra("nascimento", nascimento.getText().toString());
                intent.putExtra("endereco", endereco.getText().toString());
                intent.putExtra("sexo", sexo.getText().toString());
                startActivity(intent);
                finish();
            }
        });
    }
}