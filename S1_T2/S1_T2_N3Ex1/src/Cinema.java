import java.util.Scanner;

public class Cinema {
    static Scanner sc = new Scanner(System.in);
    static int numRows;
    static int numSeatsPerRow;

    public Cinema() {
        HandleSeats handleSeats = new HandleSeats();
        provideData();
    }
    public void start() {
        int option;
        do {
            option = menu();
            boolean valid = false;
            while (!valid) {
                try {
                    handleOption(option);
                    valid = true;
                }catch (IncorrectNameException e) {
                    System.err.println("Error: " + e.getMessage() + "\nPlease enter a valid form of names without digits");
                } catch (IncorrectSeatNumException e) {
                    System.err.println("Error: " + e.getMessage() + "\nPlease enter a valid seat number");
                } catch (IncorrectRowException e) {
                    System.err.println("Error: " + e.getMessage() + "\nPlease enter a valid row number");
                } catch (TakenSeatException e) {
                    System.err.println("Error: " + e.getMessage() + "\nThis seat is already taken, choose another one");
                } catch (FreeSeatException e) {
                    System.err.println("Error: " + e.getMessage() + "\nThis seat is free - you can't cancel its reservation");
                } catch (Exception e) {
                    System.err.println("An unexpected error occurred: " + e.getMessage());
                }
            }
        } while (option != 0) ;
    }

    private void handleOption(int option) throws Exception {
        switch (option) {
            case 0:
                System.out.println("Goodbye");
                break;
            case 1:
                showSeats();
                break;
            case 2:
                showSeatsUser();
                break;
            case 3:
                reserveSeat();
                break;
            case 4:
                cancelReservation();
                break;
            case 5:
                cancelReservationUser();
                break;
        }
    }

    public int menu() {

        int menuOption;

                System.out.println("\nMenu:" +
                        "\n0. Exit App" +
                        "\n1. Show all reserved seats" +
                        "\n2. Show reserved seats by a user" +
                        "\n3. Reserve a seat" +
                        "\n4. Cancel reservation of a seat" +
                        "\n5. Cancel all reservations of a user");

                    menuOption = sc.nextInt();

                return menuOption;

    }

    public void showSeats(){

        for (Seat seat : HandleSeats.getSeats()) {
            System.out.println(seat.toString());
        }

    }

    public void showSeatsUser() throws IncorrectNameException {
        int countMatch = 0;

        for (int i = 0; i < HandleSeats.getSeats().size(); i++) {
            if ((HandleSeats.getSeats().get(i).getNameReservation().equalsIgnoreCase(enterUser()))) {
                System.out.println(HandleSeats.getSeats().get(i).toString());
                countMatch++;
            }
        }
        if (countMatch == 0) {
            System.out.println("No reservation found under this name");
        }
    }
    public void reserveSeat() throws TakenSeatException, IncorrectNameException, IncorrectRowException, IncorrectSeatNumException {
        Seat seatToReserve = new Seat(enterRow(), enterSeatNum(), enterUser());
        HandleSeats.addSeat(seatToReserve);
    }
    public void cancelReservation() throws FreeSeatException, IncorrectRowException, IncorrectSeatNumException {
        HandleSeats.removeSeat(enterRow(), enterSeatNum());
    }
    public void cancelReservationUser() throws IncorrectNameException {
        int countMatch = 0;

        for (int i = 0; i < HandleSeats.getSeats().size(); i++) {
            if ((HandleSeats.getSeats().get(i).getNameReservation().equalsIgnoreCase(enterUser()))) {
                HandleSeats.getSeats().remove(HandleSeats.getSeats().get(i));
                countMatch++;
            }
        }
        if (countMatch == 0) {
            System.out.println("No reservation found under this name");
        }else{
            System.out.println("All reservations under this name were successfully cancelled");

        }

    }
    public String enterUser() throws IncorrectNameException {

        String userName = Input.readString("Please enter your name");
        int i = 0;

        while (i < userName.length()){
            char c = userName.charAt(i);
            if (Character.isDigit(c)) {
                throw new IncorrectNameException("This name contains digits");
            }
            i++;
        }

        return userName;

    }
    public static int enterRow() throws IncorrectRowException {

        int row = Input.readInt("Please enter the seat row");

        if (row < 1 || row > numRows){
            throw new IncorrectRowException("This Row Number is invalid");
        }

            return row;

    }
    public static int enterSeatNum() throws IncorrectSeatNumException {

        int seatNum = Input.readInt("Please enter the seat number");

        if (seatNum < 1 || seatNum > numSeatsPerRow){
            throw new IncorrectSeatNumException("This Seat Number is invalid");
        }

        return seatNum;
    }

    public void provideData(){

        numRows = Input.readInt("How many rows has the cinema room?");
        numSeatsPerRow = Input.readInt("How many seats has it?");
    }

}
