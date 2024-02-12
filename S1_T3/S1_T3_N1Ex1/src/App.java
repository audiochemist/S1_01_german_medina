import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class App {
  public static void main(String[] args) {

    ArrayList<Month> year = new ArrayList<>();

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

    //Agosto se añade en su sitio, manteniendo su orden correcto
    for (Month month : year) {
      System.out.println(month.getName());
    }

    System.out.println("------------");


    Set<Month> monthSet = new HashSet<>(year);
    monthSet.add(agosto);//añadimos otro elemento repetido


    //imprimimos con un foreach, siguen habiendo 12 meses
    for (Month month : monthSet) {
      System.out.println(month.getName());
    }

    System.out.println("------------");

    //recorremos con un iterador, siguen habiendo 12 meses
    Iterator<Month> iterator = monthSet.iterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.next().getName());

    }

  }
}
