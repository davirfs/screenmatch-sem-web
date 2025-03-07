//package br.com.alura.screenmatch.principal;
//
//import br.com.alura.screenmatch.modelos.Episodio;
//import br.com.alura.screenmatch.modelos.Filme;
//import br.com.alura.screenmatch.modelos.Serie;
//import br.com.alura.screenmatch.modelos.Titulo;
//
//import java.util.*;
//
//public class PrincipalComListas {
//    public static void main (String [] args){
//        Filme favorito = new Filme("The Matrix", 1999);
//        favorito.avalia(9);
//
//        Filme outro = new Filme("John Wick", 2014);
//        outro.avalia(6);
//
//        var filmeDoPaulo = new Filme("Dogville",2003);
//        filmeDoPaulo.avalia(10);
//
//        Serie serie = new Serie("Lost", 2000);
//
//
//        ArrayList<Titulo> lista = new ArrayList<>();
//        lista.add(filmeDoPaulo);
//        lista.add(favorito);
//        lista.add(outro);
//        lista.add(serie);
//
//        for (Titulo titulo : lista){
//            System.out.println(titulo.getNome());
//            if (titulo instanceof Filme filme && filme.getClassificacao() > 2) {
//                System.out.println("Classificação: " + filme.getClassificacao());
//            }
//        }
//
//        ArrayList<String> buscaPorArtista = new ArrayList<>();
//        buscaPorArtista.add("Adam Sandler");
//        buscaPorArtista.add("Paulo");
//        buscaPorArtista.add("Jacqueline");
//
//        System.out.println(buscaPorArtista);
//        Collections.sort(buscaPorArtista);
//        System.out.println(buscaPorArtista);
//
//        Collections.sort(lista);
//        System.out.println(lista);
//
//        lista.sort(Comparator.comparing(Titulo :: getAnoDeLancamento));
//        System.out.println(lista);
//    }
//}
