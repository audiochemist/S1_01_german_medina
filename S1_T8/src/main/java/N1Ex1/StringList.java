package N1Ex1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringList {

    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("Almondiga", "Tornasol", "caca", "sassy", "Cocreta");
        List<String> listWithOs = findTheO(stringList);

        for (String wordO : listWithOs) {
            System.out.println(wordO);
        }
    }

    public static List<String> findTheO(List<String> stringList) {

        return stringList.stream()
                .filter(word -> word.contains("o"))
                .collect(Collectors.toList());
    }


}
