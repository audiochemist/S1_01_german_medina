package N1Ex7;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StringList {

    public static void main(String[] args) {

    List<String> stringList = new ArrayList<>();
            stringList.add("Hola hola jkfdgjkgdfjkfgdjkfgdjkgfdjkgfdhola");
            stringList.add("Guten Morgen - Alles gut?");
            stringList.add("kljfghskdlfjghdsfghjdkslfjgh");
            stringList.add("Esto es texto");
            stringList.add("gu");
            stringList.add("Hi babe");

        //Aqui especificamos mejor el criterio para ordenar (en este caso de mayor a menor)
        stringList.sort((s1, s2) -> Integer.compare(s2.length(), s1.length()));

        stringList.forEach(System.out::println);

    }

}
