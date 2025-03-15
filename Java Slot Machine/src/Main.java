import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        //Declare variable

        Scanner scanner =  new Scanner(System.in);
        int balance = 100;
        int bet;
        int payout;
        String[] row;
        String playAgain;

        // Display welcome message
        System.out.println("-----------------------------");
        System.out.println("Welcome to Java Slot Machine");
        System.out.println("Symbols:\uD83C\uDF52\uD83C\uDF49\uD83C\uDF4D\uD83D\uDD14\uD83C\uDF1F");

        // play if balance > 0

        while(balance > 0){
            System.out.println("current Balance: $"+balance);
            // enter bet amount
            System.out.print("place your bet amount:");
            bet = scanner.nextInt();
            scanner.nextLine();

            //  verify if bet > balance
            if(bet > balance){
                System.out.println("Insufficient Balance");
                continue;
            }
            //  verify if  bet > 0
            else if (bet <= 0) {
                System.out.println("Bet must be greater than zero..!!");
            }else {
                //  subtract bet from balance
                balance -= bet;
            }

            //Spin row
            System.out.println("Spinning...!!");
            row = spinRow();
            // print row
            printRow(row);
            // get payout
            payout = getPayout(row, bet);

            if (payout > 0){
                System.out.println("You Won $" + payout);
                balance += payout;
            }else {
                System.out.println(" You lost this round..!!");
            }
            // ask to play again
            System.out.print(" Do you want to play again(Y/N):");
            playAgain = scanner.nextLine().toUpperCase();

            if (!playAgain.equals("Y")){
                break;
            }

        }

        // Display exit message
        System.out.println("Game Over..!!!");
        System.out.println("Your Current Balance is $" + balance);

        scanner.close();
    }

    static String[] spinRow(){

        String[] symbols = {"🍒","🍉","🍍","🔔","🌟"};
        String[] row = new String[3];
        Random random = new Random();

        for (int i = 0; i < 3; i++){
            row[i] = symbols[random.nextInt(symbols.length)];
        }
        return row;
    };

    static  void printRow(String[] row){
        System.out.println("----------------------");
        System.out.println(" " + String.join(" | " , row));
        System.out.println("----------------------");

    }

    static int getPayout(String[] row, int bet){

        if (row[0].equals(row[1]) && row[1].equals(row[2])){
            return switch (row[0]){
                case "🍒" -> bet * 3;
                case "🍉" -> bet * 4;
                case "🍍" -> bet * 5;
                case "🔔" -> bet * 10;
                case "🌟" -> bet * 20;
                default -> 0;
            };
        } else if (row[0].equals(row[1])){
            return switch (row[0]){
                case "🍒" -> bet * 2;
                case "🍉" -> bet * 3;
                case "🍍" -> bet * 4;
                case "🔔" -> bet * 5;
                case "🌟" -> bet * 10;
                default -> 0;
            };
        }else if (row[1].equals(row[2])) {
            return switch (row[1]) {
                case "🍒" -> bet * 2;
                case "🍉" -> bet * 3;
                case "🍍" -> bet * 4;
                case "🔔" -> bet * 5;
                case "🌟" -> bet * 10;
                default -> 0;
            };
        }
        return 0;
    };

}
