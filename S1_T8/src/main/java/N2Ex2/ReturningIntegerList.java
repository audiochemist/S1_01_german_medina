package N2Ex2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ReturningIntegerList {

    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();
        integerList.add(4);
        integerList.add(7);
        integerList.add(243534);
        integerList.add(23);
        integerList.add(50);
        integerList.add(79);

       System.out.println(numberLeterList(integerList));

    }

    public static String numberLeterList(List<Integer> integerList){
        return integerList.stream()
                .map(n -> (isEven(n)? "e" : "o") + n)
                .collect(Collectors.joining(", "));
    }

    public static boolean isEven(int number){
        return number % 2 == 0;
    }



}
