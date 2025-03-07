//package br.com.alura.screenmatch.principal;
//
//import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
//import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
//import br.com.alura.screenmatch.modelos.Episodio;
//import br.com.alura.screenmatch.modelos.Filme;
//import br.com.alura.screenmatch.modelos.Serie;
//
//import java.util.ArrayList;
//
//public class Principal{
//    public static void main(String [] args){
//        Filme favorito = new Filme("The Matrix", 1999);
//        favorito.setDuracaoEmMinutos(135);
//        favorito.setIncluidoNoPlano(true);
//
//        Filme outro = new Filme("John Wick", 2014);
//        outro.setDuracaoEmMinutos(101);
//        outro.setIncluidoNoPlano(true);
//
//        Serie serie = new Serie("Lost", 2000);
//        serie.setIncluidoNoPlano(true);
//        serie.setAtiva(true);
//        serie.setTemporadas(5);
//        serie.setEpisodiosPorTemporada(10);
//        serie.setMinutosPorEpisodio(45);
//
//        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
//        calculadora.inclui(favorito);
//        calculadora.inclui(outro);
//        calculadora.inclui(serie);
//
//        System.out.println("Tempo total: " + calculadora.getTempoTotal());
//
//        FiltroRecomendacao filtro = new FiltroRecomendacao();
//        filtro.filtra(favorito);
//
//        Episodio episodio = new Episodio("Lost", 2000);
//        episodio.setNumero(1);
//        episodio.setSerie(serie);
//        episodio.setTotalDeAvaliacoes(300);
//        filtro.filtra(episodio);
//
//        var filmeDoPaulo = new Filme("Dodville",2003);
//        filmeDoPaulo.setDuracaoEmMinutos(200);
//        filmeDoPaulo.avalia(10);
//
//        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
//        listaDeFilmes.add(filmeDoPaulo);
//        listaDeFilmes.add(favorito);
//        listaDeFilmes.add(outro);
//
//        System.out.println("Tamanho da lista: " + listaDeFilmes.size() + " filmes");
//        System.out.println("Primeiro filme: " + listaDeFilmes.get(0).getNome() + " (" + listaDeFilmes.get(0).getAnoDeLancamento() + ")");
//        System.out.println("ToString do filme: " + listaDeFilmes.get(0).toString());
//
//        for(Filme filme : listaDeFilmes){
//            System.out.println(filme);
//        }
//
//    }
//}