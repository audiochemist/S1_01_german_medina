package N1Ex5;
public class App {
    public static void main(String[] args) {
        PiValue piValue = () -> 3.141;
        double valorPi = piValue.getPiValue();

        System.out.println(valorPi);

    }
}
