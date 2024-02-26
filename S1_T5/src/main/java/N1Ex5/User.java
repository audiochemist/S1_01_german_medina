package N1Ex5;

import java.io.Serializable;

public class User implements Serializable {

    private String name;
    private String surname;

    public User(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }
}
