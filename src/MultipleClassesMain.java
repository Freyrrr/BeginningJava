import java.util.Scanner;

public class MultipleClassesMain {
	public static void main (String[] args) {
		
		Scanner input = new Scanner (System.in);
		MultibleClasses MultibleClassesObject = new MultibleClasses ();
		
		System.out.println("Enter your name here: ");
		String name = input.nextLine();
		
		MultibleClassesObject.messageName(name);
		
	}

}
