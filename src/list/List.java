package list;

import java.util.ArrayList;

public class List {

	public static void main(String[] args) {

		ArrayList <String>fruits = new ArrayList<>();
		ArrayList<String>Vegetables = new ArrayList<>();
		
		
		
		fruits.add("mango");
		fruits.add("banana"); 
		fruits.add("hale");
		
		String temp[] = new String[fruits.size()];
		fruits.toArray(temp);
		
		for(String e: temp) {
			System.out.println(e);
		}
		
			
//		ArrayList<String>toremove =new ArrayList();
//		toremove.add("mango");
//		toremove.add("hale");
//		fruits.removeAll(toremove);
		
//		fruits.clear();
//		fruits.remove(2);
//		fruits.set(1,"orange");
		
//		Vegetables.add(" pumpkin");
//		Vegetables.add("ladyfinger");
//		fruits.addAll(Vegetables);
		
//		System.out.println(fruits.size());
//		System.out.println(fruits.contains("apple"));
//		System.out.println(fruits.isEmpty());
		
//		System.out.println(fruits);
//		
//Pair<String , Integer>Pair = new Pair("Dog ", 2);
//Pair<Boolean, Float>p1 =	new Pair( true , 2.5);
//Pair.getdiscription();
//p1.getdiscription();
		
	}

}
