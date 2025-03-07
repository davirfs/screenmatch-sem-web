package br.com.alura.screenmatch;

import br.com.alura.screenmatch.model.DadosSerieModel;
import br.com.alura.screenmatch.service.ConsumoApiService;
import br.com.alura.screenmatch.service.ConverteDadosService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ScreenmatchApplication.class, args);

    }

    @Override
    public void run(String... args) throws Exception {
        ConsumoApiService consumoApiService = new ConsumoApiService();
        var json = consumoApiService.obterDados("https://www.omdbapi.com/?t=gilmore+girls&apikey=7db055dc");
//        System.out.println(json);
//        json = consumoApiService.obterDados("https://coffee.alexflipnote.dev/random.json");
        System.out.println(json);
        ConverteDadosService converteDadosService = new ConverteDadosService();
        DadosSerieModel dadosSerieModel = converteDadosService.obterDados(json, DadosSerieModel.class);
        System.out.println(dadosSerieModel);
    }
}
