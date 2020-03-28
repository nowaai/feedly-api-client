package client.repository;

import client.entity.Collection;
import client.entity.Feed;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface CollectionRepository extends CrudRepository<Collection, Long> {
}
