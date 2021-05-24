package rockPaper;

import java.util.Random;
import java.util.Scanner;

public class rockPaper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Random rand = new Random();
		int random = rand.nextInt(3);
		
		System.out.println("Rock Paper Scissors Game");
		System.out.println("0 -> Rock , 1 -> Scissors , 2 -> Paper");
		System.out.print("Enter your choice : ");
		
		int inp = sc.nextInt();
		sc.close();
		
		if(inp>2) {
			System.out.println("Wrong Input");
		}
		else {
			if(random==0 && inp==0 || random==1 && inp==1 || random==2 && inp==2 ) {
				System.out.println("comp = "+random);
				System.out.println("Tie");
			}
			if (random != inp) {
				if(random == 1 && inp == 0 || random == 2 && inp ==1 || random == 0 && inp == 2) {
					System.out.println("comp = "+random);
					System.out.println("User Wins");
				}
				else {
					System.out.println("comp = "+random);
					System.out.println("computer Wins");
				}
			}
		}
	}
}
