package ie.bhaa.domain;

import ie.bhaa.domain.racetec.data.Club;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by pauloconnell on 17/01/16.
 * http://ralf.schaeftlein.de/2015/03/26/using-vaadin-ui-with-spring-boot-for-spring-data-backend-based-on-mongodb/
 */
public interface RunnerRepository extends MongoRepository<Runner, Long> {

    Runner findByFirstName(String firstname);
}
