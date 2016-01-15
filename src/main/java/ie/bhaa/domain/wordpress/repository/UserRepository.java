package ie.bhaa.domain.wordpress.repository;

import ie.bhaa.domain.wordpress.data.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by pauloconnell on 16/07/15.
 */
public interface UserRepository extends CrudRepository<User, Long> {

    //List<User> findByLastName(String lastName);
}

