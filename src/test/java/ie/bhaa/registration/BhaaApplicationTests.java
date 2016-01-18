package ie.bhaa.registration;

import ie.bhaa.BhaaApplication;
import ie.bhaa.domain.wordpress.repository.UserRepository;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@Ignore
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = BhaaApplication.class)
//@WebAppConfiguration
public class BhaaApplicationTests {

	//@Autowired
	//AthleteRepository repository;

	//@Autowired
	//ClubRepository clubRepository;

	@Autowired
	UserRepository userRepo;

	@Test
	public void testUser() {
		Assert.assertNotNull(userRepo);
//		User user = userRepo.findOne(7713l);
//		Assert.assertNotNull(user);
//        System.out.println(user.toString());
	}

//	@Ignore
//	public void insertClub() {
//        Club club = new Club(5555,"POC","POC",true);
//		clubRepository.save(club);
//	}
//
//	@Ignore
//	public void athletes() {
//
//		Athlete a = repository.findOne(7713l);
//		System.out.println("Customer found with findOne(7713L): ");
//        System.out.println("--------------------------------");
//        System.out.println(a);
//
//		List<Athlete> customer = repository.findByLastName("Dunne");
//        System.out.println("Customer found with findOne(1L): "+customer.size());
//        System.out.println("--------------------------------");
//        System.out.println(customer.get(0));
//	}
}
