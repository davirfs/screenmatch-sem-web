package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.exceptions.ErroDeConversaoDeAnoException;
import br.com.alura.screenmatch.modelos.Titulo;
import br.com.alura.screenmatch.modelos.TituloOMDB;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);

        List<Titulo> listaDeTitulos = new ArrayList<>();

        String filme = " ";

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        while (!filme.equalsIgnoreCase("Sair")) {
            System.out.println("Digite um filme para busca: ");
            filme = scanner.nextLine();

            if (filme.equalsIgnoreCase("Sair")) {
                break;
            }

            String endereco = "https://www.omdbapi.com/?t=" + filme.replace(" ", "+") + "&apikey=7db055dc";
            System.out.println(endereco);

            try {
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(endereco))
                        .build();
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                String json = response.body();
                System.out.println(json);

                TituloOMDB meuTituloOMDB = gson.fromJson(json, TituloOMDB.class);
                System.out.println(meuTituloOMDB);

                Titulo meuTitulo = new Titulo(meuTituloOMDB);
                System.out.println(meuTitulo);

                listaDeTitulos.add(meuTitulo);

            } catch (NumberFormatException e) {
                System.out.println("ERRO: ");
                System.out.println(e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("Erro de argumento na busca. Verifique o endereço corretamente.");
            } catch (ErroDeConversaoDeAnoException e) {
                System.out.println(e.getMessage());
            }
        }

        for (Titulo f : listaDeTitulos) {
            System.out.println(f);
        }

        FileWriter fileWriter = new FileWriter("Titulos.JSON");
        fileWriter.write(gson.toJson(listaDeTitulos));
        fileWriter.close();

        System.out.println("O programa finalizou corretamente!");

    }
}
