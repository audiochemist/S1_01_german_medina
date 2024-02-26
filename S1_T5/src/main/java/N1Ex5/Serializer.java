package N1Ex5;

import java.io.*;
import java.util.Arrays;
import java.util.Date;

public class Serializer {


    private static void handleMenu(int option, String directoryPath)  {
        switch (option) {

            case 1:
                sortDirectory(new File(directoryPath));
                break;
            case 2:
                readFile(directoryPath);
                break;
            case 3:
                serializeObject();
                break;
            case 4:
                deserializeObject();
                break;
        }
    }

    public static void enterDirectory(String[] args) {
        int option;
        String directoryPath;
        if (args.length == 2) {
            directoryPath = args[1];
            option = Integer.parseInt(args[0]);
            handleMenu(option, directoryPath);
        } else {
            System.out.println("Not the correct amount of arguments on the command line");
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

    public static void serializeObject() {
        User newUser1 = new User("Ricardo", "Smith");
        File file = new File("user.ser");
        try (FileOutputStream fos = new FileOutputStream(file);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(newUser1);
            //Aquí comprobamos que no se puede acceder al atributo del objeto
            System.out.println(newUser1.getName());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void deserializeObject() {

            try (FileInputStream fis = new FileInputStream("user.ser");
                 ObjectInputStream ois = new ObjectInputStream(fis)){
                User newUser2 = (User) ois.readObject();
                //Aquí comprobamos que si se puede acceder al atributo del objeto ya que este ha sido deserializado
                System.out.println(newUser2.getName());

            }catch(Exception e) {
                System.err.println("Error: " + e.getMessage());
            }

    }
}
