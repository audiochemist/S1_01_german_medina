import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Input {
    private static Scanner sc = new Scanner(System.in).useLocale(Locale.ENGLISH);

    public static byte readByte(String message) {
        System.out.println(message);

        byte value = 0;
        boolean valid = false;

        while (!valid) {
            try {
                value = sc.nextByte();
                valid = true;
            } catch (InputMismatchException e) {
                System.err.println("Please enter a valid byte.");
                sc.nextLine();
            }
        }

        return value;
    }

    public static int readInt(String message) {
        System.out.println(message);

        int value = 0;
        boolean valid = false;

        while (!valid) {
            try {
                value = sc.nextInt();
                valid = true;
            } catch (InputMismatchException e) {
                System.err.println("Please enter a valid integer.");
                sc.nextLine();
            }

        }

        return value;
    }

    public static float readFloat(String message) {
        System.out.println(message);

        float value = 0.0F;
        boolean valid = false;

        while (!valid) {
            try {
                value = sc.nextFloat();
                valid = true;
            } catch (InputMismatchException e) {
                System.err.println("Please enter a valid float");
                sc.nextLine();
            }
        }
        return value;
    }

    public static double readDouble(String message) {
        System.out.println(message);

        double value = 0.0;
        boolean valid = false;

        while (!valid) {
            try {
                value = sc.nextDouble();
                valid = true;
            } catch (InputMismatchException e) {
                System.err.println("Please enter a valid double");
                sc.nextLine();
            }
        }

        return value;
    }

    public static char readChar(String message) {
        System.out.println(message);

        char value = ' ';
        boolean valid = false;

        while (!valid) {
            try {
                value = sc.next().charAt(0);
                valid = true;
            } catch (Exception e) {
                System.err.println("Please enter a valid character");
                sc.nextLine();
            }
        }
        return value;
    }

    public static String readString(String message) {
        System.out.println(message);

        String value = "";
        boolean valid = false;

        while (!valid) {
            try {
                value = sc.next();
                if (value.isEmpty()) {
                    throw new Exception();
                } else {
                    sc.nextLine();
                    valid = true;
                }
            } catch (Exception e) {
                System.err.println("Please enter a valid String");
                sc.nextLine();

            }
        }
        return value;
    }

    public static boolean readBoolean(String message) {
        System.out.println(message);
        String sameValue = sc.next();
        boolean value = false;
        boolean valid = false;


        while (!valid) {
            try {
                value = sc.nextBoolean();
                valid = true;
            } catch (Exception e) {
                if (sameValue.equalsIgnoreCase("y")) {
                    value = true;
                    valid = true;
                } else if (sameValue.equalsIgnoreCase("n")) {
                    value = false;
                    valid = true;
                } else {
                    System.err.println("Please enter a valid boolean");
                    sc.nextLine();
                }
            }
        }
        return value;

    }

}

