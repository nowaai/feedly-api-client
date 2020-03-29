package client.usecase;

import client.entity.Collection;
import client.entity.Feed;
import client.fetcher.CollectionFetcher;
import client.repository.CollectionRepository;
import client.repository.FeedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FeedUseCase {

    private FeedRepository feedRepository;

    @Autowired
    public FeedUseCase(FeedRepository feedRepository) {
        this.feedRepository = feedRepository;
    }

}
