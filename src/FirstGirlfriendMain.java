import java.util.Scanner;

public class FirstGirlfriendMain {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		FirstGirlfriendSec FGSObject = new FirstGirlfriendSec();
		System.out.println("Enter name of your first girlfriend here: ");
		String temp = input.nextLine();
		FGSObject.setName(temp);
		FGSObject.saying();
	}
}