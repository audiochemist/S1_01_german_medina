import java.util.*;

public class App {

    public static void main(String[] args) {

        //Exercici1

        HashSet<Restaurant> restaurantsHashSet = new HashSet<>();

        Restaurant restaurant1 = new Restaurant("Yeeah Restaurant", 5);
        Restaurant restaurant2 = new Restaurant("Yeeah Restaurant", 5);
        Restaurant restaurant3 = new Restaurant("OMG Restaurant", 7);
        Restaurant restaurant4 = new Restaurant("OMG Restaurant", 9);


            restaurantsHashSet.add(restaurant1);
            restaurantsHashSet.add(restaurant2);
            restaurantsHashSet.add(restaurant3);
            restaurantsHashSet.add(restaurant4);

        //Podemos ver que los metodos equal y Hashcode
        // no permiten que se añada el segundo restaurante

        for (Restaurant restaurant : restaurantsHashSet) {
            System.out.println("Name: " + restaurant.getName() + ", Score: " + restaurant.getScore());
        }

        System.out.println("________________________");

        //Exercici2

        List<Restaurant> restaurantlist = new ArrayList<>(restaurantsHashSet);
        restaurantlist.sort(Comparator.comparing(Restaurant::getScore).reversed());

        //TODO Intentar otra manera de revertir el orden, usando java.util.Collections

        for (Restaurant restaurant : restaurantlist) {
            System.out.println("Name: " + restaurant.getName() + ", Score: " + restaurant.getScore());
        }


    }

}
