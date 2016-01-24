package ie.bhaa.registration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
//@Configuration
//@ComponentScan
//@EnableAutoConfiguration(exclude = JpaRepositoriesAutoConfiguration.class)
//@EnableJpaRepositories(basePackages = {"ie.bhaa"})
public class BhaaRegistrationApplication {

    public static void main(String[] args) {
        SpringApplication.run(BhaaRegistrationApplication.class, args);
    }
}
