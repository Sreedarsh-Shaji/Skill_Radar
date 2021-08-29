package com.srusers.srUsers.repository;

import com.srusers.srUsers.dao.User;
import org.springframework.data.couchbase.core.query.N1qlPrimaryIndexed;
import org.springframework.data.couchbase.core.query.ViewIndexed;
import org.springframework.data.couchbase.repository.CouchbaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CouchbaseRepository<User,Integer> {

}
