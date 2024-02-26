package N2Ex1;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.Properties;

public class DirectoryPropertyWriter {

    public static void enterDirectory() {


        Properties properties = new Properties();

        try (FileInputStream fileProperties = new FileInputStream("setting.properties")) {
            properties.load(fileProperties);

            String directoryToBeRead = properties.getProperty("directoryToBeRead");
            String resultingTXTFile = properties.getProperty("resultingTXTFile");
            File directory = new File(directoryToBeRead);
            sortDirectory(directory, 0, resultingTXTFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    public static void sortDirectory(File directory, int subFolder, String resultingTXTFile) {

        File[] directoriesList = directory.listFiles();

        if (directoriesList!=null) {

            Arrays.sort(directoriesList);

            for (File fd : directoriesList) {
                if (fd.isDirectory()){
                    saveDirectories(fd, "Directory: ", subFolder, resultingTXTFile);
                    sortDirectory(fd, subFolder + 1, resultingTXTFile);
                }else{
                    saveDirectories(fd, "File: ", subFolder, resultingTXTFile);
                }
            }

        } else {
            System.out.println("The path is not valid");
        }


    }

    public static void saveDirectories(File fd, String type, int subFolder, String resultingTXTFile) {

        try (FileWriter directoryWriter = new FileWriter(resultingTXTFile, true)) {
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
