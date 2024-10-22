package com.srinivas.journalapp.Repository;

import com.srinivas.journalapp.Entity.ConfigJournalEntity;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface configJournalRepository extends MongoRepository<ConfigJournalEntity, ObjectId> {
}
