import java.util.Scanner;

public class ClubMain {

	public static void main (String args[]){
		
		Scanner input = new Scanner (System.in);
		double cash, age;
		
		System.out.println("Welcome to the club!");
		System.out.println("Fill in some info about yourself to enter");
		
		System.out.println("Enter your name:");
		String name = input.nextLine();
		
		System.out.println ("How old are you? " + name);
		age = input.nextDouble();
		
		System.out.println("How much can you pay? " + name);
		cash = input.nextDouble();
		
		if (age > 15 && 499 < cash){
			System.out.println("You can enter the club " + name);
		}
		else {
			System.out.println(name + " you can't enter.");
		}
		
	}
}
