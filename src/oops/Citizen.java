package oops;

public class Citizen extends Person {
	public int SSN;

	public Citizen() {
		System.out.println("Inside default constructor of citizen! ");
	}

	public Citizen(String Name, String CountryName, int age, int SSN) {
		System.out.println("Inside parameterised constructor !");
		this.Name = Name;
		this.Countryname = CountryName;
		this.age = age;
		this.SSN = SSN; 
	}
	public void Print() {
		System.out.println("Citizen print()");
	}

}
