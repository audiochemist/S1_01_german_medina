package N2Ex1;

import java.io.Serializable;

@JSONSerializer(directory = "/Users/German/Desktop/Sprints_JAVA/JAVA-BACKEND-IT-ACADEMY/S1/S1_T7/src")

public class Employee implements Serializable {
    private final String NAME;
    private final String SURNAME;
    private final int PRICEHOUR;

    public Employee(String NAME, String SURNAME, int PRICEHOUR) {
        this.NAME = NAME;
        this.SURNAME = SURNAME;
        this.PRICEHOUR = PRICEHOUR;
    }

    public String getNAME() {
        return NAME;
    }

    public String getSURNAME() {
        return SURNAME;
    }

    public int getPRICEHOUR() {
        return PRICEHOUR;
    }
}
