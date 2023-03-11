package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {

		HashSet<String> set1 = new HashSet<String>();
		set1.add("John");
		set1.add("Smith");
		set1.add("Priya");
		set1.add("Priya");
		System.out.println("The Hashset Is : " + set1);

		TreeSet<String> set2 = new TreeSet<String>();
		set2.add("John");
		set2.add("Smith");
		set2.add("Priya");
		set2.add("Priya");
		System.out.println("The Treeset Is : " + set2);
		
		ArrayList<String> List1 = new ArrayList<String>(set1);
		System.out.println("The ArrayList Is : " + List1);

	}

}
