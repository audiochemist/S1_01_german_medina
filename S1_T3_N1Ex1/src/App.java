import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class App {
    public static void main(String[] args) {

      ArrayList<Month> year = new ArrayList<>();
      Month monthIterator = new Month("");

      year.add(new Month("January"));
      year.add(new Month("February"));
      year.add(new Month("March"));
      year.add(new Month("April"));
      year.add(new Month("May"));
      year.add(new Month("June"));
      year.add(new Month("July"));
      year.add(new Month("September"));
      year.add(new Month("October"));
      year.add(new Month("November"));
      year.add(new Month("December"));

      Month agosto = new Month("August");
      year.add(7, agosto);

        for (Month month : year) {
            System.out.println(month.getName());
        }

      HashSet<Month> monthSet = new HashSet<>(year);
      //for (Month month : monthSet ) {
      //  System.out.println(month.getName());
      //}

        for (Month month : year) {
            monthIterator = month;
            System.out.println(monthIterator.getName());
        }


}

}
