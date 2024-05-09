import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

public class ConsultarMonedas {
    private List<String> consultas = new ArrayList<>();
    private int numeroDeConsultas = 1;

    public int getNumeroDeConsultas() {
        return numeroDeConsultas;
    }

    public List<String> getConsultas() {
        return consultas;
    }
    void divisa(String base_code, String target_code, double cantidad) throws IOException, InterruptedException {
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/96eab3c3a618eafe1671ffc9/pair/" +
                base_code + "/" + target_code + "/" +cantidad);
        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();

        Gson gson = new Gson();
        MonedasApi miMonedaApi =  gson.fromJson(json, MonedasApi.class);
        Monedas miMoneda = new Monedas(miMonedaApi, cantidad);

        double resultado = miMonedaApi.conversion_result();

        String consulta = "Consulta n° " + numeroDeConsultas + ": " + cantidad + " [" + base_code + "]" +
                " es igual a " + resultado + " [" + target_code + "]";
        consultas.add(consulta);

        System.out.println(miMoneda);


        numeroDeConsultas ++;

    }
}

