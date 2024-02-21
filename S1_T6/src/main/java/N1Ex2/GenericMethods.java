package N1Ex2;

public class GenericMethods {

    public static <T, U, V > void showArguments(T genericType, U genericType2, V genericType3) {
        System.out.println(genericType);
        System.out.println(genericType2);
        System.out.println(genericType3);

    }
}
