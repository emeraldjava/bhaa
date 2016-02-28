package ie.bhaa.rawchips;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

/**
 * Created by pauloconnell on 28/02/16.
 */
public class RawChipProcessor implements ItemProcessor<RawChip, RawChip> {

    private static final Logger log = LoggerFactory.getLogger(RawChipProcessor.class);

    @Override
    public RawChip process(final RawChip person) throws Exception {
//        final String firstName = person.getFirstName().toUpperCase();
  //      final String lastName = person.getLastName().toUpperCase();

    //    final RawChip transformedRawChip = new RawChip(firstName, lastName);

        log.info("Converting (" + person + ") into (" + person + ")");
        return person;
    }
}
