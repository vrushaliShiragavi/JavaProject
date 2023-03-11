package Collections;

import java.util.HashMap;

public class MapExample {

	public static void main(String[] args) {
		HashMap<String, Integer> basket = new HashMap<String, Integer>();
		basket.put("item1", 1);
		basket.put("item2", 5);
		basket.put("item3", 2);
		basket.put("item5", 1);
		System.out.println("The map is : " + basket);
		basket.put("item3", 3);
		System.out.println("The map after change is : " + basket);
		basket.remove("item2");
		System.out.println("The map after delete is : " + basket);
		basket.put("item5", null);
		System.out.println("The map after adding null value is : " + basket);		
		basket.put(null, 4);
		System.out.println("The map after adding null key is : " + basket);	
		basket.put(null, 5);
		System.out.println("The map after adding null key is : " + basket);
		for(String item : basket.keySet()) {
			System.out.println("Item Name is : " + item);
			System.out.println("Item quantity is : " + basket.get(item));
		}
		for(Integer val : basket.values()) {
			System.out.println("Item value is : " + val);
		}
		String  str = "Clean World Gren World Happy World";
		String[] words = str.split(" ");	
		HashMap<String, Integer> map1 = new HashMap<String, Integer>();
		for(String word : words) {
			if(!map1.keySet().contains(word)) {
				map1.put(word, 1);
			}
			else
			{
				map1.put(word,map1.get(word)+1);
			}
		}

		System.out.println("map id : " + map1);
	}

}
