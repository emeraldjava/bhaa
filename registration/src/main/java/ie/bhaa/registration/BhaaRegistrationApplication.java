package ie.bhaa.registration;

import ie.bhaa.registration.domain.Runner;
import ie.bhaa.registration.domain.RunnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BhaaRegistrationApplication {

    @Autowired
    private RunnerRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(BhaaRegistrationApplication.class, args);
    }

    //@Override
//    public void run(String... args) throws Exception {
//
//        repository.deleteAll();
//
//        // save a couple of Runners
//        repository.save(new Runner(1l,"Alice","Smith"));
//        repository.save(new Runner(2l,"Bob","Smith"));
//
//        // fetch all Runners
//        System.out.println("Runners found with findAll():");
//        System.out.println("-------------------------------");
//        for (Runner runner : repository.findAll()) {
//            System.out.println(runner);
//        }
//        System.out.println();
//
//        // fetch an individual Runner
////        System.out.println("Runner found with findByFirstName('Alice'):");
////        System.out.println("--------------------------------");
////        System.out.println(repository.findByFirstName("Alice"));
//
//        System.out.println("Runners found with findByLastName('Smith'):");
//        System.out.println("--------------------------------");
//        for (Runner Runner : repository.findByLastName("Smith")) {
//            System.out.println(Runner);
//        }
//    }
}