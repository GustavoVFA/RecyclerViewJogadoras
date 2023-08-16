package br.com.etecia.recyclerviewfilmes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Filmes> listaFilmes;

    //Declarar o recycler view
    RecyclerView idRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Apresentando o xml para o java
        idRecyclerView = findViewById(R.id.idListaFilmes);

        //Criando a base de dados para carregamento da lista de filmes
        listaFilmes = new ArrayList<>();

        listaFilmes.add(
                new Filmes("Marta",
                        "Ouro, Prata",
                        "Aventura",
                        R.drawable.marta));
        listaFilmes.add(
                new Filmes("Adriana",
                        "Ouro, Prata",
                        "Aventura",
                        R.drawable.adriana));
        listaFilmes.add(
                new Filmes("Andressa",
                        "Ouro, Prata",
                        "Aventura",
                        R.drawable.andressa));
        listaFilmes.add(
                new Filmes("Angelina",
                        "Ouro, Prata",
                        "Aventura",
                        R.drawable.angelina));
        listaFilmes.add(
                new Filmes("Aninha",
                        "Ouro, Prata",
                        "Aventura",
                        R.drawable.aninha));
        listaFilmes.add(
                new Filmes("Ary Borges",
                        "Ouro, Prata",
                        "Aventura",
                        R.drawable.aryborges));


        //criando a classe adaptadora e passando os parâmetros
        MyAdapter adapter = new MyAdapter(getApplicationContext(), listaFilmes);

        //Tipo de layout de a lista irá seguir
        idRecyclerView.setLayoutManager(new
                GridLayoutManager(
                getApplicationContext(), 2));

        //fixador de tamanho da lista - deixar a lista mais rápida
        idRecyclerView.setHasFixedSize(true);

        //ligar o recyclerview ao adaptador
        idRecyclerView.setAdapter(adapter);
    }
}