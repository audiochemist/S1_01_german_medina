package N1Ex3;

public class ClassThrowingOutOfBoundsException {

    //lanzará una excepción automáticamente
    public static void outOfBoundsExceptionMethod() {
        int[] numbers = new int[5];
        int number = numbers[6];
    }

}
