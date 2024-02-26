package N1Ex6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

import static java.util.Collections.sort;

public class StringList {

    public static void main(String[] args) {

    List<String> stringList = new ArrayList<>();
            stringList.add("Hola hola jkfdgjkgdfjkfgdjkfgdjkgfdjkgfdhola");
            stringList.add("Guten Morgen - Alles gut?");
            stringList.add("kljfghskdlfjghdsfghjdkslfjgh");
            stringList.add("Esto es texto");
            stringList.add("gu");
            stringList.add("Hi babe");

        stringList.sort(Comparator.comparingInt(String::length));
        stringList.forEach(System.out::println);

    }




}
