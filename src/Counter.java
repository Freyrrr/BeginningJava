import java.util.Scanner;

public class Counter {
	public static void main(String args[]){
	Scanner ran = new Scanner(System.in);
	int countstop, countstart;
	
	System.out.println("Hello");
	System.out.println("This is a simple counter");
	System.out.println("First you type your starting number and then the number where the counter stops");
	
	System.out.println("Enter your starting number: ");
	countstart = ran.nextInt();
	
	System.out.println("Enter your final number: ");
	countstop = ran.nextInt();
	countstop++;
	
	     while (countstart < countstop){
	    	 System.out.println(countstart);
	    	 countstart++;
	     }
	System.out.println("Made by: Freyr29");
	}
}