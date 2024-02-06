import java.io.*;
import java.util.*;

public class App {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<User> users = new ArrayList<>();


    public static void main(String[] args) {


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
                        // Divide la línea en clave y valor usando el espacio como separador
                        String[] row = line.split(","); // Usa la coma como separador, ya que es un csv
                        User user = new User(row[0], row[1],row[2]);
                        users.add(user);

                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());

        }



        int menuOption;

        do {

            System.out.println("\nMenu:" +
                    "\n0. Exit App" +
                    "\n1. Enter User" +
                    "\n2. Show Users per name (A-Z)" +
                    "\n3. Show Users per name (Z-A)" +
                    "\n4. Show Users per surname (A-Z)" +
                    "\n5. Show Users per surname (Z-A)" +
                    "\n6. Show Users per DNI (1-9)" +
                    "\n7. Show Users per DNI (1-9)");

            menuOption = sc.nextInt();


            switch (menuOption){
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
                    showDNI19();
                    break;
                case 7:
                    showDNI91();
                    break;
                case 0:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("This is not a valid option");
            }

        }while(menuOption != 0);



    }

    public static void enterUser() {
        System.out.print("Enter the name: ");
        String name = sc.next();
        sc.nextLine();
        System.out.print("Enter the surname: ");
        String surname = sc.next();
        sc.nextLine();
        System.out.print("Enter DNI: ");
        String dni = sc.next();

        User newUser = new User(name, surname, dni);
        users.add(newUser);


        try (BufferedWriter writer = new BufferedWriter(new FileWriter("file - Hoja 1", true))) {
            String line = newUser.getNAME() + "," + newUser.getSURNAME() + "," + newUser.getDNI() + "\n";
            writer.write(line);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("User added to the file correctly");

    }

    public static void showUsers() {
        System.out.println("___Name___ ____Surname___    __NIF__");

        for (User user : users) {
            System.out.printf("%-10s %-18s %-20s\n", user.getNAME(), user.getSURNAME(), user.getDNI());
        }
    }
    public static void showNameAZ() {
        users.sort(Comparator.comparing(User::getNAME));
        showUsers();
    }

    public static void showNameZA() {
        users.sort(Comparator.comparing(User::getNAME).reversed());
        showUsers();
    }

    public static void showSurnameAZ() {
        users.sort(Comparator.comparing(User::getSURNAME));
        showUsers();
    }
    public static void showSurnameZA() {
        users.sort(Comparator.comparing(User::getSURNAME).reversed());
        showUsers();
    }
    public static void showDNI19() {
        users.sort(Comparator.comparing(User::getDNI));
        showUsers();
    }
    public static void showDNI91() {
        users.sort(Comparator.comparing(User::getDNI, Comparator.reverseOrder()));
        showUsers();
    }



    }

