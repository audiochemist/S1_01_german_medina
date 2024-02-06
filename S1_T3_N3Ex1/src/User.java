public class User {

    final private String NAME;
    final private String SURNAME;

    final private String DNI;

    public User(String NAME, String SURNAME, String DNI) {
        this.NAME = NAME;
        this.SURNAME = SURNAME;
        this.DNI = DNI;
    }

    public String getNAME() {
        return NAME;
    }

    public String getSURNAME() {
        return SURNAME;
    }

    public String getDNI() {
        return DNI;
    }

}
