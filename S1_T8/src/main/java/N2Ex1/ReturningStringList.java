package N2Ex1;

import java.util.ArrayList;
import java.util.List;

public class ReturningStringList {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Mar");
        stringList.add("Juan");
        stringList.add("Air");
        stringList.add("Magdalena");
        stringList.add("Romina");
        stringList.add("Victor");


        stringList.stream()
                .filter(name -> name.startsWith("A") && name.length() == 3)
                .forEach(System.out::println);

    }






}
