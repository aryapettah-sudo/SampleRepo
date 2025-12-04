package interfaceexample;

public class InterfaceChild implements Interface1{

	public static void main(String[] args) {
		InterfaceChild obj=new InterfaceChild();
		obj.display();
		obj.print();

	
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
