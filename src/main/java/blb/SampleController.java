package blb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;

//@Controller
//@EnableAutoConfiguration
//@RestController
@SpringBootApplication
public class SampleController implements CommandLineRunner {

//    @RequestMapping("/")
//    @ResponseBody
//    String home() {
//        return "Hello World! 2 ";
//    }
//

//    private static final String template = "Hello, %s!";
//    private final AtomicLong counter = new AtomicLong();
//
//    @RequestMapping("/greeting")
//    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
//        return new Greeting(counter.incrementAndGet(),
//                String.format(template, name));
//    }
    @Autowired
    UsersRepository repository;

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleController.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
        repository.save(new Zser("Jack", "Bauer"));
        repository.save(new Zser("Chloe", "O'Brian"));
        repository.save(new Zser("Kim", "Bauer"));
        repository.save(new Zser("David", "Palmer"));
        repository.save(new Zser("Michelle", "Dessler"));

    }
}