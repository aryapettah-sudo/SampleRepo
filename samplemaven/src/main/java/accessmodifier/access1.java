package accessmodifier;

public class access1 {
public void display1()
{
	System.out.println("public");
}
private void display2()
{
	System.out.println("private");
}
protected void display3()
{
	System.out.println("protceted");
}
void display4()
{
	System.out.println("default");
}
	
public static void main(String[] args) {
		access1 obj=new access1();
obj.display1();
obj.display2();
obj.display3();	
obj.display4();
}
}


