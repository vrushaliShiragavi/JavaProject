package test;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "shivam";
		String name1 = "john is from the us";
		System.out.println("number of character in string is : " + name.length());
		System.out.println("the 4th char in the string is " + name1.charAt(3));
		System.out.println("the last char in the string is " + name1.charAt(name1.length()-1));
		System.out.println("the string in uppercase : " + name1.toUpperCase());

	}

}
