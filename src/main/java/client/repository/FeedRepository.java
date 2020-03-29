package client.repository;

import client.entity.Collection;
import client.entity.Feed;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FeedRepository extends CrudRepository<Feed, Long> {
    List<Feed> findByLanguageAndWebsite(String language, String website);

    List<Feed> findByWebsite(String website);
}
