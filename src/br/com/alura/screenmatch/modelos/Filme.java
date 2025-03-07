package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String diretor;

    public Filme(TituloOMDB tituloOMDB) {
        super(tituloOMDB);
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) getSomaDasAvaliacoes() / 2;
    }

    @Override
    public String toString() {
        return getNome() + " (" + getAnoDeLancamento() + ")";
    }
}



