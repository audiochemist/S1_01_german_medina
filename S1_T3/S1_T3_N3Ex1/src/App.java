import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class App {
    static int toCompareOption;
    static ArrayList<User> usersList = new ArrayList<>();


    public static void main(String[] args) {

        start();

    }

    public static void start() {
        int option;

        do {
            option = menu();
            usersList = readFile();

            switch (option) {
                case 1:
                    enterUser();
                    break;
                case 2:
                    showNameAZ();
                    break;
                case 3:
                    showNameZA();
                    break;
                case 4:
                    showSurnameAZ();
                    break;
                case 5:
                    showSurnameZA();
                    break;
                case 6:
                    showDNI91();
                    break;
                case 7:
                    showDNI19();
                    break;
                case 0:
                    System.out.println("Goodbye!");
                    break;

            }

        }
        while (option != 0);

    }

    public static int menu() {

        int menuOption;

        menuOption = Input.readInt("\nMenu:" +
                "\n0. Exit App" +
                "\n1. Enter User" +
                "\n2. Show Users per name (A-Z)" +
                "\n3. Show Users per name (Z-A)" +
                "\n4. Show Users per surname (A-Z)" +
                "\n5. Show Users per surname (Z-A)" +
                "\n6. Show Users per DNI (9-1)" +
                "\n7. Show Users per DNI (1-9)");

        return menuOption;

    }

    public static ArrayList<User> readFile() {
        FileReader file;
        BufferedReader reader;
        String line;

        //leemos el archivo y lo guardamos en un arrayList de tipo User
        try {
            file = new FileReader("file - Hoja 1.csv");
            if (file.ready()) {
                reader = new BufferedReader(file);

                while ((line = reader.readLine()) != null) {
                    // Divide la línea en clave y valor usando el espacio como separador
                    if (!line.isEmpty()) {
                        String[] row = line.split(","); // Usa la coma como separador, ya que es un csv
                        User user = new User(row[0], row[1], row[2]);
                        // Si el usuario no está en la lista, lo agregamos
                        if (!usersList.contains(user)) {
                            usersList.add(user);
                        }


                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());

        }
    return usersList;
    }

    public static void enterUser() {

        String name = Input.readString("Enter user's name: ");
        String surname = Input.readString("Enter user's surname: ");
        String dni = Input.readString("Enter their DNI: ");
        User newUser = new User(name, surname, dni);

            try (BufferedWriter writer = new BufferedWriter(new FileWriter("file - Hoja 1.csv", true))) {
                String line = newUser.getNAME() + "," + newUser.getSURNAME() + "," + newUser.getDNI() + "\n";
                writer.write(line);
                System.out.println("User added to the file correctly");
            } catch (IOException e) {
                e.printStackTrace();
            }


    }

    public static void showNameAZ() {
        toCompareOption = 1;
        TreeSet<User> usersTreeSet = new TreeSet<>(usersList);
        showUsers(usersTreeSet);

    }

    public static void showNameZA() {
        toCompareOption = 2;
        TreeSet<User> usersTreeSet = new TreeSet<>(usersList);
        showUsers(usersTreeSet);
    }

    public static void showSurnameAZ() {
        toCompareOption = 3;
        TreeSet<User> usersTreeSet = new TreeSet<>(usersList);
        showUsers(usersTreeSet);
    }

    public static void showSurnameZA() {
        toCompareOption = 4;
        TreeSet<User> usersTreeSet = new TreeSet<>(usersList);
        showUsers(usersTreeSet);
    }

    public static void showDNI91() {
        toCompareOption = 5;
        TreeSet<User> usersTreeSet = new TreeSet<>(usersList);
        showUsers(usersTreeSet);
    }

    public static void showDNI19() {
        toCompareOption = 6;
        TreeSet<User> usersTreeSet = new TreeSet<>(usersList);
        showUsers(usersTreeSet);
    }

    public static void showUsers(TreeSet<User> usersTreeSet) {
        System.out.println("___Name___ ____Surname___    __NIF__");

        Iterator<User> iterator = usersTreeSet.iterator();
        while (iterator.hasNext()) {
            User user = iterator.next();
            System.out.printf("%-10s %-18s %-20s\n", user.getNAME(), user.getSURNAME(), user.getDNI());
        }

    }


}



