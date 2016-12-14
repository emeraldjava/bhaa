package ie.bhaa.registration.api;

import ie.bhaa.registration.domain.Runner;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * https://github.com/hantsy/angularjs-springmvc-sample-boot/blob/master/src/main/java/com/hantsylabs/restexample/springmvc/api/user/UserController.java
 * Created by pauloconnell on 20/08/2016.
 */
@RestController
//@RequestMapping(value="/api/runner")
public class RunnerController {

    private List<Runner> runners;

    public RunnerController() {
        this.runners = new ArrayList();
    }

    @RequestMapping(value="/api/runner/{id}")
    //@GetMapping(value = "/api/runner/{id}")
    public ResponseEntity<Runner> getUser(@PathVariable("id") Long id) {
        Runner r = new Runner();
        r.setBhaaId(7713L);
        r.setFirstName("p");
        return new ResponseEntity<>(r, HttpStatus.OK);
    }

    //@RequestMapping(value="/api/runners")
    @GetMapping(value="/api/runners")
    public Page<Runner> allRunners(
            @RequestParam(required = false, value = "q") String q,
            @RequestParam(required = false, value = "role") String role,
            @PageableDefault(page = 0, size = 10, sort = "createdDate", direction = Sort.Direction.DESC) Pageable page) {

        //List<Runner> l = new ArrayList();
        runners.add(new Runner(1L, "f", "n"));
        runners.add(new Runner(2L, "f", "n"));
        runners.add(new Runner(3L, "f", "n"));
        Page p = new PageImpl(this.runners);

        return p;
    }

    @PostMapping(value = "/api/runner")
    public ResponseEntity<Void> saveUser(@RequestBody @Valid Runner form,
                                         BindingResult errors,
                                         HttpServletRequest req) {
        return null;
    }

    @DeleteMapping(value = "/api/runner/{id}")
    public ResponseEntity<List<Runner>> deleteUser(@PathVariable("id") Long id) {
        runners.remove(id);
        return new ResponseEntity<>(this.runners, HttpStatus.OK);
    }
}
