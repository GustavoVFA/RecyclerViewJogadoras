package br.com.etecia.recyclerviewfilmes;

public class Filmes {
    private String NomeJogadoras;
    private String Times;
    private String Titulos;
    private int imagemJogadoras;

    //criar o construtor com parâmetros alt+insert

    public Filmes(String NomeJogadoras, String Times, String Titulos, int imagemJogadoras) {
        this.NomeJogadoras = NomeJogadoras;
        this.Times = Times;
        this.Titulos = Titulos;
        this.imagemJogadoras = imagemJogadoras;
    }

    //criando os métodos de acesso get and setter


    public String getNomeJogadoras() {
        return NomeJogadoras;
    }

    public void setNomeJogadoras(String nomeJogadoras) {
        NomeJogadoras = nomeJogadoras;
    }

    public String getTimes() {
        return Times;
    }

    public void setTimes(String times) {
        Times = times;
    }

    public String getTitulos() {
        return Titulos;
    }

    public void setTitulos(String titulos) {
        Titulos = titulos;
    }

    public int getImagemJogadoras() {
        return imagemJogadoras;
    }

    public void setImagemJogadoras(int imagemJogadoras) {
        this.imagemJogadoras = imagemJogadoras;
    }
}

