package N2Ex3;

public class App {

    public static void main(String[] args) {

        OperationsInterface operation =
                (num1, operator, num2) -> switch (operator) {
                    case '+' -> num1 + num2;
                    case '-' -> num1 - num2;
                    case '*' -> num1 * num2;
                    case '/' -> num1 / num2;
                    default -> throw new IllegalArgumentException("This is not a valid operator");
                };

        try {
           System.out.println(operation.operation(4, '+', 4));
           System.out.println(operation.operation(4, '-', 4));
           System.out.println(operation.operation(4, '*', 4));
           System.out.println(operation.operation(4, '/', 4));

        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

    }

}
