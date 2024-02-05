import java.util.ArrayList;

public class HandleSeats {

   private static ArrayList<Seat> seats;

   public HandleSeats() {
      seats = new ArrayList<>();
   }

   public static ArrayList<Seat> getSeats() {

      return seats;
   }

   public static void addSeat(Seat seatToReserve) throws TakenSeatException {

      if (searchSeat(seatToReserve.getRow(), seatToReserve.getSeatNum()) != -1) {
         throw new TakenSeatException("Seat already occupied");
      }

      seats.add(seatToReserve);

   }


   public static void removeSeat(int row, int seatNum) throws FreeSeatException {

      if (searchSeat(row, seatNum) == -1) {
         throw new FreeSeatException("No reservations for this seat");
      }

      seats.remove(searchSeat(row, seatNum));
      System.out.println("The reservation was successfully cancelled");

   }
   public static int searchSeat(int row, int seatNum){
      boolean match = false;
      int foundIndex = -1;
      int i = 0;

         while (i < seats.size() && !match) {
            if ((seats.get(i).getRow() == row) && (seats.get(i).getSeatNum() == seatNum)) {
               match = true;
               foundIndex = i;
            }
            i++;
         }

      return foundIndex;
   }



}
