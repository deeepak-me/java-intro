import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        //Questions Array[]

        String[] questions = {"what is the main function of a router?",
                "Which part of the computer is considered as brain",
                "What year was facebook launched?",
                "Who is the father of computer?",
                "what is the first programming language?"
        };

        // Option Array[]

        String[][] options = {{"1. Storing Files", "2. Encrypting Data", "3. Directing internet Traffic", "4. Managing Passwords"},
                {"1. CPU ","2. Hard drive ","3. RAM", "4. GPU"},
                {"1.2000 ","2. 2004 ","3. 2006 ","4. 2008 "},
                {"1. Steve Jobs ","2. Bill Gates ","3. Allen Turing ","4. Charles Babage "},
                {"1. COBOL ","2. C","3. FORTRAN ","4. Assembly "},
        };

        //Declare Variables

        int[] answers = {3,1,2,4,3};
        int score = 0;
        int guess;

        Scanner scanner = new Scanner(System.in);

        //Welcome Message

        System.out.println("-----------------------------------");
        System.out.println("Welcome to Java Quiz Game");
        System.out.println("------------------------------------");

        //Question (loop)

        for (int i = 0; i< questions.length; i++){
            System.out.println(questions[i]);
            //  options
            for (String option : options[i]){
                System.out.println(option);
            }
            System.out.println("-----------------------------------");

            //  Get guess from User
            System.out.print("Enter your answer :");
            guess = scanner.nextInt();

            //  Check our Guess
            if (guess == answers[i]){
                System.out.println("Correct");
                System.out.println("-----------------------------------");
                score ++;

            }else {
                System.out.println("Wrong");
                System.out.println("-----------------------------------");

            }

        }

        //Display final score
        System.out.printf("Your Final Score is %d out of %s", score,questions.length);

        scanner.close();

    }
}
