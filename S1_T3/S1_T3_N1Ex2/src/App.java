import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class App {

    public static void main(String[] args) {

        final List<Integer> numbers = new ArrayList<>();

        numbers.add(7);
        numbers.add(43);
        numbers.add(1);

        List<Integer> numbersReversed = new ArrayList<>();
        ListIterator<Integer> iterator = numbers.listIterator(numbers.size());
        while (iterator.hasPrevious()) {
            numbersReversed.add(iterator.previous());
        }

        for (Integer number : numbersReversed) {
            System.out.println(number);
        }

    }
}