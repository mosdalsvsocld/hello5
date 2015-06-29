package blb;

/**
 * Created by ericr on 6/29/15.
 */
import org.springframework.data.domain.*;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.*;

import java.util.List;

public interface UsersRepository extends CrudRepository<User, Long> {

    List<User> findByName(String name);

}