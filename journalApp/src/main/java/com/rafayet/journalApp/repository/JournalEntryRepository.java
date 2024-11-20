package com.rafayet.journalApp.repository;

import com.rafayet.journalApp.entity.JournalEntry;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JournalEntryRepository extends MongoRepository<JournalEntry, ObjectId> {
}



//Pathways of calling
//controller ---> service -----> repository