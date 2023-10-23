package Practice;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayLists {
public static void main(String[] args) {
	ArrayList<String> list = new ArrayList<String>();
	list.add("Red");
	list.add("Orange");
	list.add("Yellow");
	list.add("Green");
	
	list.add(0, "null");
//	System.out.println(list);
	
	
//	Iterator<String> col = list.iterator();
//	while(col.hasNext()) {
//		
//		System.out.println(col.next());
//	}
	
	
//	for(String colors:list) {
//		System.out.println(colors);
//	}
	
	System.out.println(list.get(3));

}
}
