package com.org.minions.repositery;

import com.org.minions.model.MinionsMode;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MinionsRepositery extends MongoRepository<MinionsMode,Integer> {
    MinionsMode findByCharacters(String  characters);
}
