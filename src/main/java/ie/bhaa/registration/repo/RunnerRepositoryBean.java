package ie.bhaa.registration.repo;

import ie.bhaa.registration.dto.Runner;
import org.springframework.stereotype.Repository;

import java.util.*;

/**
 * Created by pauloconnell on 17/02/17.
 */
@Repository
public class RunnerRepositoryBean implements RunnerRepository {

    private Set<Runner> runners = new HashSet<>();

    public Optional<Runner> find(String id) {
        return runners
                .stream()
                .filter(c -> c.getId().equals(id))
                .findFirst();
    }

    public void add(Runner runner) {
        runners.add(runner);
    }

    public void update(Runner runner) {
        remove(runner.getId());
        add(runner);
    }


    public void remove(String id) {
//        if (StringUtils.isNotBlank(id)) {
//            cities.removeIf(c -> c.getId().equals(id));
//        }
    }

    public List<Runner> getAll() {
        List<Runner> runnerList = new ArrayList<>(runners);
        //RunnerList.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
        return runnerList;
    }
}
