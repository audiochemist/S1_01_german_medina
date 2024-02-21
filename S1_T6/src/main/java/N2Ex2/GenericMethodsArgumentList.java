package N2Ex2;

public class GenericMethodsArgumentList {

    public <T> void printingArguments(T... args) {
        for (T arg : args) {
            System.out.println(arg);
        }

    }


}
