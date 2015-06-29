package blb;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by ericr on 6/28/15.
 */
@Entity
public class User {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private final String name;
    @Column(nullable = false)
    private final String descr;

    public User(String name, String descr) {
        this.name = name;
        this.descr = descr+" created at "+System.currentTimeMillis();
    }

    public String getName() {
        return name;
    }

    public String getDescr() {
        return descr;
    }
}
