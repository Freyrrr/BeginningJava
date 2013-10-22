import java.util.Scanner;

public class AveragingProgram {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int counter = 0;
		int num;
		int average;
		int total = 0;
		int amount;
		
		System.out.println("This is a basic averaging program");
		System.out.println("First enter how many numbers you are going to use");
		amount = input.nextInt();
		System.out.println("Now enter the numbers you want to find the average of");
		
		while (counter < amount) {
			num = input.nextInt();
			total = total + num;
			counter++;
		}
		average = total/amount;
		System.out.println("Your average is " + average);
	}
}