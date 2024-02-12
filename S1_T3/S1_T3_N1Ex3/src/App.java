import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class App {

    public static void main(String[] args) {

        startGame(readFile());

    }

    //Leemos el archivo, y lo preparamos correctamente para poder introducirlo en el hashMap
    public static Map<String, String> readFile() {
        Map<String, String> hashMap = new HashMap<>();

        try (FileReader file = new FileReader("countries.txt");
             BufferedReader reader = new BufferedReader(file)){
                String line;
                while ((line = reader.readLine()) != null) {
                    // Divide la línea en clave y valor usando el espacio como separador
                    if (!line.isEmpty()) {
                        // Divide la línea en clave y valor analizando los espacios como separador
                        String[] pair = line.split(" ");
                        String key = pair[0].replace("_", " "); // Reemplaza guiones bajos por espacios en la clave
                        String value = pair[1].replace("_", " "); // Reemplaza guiones bajos por espacios en el valor
                        hashMap.put(key, value); // Agrega la clave y el valor al HashMap

                    }
                }

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());

        }

        return hashMap;

    }

    public static void startGame(Map<String, String> hashMap) {
        int counterPoint = 0;

        String name = Input.readString("Please enter your name");

        hashMap = readFile();

        for (int i = 0; i < 10; i++) {
            int randomIndex = (int) (Math.random() * hashMap.size());
            String country = (String) hashMap.keySet().toArray()[randomIndex];
            String rightCapital = hashMap.get(country);

            String answerUser = Input.readString("Enter the capital of the following country: " + country);

            if (answerUser.equalsIgnoreCase(rightCapital)) {
                counterPoint++;
                System.out.println("Correct! You've obtained 1 point");
            } else {
                System.out.println("Sorry, that is not correct!");
            }

        }
        System.out.println("The game has ended - You've obtained a total of " + counterPoint + " points.");
        saveDataPlayer(name, counterPoint);
    }

    public static void saveDataPlayer(String name, int counterPoint) {
        try (FileWriter dataPlayers = new FileWriter("classificacio.txt", true)) {
            String line = name + "," + counterPoint + "\n";
            dataPlayers.write(line);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    }


