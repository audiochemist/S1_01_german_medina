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

            switch (option) {
                    case 0:
                        System.out.println("Goodbye");
                        break;
                    case 1:
                        showSeats();
                        break;

                    case 2:
                        boolean valid = false;
                        while (!valid) {
                            try {
                                showSeatsUser();
                                valid = true;
                            } catch (IncorrectNameException e) {
                                System.out.println("Please enter a valid form of names without digits");
                            }
                        }
                        break;
                    case 3:
                        valid = false;
                        while (!valid) {
                            try {
                                reserveSeat();
                                valid = true;
                            } catch (IncorrectNameException e) {
                                System.out.println("Please enter a valid form of names without digits");
                            } catch (IncorrectRowException e) {
                                System.out.println("Please enter a valid row number");

                            } catch (IncorrectSeatNumException e) {
                                System.out.println("Please enter a valid seat number");

                            } catch (TakenSeatException e) {
                                System.out.println("This seat is already taken, choose another one");
                            }
                        }
                        break;
                    case 4:
                        valid = false;
                        while (!valid) {
                            try {
                                cancelReservation();
                                valid = true;
                            } catch (IncorrectRowException e) {
                                System.out.println("Please enter a valid row number");

                            } catch (IncorrectSeatNumException e) {
                                System.out.println("Please enter a valid seat number");

                            } catch (FreeSeatException e) {
                                System.out.println("This seat is free - you can't cancel its reservation");
                            }
                        }

                        break;

                    case 5:
                        valid = false;

                        while (!valid) {
                            try {
                                cancelReservationUser();
                                valid = true;
                            } catch (IncorrectNameException e) {
                                System.out.println("Please enter a valid form of names without digits");

                            }
                        }
                            break;
                        }


        }while(option != 0);

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

        System.out.println("Please enter your name");
        String userName = sc.next();
        int i = 0;

        while (i < userName.length()){
            char c = userName.charAt(i);
            if (Character.isDigit(c)) {
                throw new IncorrectNameException("This name cannot contain any digits");
            }
            i++;
        }

        return userName;

    }
    public static int enterRow() throws IncorrectRowException {
        System.out.println("Please enter the seat row");
        int row = sc.nextInt();

        if (row < 1 || row > numRows){
            throw new IncorrectRowException("This Row Number is invalid");
        }

            return row;

    }
    public static int enterSeatNum() throws IncorrectSeatNumException {
        System.out.println("Please enter the seat number");
        int seatNum = sc.nextInt();

        if (seatNum < 1 || seatNum > numSeatsPerRow){
            throw new IncorrectSeatNumException("This Seat Number is invalid");
        }

        return seatNum;
    }

    public void provideData(){
        System.out.println("How many rows has the cinema room?");
        numRows = sc.nextInt();
        System.out.println("How many seats has it?");
        numSeatsPerRow = sc.nextInt();
    }



}
