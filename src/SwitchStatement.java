public class SwitchStatement {
	public static void main(String args[]){
		int age = 2;
		
		switch (age){
		case 1:
			System.out.println("You can crawl");
		    break;
		case 2:
			System.out.println("You can talk");
		    break;
		case 3:
			System.out.println("You can get in trouble");
		    break;
		default:
			System.out.println("I don't know how old you're");
		}
	}
}