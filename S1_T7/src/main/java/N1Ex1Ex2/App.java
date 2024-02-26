package N1Ex1Ex2;

public class App {
    @SuppressWarnings("deprecated")
    public static void main(String[] args) {

        //Ex1
        OfficeEmployee employee1 = new OfficeEmployee("Juan", "Smith", 8);
        RemoteEmployee employee2 = new RemoteEmployee("Juan", "Smith", 8);

        OfficeEmployee.benzina = 67;
        System.out.println(employee1.calculateSalary(40));
        System.out.println(employee2.calculateSalary(40));


       //Ex2. Tambien hemos utilizado otra clase externa para realizar otro "SuppressWarnings" (motivos pedagógicos)
        employee2.helloWorldMethod();
        SuppressWarningsClass.suppressWarningsMethod();
    }
}
