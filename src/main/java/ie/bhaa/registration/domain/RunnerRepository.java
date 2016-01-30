package ie.bhaa.registration.domain;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 *
 * http://ralf.schaeftlein.de/2015/03/26/using-vaadin-ui-with-spring-boot-for-spring-data-backend-based-on-mongodb/
 * Created by pauloconnell on 30/01/16.
 */
public interface RunnerRepository extends MongoRepository<Runner, String> {

    public Runner findByFirstName(String firstName);

    public List<Runner> findByLastName(String lastName);

}