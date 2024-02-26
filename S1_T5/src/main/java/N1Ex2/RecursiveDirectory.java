package N1Ex2;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Scanner;

public class RecursiveDirectory {

    public static void enterDirectory(String[] args) {
        Scanner sc = new Scanner(System.in);

        String directoryPath;
        if (args.length != 1) {
            System.out.println("Please enter directory path:");
            directoryPath = sc.nextLine();
        } else {
            directoryPath = args[0];
        }
        File directory = new File(directoryPath);
        if (!directory.isDirectory()) {
            System.err.println("Error: The provided path is not a directory.");
        } else {
            sortDirectory(directory);
        }

    }

    public static void sortDirectory(File directory) {

        File[] directoriesList = directory.listFiles();
        SimpleDateFormat date = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");

        if (directoriesList!=null) {

            Arrays.sort(directoriesList);

            for (File fd : directoriesList) {
                if (fd.isDirectory()){
                    System.out.println("Directory: " + fd.getName() + " Was last modified on: " + date.format(fd.lastModified()));
                    sortDirectory(fd);
                }else{
                    System.out.println("File: " + fd.getName() + " Was last modified on: " + date.format(fd.lastModified()));
                }
            }

        } else {
            System.err.println("The path is not valid");
        }

    }
}
