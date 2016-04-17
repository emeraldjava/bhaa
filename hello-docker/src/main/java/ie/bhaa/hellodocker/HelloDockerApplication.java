package ie.bhaa.hellodocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * https://spring.io/guides/gs/spring-boot-docker/
 */
@SpringBootApplication
@RestController
public class HelloDockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloDockerApplication.class, args);
	}

    @RequestMapping("/")
    public String home() {
        return "Hello Docker World";
    }
}
