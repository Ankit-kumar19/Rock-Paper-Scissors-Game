package rockPaper;

import java.util.Random;
import java.util.Scanner;

public class rockPaper {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int userCount = 0;
        int computerCount = 0;
        System.out.println("Rock Paper Scissors Game");
        System.out.println("0 -> Rock , 1 -> Scissors , 2 -> Paper");

        for (int i = 0; i < 2; i++) {
            System.out.print("Enter your choice : ");
            int inp = sc.nextInt();
            int random = rand.nextInt(3);

            if (inp > 2) {
                System.out.println("Wrong Input Enter Again ");
            } else {

                if (random == 0 && inp == 0 || random == 1 && inp == 1 || random == 2 && inp == 2) {
                    System.out.println("computer's choice = " + random);
                    System.out.println("It's A Tie");
                }
                if (random != inp) {
                    if (random == 1 && inp == 0 || random == 2 && inp == 1 || random == 0 && inp == 2) {
                        System.out.println("comp = " + random);
                        System.out.println("User Wins");
                        userCount++;

                    } else {
                        System.out.println("comp = " + random);
                        System.out.println("computer Wins");
                        computerCount++;

                    }

                }

            }
            System.out.println("User's Score : " + userCount);
            System.out.println("Computer's Score : " + computerCount);
        }
        System.out.println("Final User's Score  : " + userCount + " Final Computer's Score : "+computerCount);
        if (userCount == computerCount) {
            System.out.println("It's A TIE !!!!");
        }
        if (userCount > computerCount) {
            System.out.println("User WINS !!!!");
        } 
        else {
            System.out.println("Computer WINS !!!");
        }

    }
}
