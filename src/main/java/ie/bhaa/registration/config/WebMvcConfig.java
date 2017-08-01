package ie.bhaa.registration.config;

import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;

/**
 * Created by pauloconnell on 14/12/16.
 */
//@Configuration
//@EnableWebMvc
public class WebMvcConfig {//extends WebMvcConfigurerAdapter {

    /**
     * See http://stackoverflow.com/questions/32685819/spring-boot-webjars-unable-to-load-javascript-library-through-webjar
     * @param registry
     */
    //@Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        // http://www.webjars.org/documentation#springboot
//        http.authorizeRequests().antMatchers("/webjars/**").permitAll();

//        registry
//                .addResourceHandler("/webjars/**")
//                .addResourceLocations("/webjars/");
//
////        registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
//        System.out.println("has mapping() "+registry.hasMappingForPattern("/webjars/**"));

        // Use the file: resource location to allow dynamically generated files in this folder to be included in the frontend.
        // http://stackoverflow.com/questions/25871131/how-to-dynamically-add-static-resources-to-spring-boot-jar-application
        //registry.addResourceHandler("/dynamic/**").addResourceLocations("file:dynamic/");
    }

//    @Override
//    public void addViewControllers(ViewControllerRegistry registry) {
//        registry.addViewController("/member").setViewName("members");
//        registry.addViewController("/").setViewName("member");
//        registry.addViewController("/login").setViewName("login");
//        registry.addViewController("/list").setViewName("list");
//    }
}
