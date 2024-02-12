import java.util.*;

public class App {

    public static void main(String[] args) {

        //Exercici1

        HashSet<Restaurant> restaurantsHashSet = new HashSet<>();

        Restaurant restaurant1 = new Restaurant("Yeeah Restaurant", 5);
        Restaurant restaurant2 = new Restaurant("Yeeah Restaurant", 5);
        Restaurant restaurant3 = new Restaurant("OMG Restaurant", 7);
        Restaurant restaurant4 = new Restaurant("OMG Restaurant", 9);
        Restaurant restaurant5 = new Restaurant("Saoko Restaurant", 8);



        restaurantsHashSet.add(restaurant1);
        restaurantsHashSet.add(restaurant2);
        restaurantsHashSet.add(restaurant3);
        restaurantsHashSet.add(restaurant4);
        restaurantsHashSet.add(restaurant5);


        //Podemos ver que los metodos equal y Hashcode
        // no permiten que se añada el segundo restaurante

        Iterator<Restaurant> iterator = restaurantsHashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }

        System.out.println("________________________");

        //Exercici2

        //Aqui utilizamos un Treeset con el metodo CompareTo para ordenar por puntuacion

        TreeSet<Restaurant> restaurantsTreeSet = new TreeSet<>(restaurantsHashSet);
        iterator = restaurantsTreeSet.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }



    }

}
