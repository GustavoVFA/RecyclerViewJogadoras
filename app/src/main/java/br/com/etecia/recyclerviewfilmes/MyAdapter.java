package br.com.etecia.recyclerviewfilmes;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private Context mContexto;
    private List<Filmes> lstFilmes;

    //criando o construtor da classe com parâmetros


    public MyAdapter(Context mContexto, List<Filmes> lstFilmes) {
        this.mContexto = mContexto;
        this.lstFilmes = lstFilmes;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view;

        LayoutInflater inflater = LayoutInflater.from(mContexto);
        view = inflater.inflate(R.layout.modelo_filmes, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, @SuppressLint("RecyclerView") int position) {

        holder.idNomeJogadoras.setText(lstFilmes.get(position).getNomeJogadoras());
        holder.idImagemJogadoras.setImageResource(lstFilmes.get(position).getImagemJogadoras());

        holder.idCardJogadoras.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(mContexto, ApresentaFilmeActivity.class);

                intent.putExtra("Titulo", lstFilmes.get(position).getNomeJogadoras());
                intent.putExtra("Descricao", lstFilmes.get(position).getTimes());
                intent.putExtra("Categoria", lstFilmes.get(position).getTitulos());
                intent.putExtra("ImagemFilme", lstFilmes.get(position).getImagemJogadoras());

                mContexto.startActivity(intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK));

            }
        });

    }

    @Override
    public int getItemCount() {
        return lstFilmes.size();
    }

    //criar a classe ViewHolder
    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView idNomeJogadoras;
        ImageView idImagemJogadoras;
        CardView idCardJogadoras;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            idNomeJogadoras = itemView.findViewById(R.id.idNomeJogadoras);
            idImagemJogadoras = itemView.findViewById(R.id.idImgJogadoras);
            idCardJogadoras = itemView.findViewById(R.id.idCardJogadoras);
        }
    }
}
