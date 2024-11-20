package com.rafayet.journalApp.repository;

import com.rafayet.journalApp.entity.JournalEntry;
import com.rafayet.journalApp.entity.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, ObjectId> {

    User findByUserName(String userName);
}



//Pathways of calling
//controller ---> service -----> repository