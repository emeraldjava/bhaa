package ie.bhaa.registration.service;

import ie.bhaa.registration.form.RaceEntry;

import java.util.List;

/**
 * Created by pauloconnell on 14/12/2016.
 */
public interface RegistrationService {

    void registerRaceEntry(RaceEntry raceEntry);

    List<RaceEntry> getRegisteredRunners();

}