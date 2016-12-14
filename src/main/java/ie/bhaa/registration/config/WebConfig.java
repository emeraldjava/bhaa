package ie.bhaa.registration.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by pauloconnell on 14/12/16.
 */
@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {

    /**
     * See http://stackoverflow.com/questions/32685819/spring-boot-webjars-unable-to-load-javascript-library-through-webjar
     * @param registry
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
    }
}
