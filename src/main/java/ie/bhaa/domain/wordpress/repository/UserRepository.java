package ie.bhaa.domain.wordpress.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import ie.bhaa.domain.racetec.data.Club;


/**
 * Created by pauloconnell on 16/07/15.
 */
public interface UserRepository extends MongoRepository<Club, Long> {

    //List<User> findByLastName(String lastName);
}

