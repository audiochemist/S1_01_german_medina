import java.util.Objects;

public class Seat {

    private int row;
    private int seatNum;
    private String nameReservation;

    public Seat(int row, int seatNum, String nameReservation) {
        this.row = row;
        this.seatNum = seatNum;
        this.nameReservation = nameReservation;
    }

    public int getRow() {
        return row;
    }

    public int getSeatNum() {
        return seatNum;
    }

    public String getNameReservation() {
        return nameReservation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Seat seat)) return false;
        return getRow() == seat.getRow() && getSeatNum() == seat.getSeatNum() && Objects.equals(getNameReservation(), seat.getNameReservation());
    }

    @Override
    public String toString() {
        return "Seat{" +
                "row=" + row +
                ", seatNum=" + seatNum +
                ", nameReservation='" + nameReservation + '\'' +
                '}';
    }
}
