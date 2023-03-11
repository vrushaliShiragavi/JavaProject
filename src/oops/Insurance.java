package oops;

public class Insurance extends Citizen {
	public int insuranceId;
	public Insurance() {
		super();
		System.out.println("Iside default constructor of Insuranc !");
	}
	public void Print() {
		super.Print();
		System.out.println("Inside Insurance print()");
	}
}
