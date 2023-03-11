package test;
import java.util.Scanner;

public class ConditionsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*int age = 18;
		if(age > 18) {
			System.out.println("You are elligible for voting .");
		}
		else if(age < 18) {
			System.out.println("You are not elligible for voting .");
			
		}
		else {
			System.out.println("You must be 18");
		}*/
		
			// TODO Auto-generated method stub
			/*int age = 1;
			
			if(age>30 || age<18) {
			
			System.out.println("Am not eligible to write the Bank Exams");
			
			}else if(age == 30) {
				System.out.println("Am eligible to write the banck exams only this year");
			}else {
				System.out.println("Hey eligible");		
				
			}*/
		
		int age;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the Age ");
		
		age = scanner.nextInt();
		
		if(age<17) {
			
			System.out.println("You are not eligible for voting");
			
		}else if(age == 17) {
			
			System.out.println("You will be eligible for voting next year");
		}else {
			
			System.out.println("You are eligible for voting");
		}	
		scanner.close();
	}

}
