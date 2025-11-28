package polymorphism;

public class PolyChild extends PolyParent {
	public void show (int a,int b) {
super.show(4, 4);
		int c= a-b;
		System.out.println(c);
		}
	
	
	public static void main(String[] args) {
		PolyChild obj=new PolyChild();
obj.show(2, 3);
	}

}
