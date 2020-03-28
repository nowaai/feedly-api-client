package client.usecase;

import client.entity.Collection;
import client.fetcher.CollectionFetcher;
import client.repository.CollectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class FeedUseCase {

    private CollectionRepository collectionRepository;
    private CollectionFetcher collectionFetcher;

    @Autowired
    public FeedUseCase(CollectionRepository collectionRepository, CollectionFetcher collectionFetcher) {
        this.collectionRepository = collectionRepository;
        this.collectionFetcher = collectionFetcher;
    }

    public void refreshFeedList() {
        List<Collection> myCollections = collectionFetcher.fetchAll();
        collectionRepository.deleteAll(myCollections);
        collectionRepository.saveAll(myCollections);
    }

}
