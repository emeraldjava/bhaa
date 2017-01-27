package ie.bhaa.registration.service;

import ie.bhaa.registration.form.RaceEntry;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by pauloconnell on 14/12/2016.
 */
@Component
public class RegistrationServiceBean implements RegistrationService {

    private Logger logger = Logger.getLogger(RegistrationServiceBean.class);
    private List<RaceEntry> raceEntryList;

    @PostConstruct
    public void init() {
        this.raceEntryList = new LinkedList<RaceEntry>();
    }

    public void registerRaceEntry(RaceEntry runner) {
        this.raceEntryList.add(runner);
        logger.info("Added runner "+runner.getId()+" to total entry of "+this.raceEntryList.size());
    }

    @Override
    public List<RaceEntry> getRegisteredRunners() {
        return this.raceEntryList;
    }

}
