package collection;

import java.util.ArrayList;
import java.util.List;

public class NonGenericListMethod {

	public static void main(String[] args) {
		  List a = new ArrayList();
 a.add("red");
 a.add("green");
 a.add("blue");
 System.out.println(a);
 System.out.println(a.get(1));
 a.set(1, "Black");
 System.out.println(a);
 System.out.println(a.indexOf("red"));
 a.remove(2);
 System.out.println(a);
 a.isEmpty();
 System.out.println(a);
 a.contains("green");
 System.out.println(a);
 a.size();
 System.out.println(a);
}
}
