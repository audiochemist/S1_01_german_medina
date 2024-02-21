package N1Ex1;

public class App {

    public static void main(String[] args) {


        NoGenericMethods testOutofOrder = new NoGenericMethods("Pedro","Juan","Kimberly");
        NoGenericMethods testOrdered = new NoGenericMethods("Kimberly", "Juan", "Pedro");

        System.out.println(testOutofOrder);
        System.out.println(testOrdered);

    }
}
