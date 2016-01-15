package ie.bhaa.domain.wordpress.repository;

import ie.bhaa.domain.wordpress.data.User;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by pauloconnell on 16/07/15.
 */
public interface UserRepository extends MongoRepository<User, Long> {

    //List<User> findByLastName(String lastName);
}

