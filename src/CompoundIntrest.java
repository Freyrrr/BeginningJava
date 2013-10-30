
public class CompoundIntrest {
	public static void main (String[] args) {
		
		double amount;
		double principal = 100;
		double rate = 0.1;
		
		for (int year=1;year<=10;year++) {
			amount=principal*Math.pow(rate + 1, year);
			System.out.println(year+ "     " +amount);
		}
	}
}