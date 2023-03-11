package oops;

public class RunnerClass {

	public static void main(String[] args) {
		/* Employee emp1 = new Employee();
		emp1.Name = "Vrushali";
		emp1.EmpId = 1000;
		emp1.DisplayName();
		
		Employee emp2 = new Employee();
		emp2.Name = "Shivananda";
		emp2.EmpId = 2000;
		emp2.DisplayName();
		
		Employee.DisplaySallary();*/
		
		/*Citizen ct1 = new Citizen();
		ct1.age = 50;
		ct1.Name = "Mike";
		ct1.SSN = 12345;
		ct1.Countryname = "India";
		ct1.Print();
		Citizen ct2 = new Citizen("Rahul", "India", 30 ,6789);
		ct2.Print();
		Insurance obj1 = new Insurance();
		obj1.insuranceId = 3000;
		obj1.Print();*/		
		
		EncapsulationExaample exp = new EncapsulationExaample();
		exp.setEmpId(5000);
		System.out.println("The salary is : " + exp.getEmpId());
	}

}
