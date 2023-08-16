package br.com.etecia.recyclerviewfilmes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.appbar.MaterialToolbar;

public class ApresentaFilmeActivity extends AppCompatActivity {

    TextView mNomeJogadoras, mTimes, mTitulos;
    ImageView mImagemJogadoras;
    Button btnVoltar;

    MaterialToolbar idToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.apresenta_filme_layout);

        mNomeJogadoras = findViewById(R.id.mNomeJogadoras);
        mTimes = findViewById(R.id.mTimes);
        mTitulos = findViewById(R.id.mTitulos);
        mImagemJogadoras = findViewById(R.id.mImagemJogadoras);
        btnVoltar = findViewById(R.id.btnVoltar);

        idToolbar = findViewById(R.id.idToolBar);

        //Clique o botão na toolbar
        idToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
            }
        });


        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
            }
        });

        //Declarando intent para receber valor
        Intent intent = getIntent();
        //Declarando as variáveis que irão receber o valor
        String nomeJogadoras, times, titulos;
        int imagemJogadoras;

        nomeJogadoras = intent.getExtras().getString("mNomeJogadoras:");
        times = intent.getExtras().getString("mTitulos");
        titulos = intent.getExtras().getString("mTimes");

        imagemJogadoras = intent.getExtras().getInt("mImagemJogadoras");

        mNomeJogadoras.setText(nomeJogadoras);
        mTimes.setText(times);
        mTitulos.setText(titulos);
        mImagemJogadoras.setImageResource(imagemJogadoras);

    }
}