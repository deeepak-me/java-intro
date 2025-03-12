import java.util.Scanner;

public class Main {
    public  static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double num1;
        double num2;
        char operator;
        double result = 0;
        boolean validOperator = true;

        System.out.print("Enter Num1 :");
        num1 = scanner.nextDouble();
        System.out.println("Enter an operator(+,-,*,/,^):");
        operator = scanner.next().charAt(0);
        System.out.print("Enter num2:");
        num2 = scanner.nextDouble();

        switch (operator){
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if (num2 == 0){
                    System.out.println("cannot divide by 0");
                    validOperator = false;
                }else {
                    result = num1 / num2;
                }
            }
            case '^' -> result = Math.pow(num1, num2);
            default -> {
                System.out.println("invalid operator");
                validOperator = false;
            }

        }

        if (validOperator) {
            System.out.println(result);
        }

        scanner.close();
    }
}
