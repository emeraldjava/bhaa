package ie.bhaa.registration.service;

import ie.bhaa.registration.domain.Runner;

import java.util.List;

/**
 * Created by pauloconnell on 14/12/2016.
 */
public interface RegistrationService {

    void registerRunner(Runner runner);

    List<Runner> getRegisteredRunners();

    List<Runner> getAllRunners();

}