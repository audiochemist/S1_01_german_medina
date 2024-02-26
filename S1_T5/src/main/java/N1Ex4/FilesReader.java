package N1Ex4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.*;

public class FilesReader {


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
            readFile(directoryPath);
        }

    }

    public static void sortDirectory(File directory) {

        File[] directoriesList = directory.listFiles();
        if (directoriesList != null) {

            Arrays.sort(directoriesList);

            for (File fd : directoriesList) {
                if (fd.isDirectory()) {
                    System.out.println("Directory: " + fd.getName() + " Was last modified on: " + new Date(fd.lastModified()));
                    sortDirectory(fd);
                } else {
                    System.out.println("File: " + fd.getName() + " Was last modified on: " + new Date(fd.lastModified()));
                }
            }

        } else {
            System.out.println("The path is not valid");
        }

    }

    public static void readFile(String filePath) {
        File file1 = new File(filePath);
        if(file1.getName().toLowerCase().endsWith(".txt")) {

            try (FileReader file = new FileReader(filePath); BufferedReader reader = new BufferedReader(file)) {
                String line;
                while ((line = reader.readLine()) != null) {
                    if (!line.isEmpty()) {
                        System.out.println(line);
                    }
                }

            } catch (Exception e) {
                System.err.println("Error: " + e.getMessage());

            }

        }else{
            System.err.println("ERROR: The file must be .txt");
        }
    }


}
