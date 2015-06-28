package ie.bhaa.registration.racetec.repository;

import ie.bhaa.registration.racetec.data.Athlete;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface AthleteRepository extends CrudRepository<Athlete, Long> {

    List<Athlete> findByLastName(String lastName);
}
