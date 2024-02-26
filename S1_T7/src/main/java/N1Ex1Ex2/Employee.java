package N1Ex1Ex2;

public class Employee {

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

    public double calculateSalary(int hours){
    double salary;
    salary = hours * PRICEHOUR;
    return salary;
}




}
