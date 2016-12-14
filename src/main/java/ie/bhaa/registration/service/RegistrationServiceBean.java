package ie.bhaa.registration.service;

import ie.bhaa.registration.domain.Runner;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by pauloconnell on 14/12/2016.
 */
@Component
public class RegistrationServiceBean implements RegistrationService {

    private List<Runner> runners;
    private List<Runner> allRunners;

    @PostConstruct
    public void init() {
        this.runners = new LinkedList<Runner>();
        this.allRunners = new ArrayList<Runner>();
        Runner runner = new Runner(7713l,"P","OC");
        allRunners.add(runner);
    }

    @Override
    public Runner saveRunner(Runner runner) {
        runners.add(runner);
        return runner;
    }

    @Override
    public List<Runner> getRegisteredRunners() {
        return runners;
    }

    @Override
    public List<Runner> getAllRunners() {
        return allRunners;
    }
}
