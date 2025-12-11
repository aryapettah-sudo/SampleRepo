package interfaceexample;

public class InterfaceChild implements Interface1{

	public static void main(String[] args) {
		InterfaceChild obj=new InterfaceChild();
		obj.display();
		obj.print();
		obj.show();
		
		//refernce creation
		
		Interface1 obj1 = new InterfaceChild();
		obj1.display();
		obj1.print();
	

	
	}
	
	public void show() {
		System.out.println("Hi");
	}

	@Override
	public void display() {
		int a = 1;
		int b=1;
		int c = a+b;
		System.out.println(c);
		
	}

	@Override
	public void print() {
	System.out.println("MOTHER");	
		
	}
    }
