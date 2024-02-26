package N1Ex1Ex2;

public class RemoteEmployee extends Employee {

    private final int internetBill;

    public RemoteEmployee(String name, String surname, int priceHour) {
        super(name, surname, priceHour);
        this.internetBill = 30;
    }

    @Override
    public double calculateSalary(int hours){
        double salary;
        salary = hours * getPRICEHOUR() * internetBill;

        return salary;

    }
    @Deprecated
    public void helloWorldMethod(){
        System.out.print("Hello world, this is a deprecated method");
    }
}
