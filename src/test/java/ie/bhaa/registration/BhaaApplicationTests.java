package ie.bhaa.registration;

import java.util.List;

import ie.bhaa.registration.racetec.data.Athlete;
import ie.bhaa.registration.racetec.data.Club;
import ie.bhaa.registration.racetec.repository.AthleteRepository;

import ie.bhaa.registration.racetec.repository.ClubRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = BhaaApplication.class)
@WebAppConfiguration
public class BhaaApplicationTests {

	@Autowired
	AthleteRepository repository;

	@Autowired
	ClubRepository clubRepository;

	@Test
	public void insertClub() {
        Club club = new Club(5555,"POC","POC",true);
		clubRepository.save(club);
	}

	@Test
	public void athletes() {
		
		Athlete a = repository.findOne(7713l);
		System.out.println("Customer found with findOne(7713L): ");
        System.out.println("--------------------------------");
        System.out.println(a);
		
		List<Athlete> customer = repository.findByLastName("Dunne");
        System.out.println("Customer found with findOne(1L): "+customer.size());
        System.out.println("--------------------------------");
        System.out.println(customer.get(0));
	}
}
