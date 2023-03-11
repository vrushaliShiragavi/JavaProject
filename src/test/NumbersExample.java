package test;

public class NumbersExample {

	public static void main(String[] args) {

		//System.out.println("sum = " + sum());
		
		int num1 = 10;
		int num2 = 20;
		int result = addition(num1, num2);
		System.out.println("sum = " + result);
		result = substraction(num1, num2);
		System.out.println("sub = " + result);
		
	}
	public static int addition(int a, int b) {
		return a + b;
	}
	public static int substraction(int a, int b) {
		return a - b;
	}
	public static int sum() {
		int num1 = 10;
		int num2 = 20;
		int result = num1+num2;
		System.out.println("done");
		return result;
	}

}
