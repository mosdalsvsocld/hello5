package blb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ericr on 6/28/15.
 */
@RestController
//@RequestMapping(value="/qq")
public class Qq {

    @Autowired
    UsersRepository repository;

    @RequestMapping(value="/qq/{name}", method= RequestMethod.GET)
    public User getUser(@PathVariable String name) {
        return repository.findByName(name).get(0);
        //return new User("abbb"+user, "descr2 "+user);
    }

}
