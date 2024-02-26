package N1Ex2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringList {

    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("Almondiga", "Tornasol", "caca", "sassy", "Cocreta", "o");
        List<String> listWithShortsNoO = findTheO(stringList);

        for (String wordO : listWithShortsNoO) {
            System.out.println(wordO);
        }
    }

    public static List<String> findTheO(List<String> stringList) {
        int maxLength = 5;
        return stringList.stream()
                .filter(word -> word.contains("o"))
                .filter(word -> word.length() <= maxLength)
                .collect(Collectors.toList());
    }

}
