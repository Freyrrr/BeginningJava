public class NestingIfStatement {
	public static void main(String[] args) {
		int age = 60;
		
		if (age < 50) {
			System.out.println("You're young");
		}else {
			System.out.println("You're old");
			if (age > 75) {
				System.out.println("Your age is between 60-75");
			}else {
				System.out.println("Your age is 60 <");
			}
		}
	}
}
