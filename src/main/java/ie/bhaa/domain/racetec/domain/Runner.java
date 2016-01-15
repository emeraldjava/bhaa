package ie.bhaa.domain.racetec.domain;

/**
 * Created by pauloconnell on 26/06/15.
 */
public class Runner {
    private final long id;
    private final String name;

    public Runner(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
