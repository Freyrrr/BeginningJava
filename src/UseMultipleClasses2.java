import java.util.Scanner;

public class UseMultipleClasses2 {
	public static void main (String args[]){
	
		Scanner input = new Scanner(System.in);
		UseMultipleClasses1 UseMultipleClasses1Object = new UseMultipleClasses1();
		
		System.out.println("Enter your name: ");
		String name = input.nextLine();
		
		UseMultipleClasses1Object.simpleMessage(name);
	}
}