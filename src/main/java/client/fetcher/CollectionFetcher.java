package client.fetcher;

import client.converter.CollectionConverter;
import client.entity.Collection;
import client.entity.Feed;
import client.infrastructure.RestClient;
import client.infrastructure.RestClientException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CollectionFetcher {

    private final RestClient restClient;
    private final CollectionConverter collectionConverter;

    @Value("${feedly.endpoint.collections}")
    private String collectionsURL;

    public CollectionFetcher(RestClient restClient, CollectionConverter collectionConverter) {
        this.restClient = restClient;
        this.collectionConverter = collectionConverter;
    }

    public List<Collection> fetchAll() {

        String collectionsString = null;
        List<Collection> collections = null;

        try {
            collectionsString = restClient.request(collectionsURL);
        } catch (RestClientException e) {
            e.printStackTrace();
        }

        try {
            collections = collectionConverter.fromJsonArrayString(collectionsString);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return collections;

    }

}
