package blb;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

//@Controller
//@EnableAutoConfiguration
//@RestController
@SpringBootApplication
public class SampleController {

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

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleController.class, args);
    }
}