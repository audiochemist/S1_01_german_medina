package N1Ex1Ex2;

public class SuppressWarningsClass {
    //Ex2
    @SuppressWarnings("deprecated")
    public static void suppressWarningsMethod() {
        OfficeEmployee employee1 = new OfficeEmployee("Juan", "Smith", 8);
        employee1.addUp(6, 5);
    }
}
