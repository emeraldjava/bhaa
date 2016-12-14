package ie.bhaa.registration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

@SpringBootApplication
public class BhaaRegistrationApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(BhaaRegistrationApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(BhaaRegistrationApplication.class, args);
    }
}