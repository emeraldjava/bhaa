package ie.bhaa.registration.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by pauloconnell on 14/12/16.
 */
@Configuration
@EnableWebSecurity
public class WebMvcConfig extends WebMvcConfigurerAdapter {

    /**
     * See http://stackoverflow.com/questions/32685819/spring-boot-webjars-unable-to-load-javascript-library-through-webjar
     * @param registry
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        // http://www.webjars.org/documentation#springboot
        registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
        // Use the file: resource location to allow dynamically generated files in this folder to be included in the frontend.
        // http://stackoverflow.com/questions/25871131/how-to-dynamically-add-static-resources-to-spring-boot-jar-application
        registry.addResourceHandler("/dynamic/**").addResourceLocations("file:dynamic/");
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/home").setViewName("home");
        registry.addViewController("/").setViewName("home");
        registry.addViewController("/index").setViewName("index");
        registry.addViewController("/login").setViewName("login");
    }
}
