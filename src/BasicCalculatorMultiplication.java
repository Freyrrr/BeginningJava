import java.util.Scanner; 

public class BasicCalculatorMultiplication {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		double fnum, snum, answer;
		System.out.println("Enter your first number here: ");
		fnum = input.nextDouble();
		System.out.println("Enter your secound number here: ");
		snum = input.nextDouble();
		answer = fnum * snum;
		System.out.println(answer);
	}
}
