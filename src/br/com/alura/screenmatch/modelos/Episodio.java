package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificavel;

public class Episodio extends Titulo implements Classificavel {
    private int numero;
    private String nome;
    private Serie serie;
    private int totalVisualizacoes;

    public Episodio(TituloOMDB tituloOMDB) {
        super(tituloOMDB);
    }


    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    @Override
    public int getClassificacao() {
        if (totalVisualizacoes > 100) {
            return 4;
        } else {
            return 2;
        }
    }

    @Override
    public String toString() {
        return "Episodio" +
                "Numero do episódio: " + numero + "\n" +
                "Nome do episódio: " + nome + "\n" +
                "Série: " + serie + "\n" +
                "Total de visualizações: " + totalVisualizacoes;
    }
}
