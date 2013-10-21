import java.util.Scanner;

public class BasicCalculatorDivide {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		double fnum, snum, answer;
		System.out.println("Enter your first number: ");
		fnum = input.nextDouble();
		System.out.println("Enter your secound number: ");
		snum = input.nextDouble();
		answer = fnum / snum;
		System.out.println(answer);
	}
}
