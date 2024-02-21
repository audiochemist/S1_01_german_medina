package N2Ex1;

public class GenericMethodsArgument {

    public static <T, U, String > void showArguments(T genericType, U genericType2, String thisIsAString) {
        System.out.println(genericType);
        System.out.println(genericType2);
        System.out.println(thisIsAString);

    }

}
