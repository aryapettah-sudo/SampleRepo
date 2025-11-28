package inheritance;

public class heirarchialchild extends heirarchialparent {
public void print() {
System.out.println("from the child1");	
}	
	
	
	public static void main(String[] args) {
		heirarchialchild obj=new heirarchialchild();
	obj.display();
obj.print();
	}

}
