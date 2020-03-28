package client.infrastructure;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

@Component
public class RestClient {

    @Autowired
    private Environment env;

    @Value("${feedly.auth.access_token}")
    private String accessToken;

    private final HttpClient httpClient;

    public RestClient() {
        this.httpClient = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_1_1)
                .connectTimeout(Duration.ofSeconds(20))
                .build();
    }

    public String request(String url) throws RestClientException {

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .header("Authorization", "OAuth " + this.accessToken)
                .build();

        HttpResponse<String> response;

        try {
            response = this.httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            throw new RestClientException(e);
        }

        try {
            if (response.statusCode() == 200) {
                return response.body();
            } else {
                String msg = "Status code " + response.statusCode();
                throw new ResponseStatusException(msg);
            }
        } catch (ResponseStatusException e) {
            throw new RestClientException(e);
        }

    }
}
