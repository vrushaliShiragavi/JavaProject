package test;

public class ReverseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "racecar";
		String result = "";
		char[] charArray = s.toCharArray();
		for (int i = s.length()-1; i >= 0; i--) {
			System.out.println(s.charAt(i));
			result = result + s.charAt(i);
		}
		System.out.println(result);
		if(s.equalsIgnoreCase(result)) {
			System.out.println("palindrom");
		}else {
			System.out.println("not palindrom");
		}
		String spaceArray = "David meets radha and lily";
		String[] s1 = spaceArray.split(" ");
		String result1 = "";
		for(int i = s1.length-1; i >=0; i--) {
			result1+= s1[i] + " ";
		}
		System.out.println(result1.trim());

	}

}
