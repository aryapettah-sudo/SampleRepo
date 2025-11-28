package superkeyword;

public class SuperVariableChild extends SuperVariableParent {
String S="Black";
public void display()
{
	System.out.println(S);
System.out.println(super.S);
}

public static void main(String[] args) {
	SuperVariableChild obj=new SuperVariableChild	();	
obj.display();
	
	
	
	
}
}
