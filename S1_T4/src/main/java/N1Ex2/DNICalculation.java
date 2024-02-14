package N1Ex2;

public class DNICalculation {


    public static String calculateDNILetter(int dni) {

        char[] letters = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B',
                'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        char letter  = letters [dni % 23];

        return dni + " " + letter;

    }


}
