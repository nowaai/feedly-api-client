package client.converter;

import client.entity.Collection;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

@Component
public class CollectionConverter {

    private final ObjectMapper mapper;

    public CollectionConverter(ObjectMapper mapper) {
        this.mapper = mapper;
    }

    public Collection fromJsonString(String json) throws IOException {
        return this.mapper.readValue(json, Collection.class);
    }

    public List<Collection> fromJsonArrayString(String json) throws IOException {
        return this.mapper.readValue(json, new TypeReference<List<Collection>>() {
        });
    }

}
