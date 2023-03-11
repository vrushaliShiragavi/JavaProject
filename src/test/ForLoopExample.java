package test;

public class ForLoopExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*for (int i = 0; i < 11; i++) {
			System.out.println(i);
		}
		System.out.println("End of first loop");
		for (int j = 10; j > 0; j -= 2) {
			// if (j % 2 == 0) {
			System.out.println(j);
			// j--;
			// }
		}
		System.out.println("End of second loop");
		System.out.println("Table of 2");
		int num = 2;
		for (int i = 1; i < 11; i++) {
			System.out.println(num * i);
			// System.out.printf("%d * %d = %d \n" , num , i, num*i);
		}
		System.out.println("End Table of 2");*/
		int[] arr1 = {2,3,4,6,8,9};
		/*for(int i = 0;i<arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		for(int val :arr1) {
			System.out.println(val);
		}*/
		String s = "vrushali";
		char[] charArray = s.toCharArray();
		for(int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
		}
		for(char c: charArray) {
			System.out.println(c);
		}
		

	}

}
