package ie.bhaa.registration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

@SpringBootApplication
// http://stackoverflow.com/questions/24074749/spring-boot-cannot-determine-embedded-database-driver-class-for-database-type
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class BhaaRegistrationApplication { //extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(BhaaRegistrationApplication.class, args);
    }
}