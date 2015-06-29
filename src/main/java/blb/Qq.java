package blb;

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
    @RequestMapping(value="/qq/{user}", method= RequestMethod.GET)
    public User getUser(@PathVariable Long user) {
        return new User("a"+user, "descr "+user);
    }

}
