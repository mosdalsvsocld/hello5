package blb;

/**
 * Created by ericr on 6/29/15.
 */
import org.springframework.data.repository.*;

import java.util.List;

public interface UsersRepository extends CrudRepository<Zser, Long> {

    List<Zser> findByName(String name);

}