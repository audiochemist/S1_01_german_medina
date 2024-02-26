package N1Ex3;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class DirectoryWriter {

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
            sortDirectory(directory, 0);
        }

    }

    public static void sortDirectory(File directory, int subFolder) {

        File[] directoriesList = directory.listFiles();

        if (directoriesList!=null) {

            Arrays.sort(directoriesList);

            for (File fd : directoriesList) {
                if (fd.isDirectory()){
                    saveDirectories(fd, "Directory: ", subFolder);
                    sortDirectory(fd, subFolder + 1);
                }else{
                    saveDirectories(fd, "File: ", subFolder);
                }
            }

        } else {
            System.out.println("The path is not valid");
        }


    }

    public static void saveDirectories(File fd, String type, int subFolder) {

        try (FileWriter directoryWriter = new FileWriter("directories.txt", true)) {
            String tabulate = "";
            for (int i = 0; i < subFolder; i++) {
                tabulate += "\t";
            }
                String line = tabulate + type + fd.getName() + " Was last modified on: " + new Date(fd.lastModified()) + "\n";
                directoryWriter.write(line);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
