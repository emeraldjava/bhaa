package ie.bhaa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//@SpringBootApplication

@Configuration
@ComponentScan
@EnableAutoConfiguration(exclude = JpaRepositoriesAutoConfiguration.class)
//@EnableJpaRepositories(basePackages = {"ie.bhaa"})
public class BhaaApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(BhaaApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(BhaaApplication.class);
    }
}
