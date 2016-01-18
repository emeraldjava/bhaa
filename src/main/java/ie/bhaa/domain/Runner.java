package ie.bhaa.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by pauloconnell on 17/01/16.
 */
@Document(collection = "runner")
public class Runner {

    @Id
    Long id;
    String firstname;
    String lastname;
}
