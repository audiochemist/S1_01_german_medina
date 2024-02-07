public class App {

    public static void main(String[] args) {

        Input input = new Input();

        byte age = (Input.readByte("Enter your age:"));
        int years = (Input.readInt("Enter your years of experience in the sector:"));
        float exactYears = (Input.readFloat("Enter the exact number of years with decimals"));
        double amountPTO = (Input.readDouble("Enter the amount of days off you have left"));
        char char1 = (Input.readChar("Enter your favourite character on the keyboard"));
        String comment = (Input.readString("Please describe your current routine"));
        boolean answerYN = (Input.readBoolean("Do you like spaghetti carbonara?"));
    }
}
