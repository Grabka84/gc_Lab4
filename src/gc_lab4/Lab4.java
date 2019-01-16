package gc_lab4;

import java.util.Scanner;

public class Lab4 {

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);
		int n;
		String userContinue;
		
		System.out.println("Learn your squares and cubes!");
		
		do {
			System.out.println("Please enter an integer: ");
			n = userInput.nextInt();
			userInput.nextLine();
		
			System.out.println();
			System.out.println("Number\tSquared\tCubed");
			System.out.println("======\t=======\t=====");
		
			for(int i = 0; i < n; i++) {
				int x = i + 1;
				System.out.println((x) + "\t" + (x*x) + "\t" + (x*x*x));
			}
			
			System.out.println();
			System.out.println("Multiplication Table");
			System.out.println("====================");
			for(int i = 0; i < n; i++) {
				int x = i + 1;
				System.out.print("\t" + x);
			}
			
			System.out.println();
			
			for(int i = 0; i < n; i++) {
				System.out.print("\t" + "-----");
			}
			
			System.out.println();
			
			for(int i = 0; i < n; i++) {
				int x = i + 1;
				System.out.print(x + "  |  " + "\t");
					for(int j = 0; j < n; j++) {
						int y = j + 1;
						System.out.print((x * y) + "\t");
					}
					System.out.println();
			}
		
			System.out.println();
			System.out.println("Would you like to continue? (y/n)");
			userContinue = userInput.nextLine();
			
		} while(userContinue.charAt(0) == 'y' || userContinue.charAt(0) == 'Y'); 
		
		userInput.close();
	}
}
