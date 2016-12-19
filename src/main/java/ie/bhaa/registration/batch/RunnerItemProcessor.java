package ie.bhaa.registration.batch;

import ie.bhaa.registration.domain.Runner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

/**
 * Created by pauloconnell on 17/12/2016.
 */
public class RunnerItemProcessor implements ItemProcessor<Runner, Runner> {

    private static final Logger log = LoggerFactory.getLogger(RunnerItemProcessor.class);

    @Override
    public Runner process(final Runner person) throws Exception {
//        final String firstName = person.getFirstName().toUpperCase();
//        final String lastName = person.getLastName().toUpperCase();
//
//        final Runner transformedPerson = new Runner(firstName, lastName);
//
//        log.info("Converting (" + person + ") into (" + transformedPerson + ")");

        return person;
    }
}
