package oops;

public class Employee {
	public String Name;
	public int EmpId;
	private static int Salary = 5000;

	public Employee(String var1, int var2) {
		Name = var1;
		EmpId = var2;
	}

	public Employee() {
		System.out.println("Inside Default constructor !");
	}

	public void DisplayName() {
		System.out.println("Name of the employee : " + Name);
	}

	public static void DisplaySallary() {
		System.out.println("Name of the employee : " + Salary);
	}

}
