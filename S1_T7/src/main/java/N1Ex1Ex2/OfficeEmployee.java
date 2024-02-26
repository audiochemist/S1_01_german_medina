package N1Ex1Ex2;

public class OfficeEmployee extends Employee {
    public static int benzina;

    public OfficeEmployee(String name, String surname, int priceHour) {
        super(name, surname, priceHour);
    }


    @Override
    public double calculateSalary(int hours){
        double salary;
        salary = hours * getPRICEHOUR() * benzina;

        return salary;
    }


    @Deprecated
    public int addUp(int num1, int num2) {
        return num1 + num2;
    }



}
