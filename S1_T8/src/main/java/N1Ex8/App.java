package N1Ex8;

import N1Ex5.PiValue;

public class App {

    public static void main(String[] args) {
        FunctionalInterface functionalInterface =
                () -> new StringBuilder("Adan no cede con Eva y Yave no cede con nada").reverse().toString();  ;
        String reversedString = functionalInterface.reverse();

        System.out.println(reversedString);


    }
}
