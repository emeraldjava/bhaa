package ie.bhaa.registration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//@Configuration
//@EnableAutoConfiguration
//@ComponentScan

@SpringBootApplication
@EnableJpaRepositories("ie.bhaa.registration.racetec.repository")
public class BhaaApplication extends SpringBootServletInitializer {
//@SpringBootApplication
//public class BhaaApplication {

//    @Bean
//    public DispatcherServlet dispatcherServlet() {
//        return new DispatcherServlet();
//    }
//
//    /**
//     * Register dispatcherServlet programmatically
//     *
//     * @return ServletRegistrationBean
//     */
//    @Bean
//    public ServletRegistrationBean dispatcherServletRegistration() {
//        ServletRegistrationBean registration = new ServletRegistrationBean(
//                dispatcherServlet(), "/*");
//        registration
//                .setName(DispatcherServletAutoConfiguration.DEFAULT_DISPATCHER_SERVLET_REGISTRATION_BEAN_NAME);
//        return registration;
//    }
//
////    @Override
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//        return application.sources(BhaaApplication.class);
//    }


    public static void main(String[] args) {
        SpringApplication.run(BhaaApplication.class, args);
    }

//    @Override
//    protected void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
//        configurer.enable();
//    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(BhaaApplication.class);
    }
}
