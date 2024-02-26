package N1Ex1;
import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class AlphabeticalDirectory {

    public static void enterDirectory(String[] args) {
        Scanner sc = new Scanner(System.in);

        String directoryPath;
        // Comprobamos si no se proporcionó exactamente un argumento por línea de comandos y pedimos
        if (args.length != 1) {
            System.out.println("Please enter directory path:");
            directoryPath = sc.nextLine();
        } else {
            // Si se proporcionó, obtener la ruta del directorio desde los argumentos de la línea de comandos
            directoryPath = args[0];
            // Comprobamos si el argumento es un directorio válido
        }
        File directory = new File(directoryPath);
        if (!directory.isDirectory()) {
            System.err.println("Error: The provided path is not a directory.");
        } else {
            sortDirectory(directory);
        }

    }


    public static void sortDirectory(File directory) {

        String[] directoriesList = directory.list();
        if (directoriesList != null) {

            Arrays.sort(directoriesList);

            for (String s : directoriesList) {
                System.out.println(s);
            }

        }else {
            System.err.println("The path is not valid");
        }
    }
}






