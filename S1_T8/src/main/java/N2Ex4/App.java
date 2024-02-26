package N2Ex4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class App {

    public static void main(String[] args) {

        List<String> miscList = new ArrayList<>();

        miscList.add("llo b**** W3lc0me to H3LL");
        miscList.add("e need to yassifi you");
        miscList.add("dwquerytiqwu9847");
        miscList.add("Anchoa");
        miscList.add("Kirisak98yewi");
        miscList.add("84576");
        miscList.add("OYT");
        miscList.add("0");

        //Alphabetically (first character)
        miscList.stream()
                .sorted(Comparator.comparingInt(string -> string.charAt(0)))
                .forEach(System.out::println);

        System.out.println("---------");
        //Strings that contain "e"
        miscList.stream()
                .sorted((string2, string1) -> {
                    boolean string1HasE = string1.contains("e");
                    boolean string2HasE = string2.contains("e");
                    return Boolean.compare(string1HasE, string2HasE);
                }).forEach(System.out::println);

        System.out.println("---------");
        //Replaces 'a' with '4'
        miscList.stream()
                .map(string -> string.replace('a', '4'))
                .forEach(System.out::println);

        System.out.println("---------");
        //Show only digit strings
        miscList.stream()
                .filter(string -> string.matches("[0-9]+"))
                .forEach(System.out::println);

    }
}
