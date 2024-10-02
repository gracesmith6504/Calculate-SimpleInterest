import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		Scanner input = new Scanner( System.in );
		System.out.println("What is the principal amount?");
		double principal = input.nextDouble();
		System.out.println("What is the daily interest rate (as a percentage)?");
		double dailyInterestRate = input.nextDouble();
		System.out.println("What is the number of days?");
		int numberOfDays = input.nextInt();
		input.close();

		double interest = principal * dailyInterestRate / 100.0 * ((double) numberOfDays);
		
		System.out.println("\nWith a principal amount of " + principal +
			", a daily interest rate of " + dailyInterestRate + ", for " + numberOfDays + 
			" days\nthe interest would be " + interest );
	}

}
