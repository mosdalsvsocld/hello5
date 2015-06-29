package blb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by ericr on 6/28/15.
 */
@RestController
//@RequestMapping(value="/qq")
public class Qq {

    @Autowired
    UsersRepository repository;

    @RequestMapping(value="/qq/{name}", method= RequestMethod.GET)
    public Zser getZser(@PathVariable String name) {
        List<Zser> ww = repository.findByName(name);
        if(ww!=null && ww.size()>0)
            return ww.get(0);
        else
            return null;
        //return new Zser("abbb"+user, "descr2 "+user);
    }

}
