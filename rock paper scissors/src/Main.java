import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"rock","paper","scissor"};
        String playerChoice;
        String computerChoice;
        String playAgain = "yes";

        do {
            System.out.print("Enter your Choice (rock, paper,scissor) :");
            playerChoice = scanner.nextLine().toLowerCase();

            if (!playerChoice.equals("rock") && !playerChoice.equals("paper") && !playerChoice.equals("scissor")){
                System.out.println("invalid");
                continue;
            }

            computerChoice = choices[random.nextInt(3)];
            System.out.println("computers choice:" + computerChoice);

            if (playerChoice.equals(computerChoice)){
                System.out.println("It is a tie");
            } else if ((playerChoice.equals("rock") && computerChoice.equals("scissor")) || (playerChoice.equals("paper") && computerChoice.equals("rock") || (playerChoice.equals("scissor") && computerChoice.equals("paper")))) {
                System.out.println("You Win..!!!!");
            }else {
                System.out.println("You Lose");
            }

            System.out.println("play Again (yes,no) : ");
            playAgain = scanner.nextLine().toLowerCase();
        }while (playAgain.equals("yes"));

        System.out.println("Thanks for Playing");



        scanner.close();

    }
}
