package collection;

import java.util.HashSet;
import java.util.Set;

public class GenericSetMethod {

	public static void main(String[] args) {
		Set<String> a = new HashSet<String>();
 a.add("apple");
 a.add("banana");
a.add("orange");		
System.out.println(a);
Set<String> b = new HashSet<String>();
b.add("watermelon");
b.add("grapes");
System.out.println(b);
a.addAll(b);
System.out.println(a);
a.contains("apple");
System.out.println(a);	
a.isEmpty();
System.out.println(a);
a.remove("banana");
System.out.println(a);	
a.removeAll(b);
System.out.println(a);
a.size();
System.out.println(a);
a.clear();
System.out.println(a);
}
}
