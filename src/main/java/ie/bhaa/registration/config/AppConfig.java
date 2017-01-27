package ie.bhaa.registration.config;

import ie.bhaa.registration.service.MembershipFileService;
import ie.bhaa.registration.service.MembershipFileServiceBean;
import ie.bhaa.registration.service.RegistrationService;
import ie.bhaa.registration.service.RegistrationServiceBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by pauloconnell on 27/01/17.
 */
@Configuration
public class AppConfig {

    @Bean
    public MembershipFileService getMembershipFileServiceBean(){
        return new MembershipFileServiceBean();
    }

    @Bean
    public RegistrationService getRegistrationService(){
        return new RegistrationServiceBean();
    }
}
