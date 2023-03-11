package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		String[] names = {"john", "sai", "Leena", "Priya"};
		System.out.println("The second name is : " + names[1]);
		ArrayList<String> List1 = new ArrayList<String>();
		List1.add("John");
		List1.add("Smith");
		List1.add("Priya");
		List1.add("Priya");
		System.out.println("The List Is : " + List1);
		System.out.println("The size of th list is : " + List1.size());
		System.out.println("Firsts name in List the list is : " + List1.get(0));
		System.out.println("Last name in the list is : " + List1.get(List1.size()-1));
		List1.set(0, "vrushali");
		System.out.println("Firsts name in List the list is : " + List1.get(0));
		List1.remove(0);
		System.out.println("The List Is : " + List1);
		for(String s : List1) {
			System.out.println("For : " + s);
		}
		Iterator<String> itr = List1.iterator();
		while(itr.hasNext()) {
			System.out.println("While : " + itr.next());
		}
		Collections.sort(List1);
		System.out.println("After sorting The List Is : " + List1);
		Collections.sort(List1, Collections.reverseOrder());
		System.out.println("After reverse sorting The List Is : " + List1);

	}

}
