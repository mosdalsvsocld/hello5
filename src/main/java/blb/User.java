package blb;

/**
 * Created by ericr on 6/28/15.
 */
public class User {

    private final String name;
    private final String descr;

    public User(String name, String descr) {
        this.name = name;
        this.descr = descr;
    }

    public String getName() {
        return name;
    }

    public String getDescr() {
        return descr;
    }
}
