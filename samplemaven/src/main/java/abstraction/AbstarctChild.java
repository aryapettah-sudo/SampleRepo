package abstraction;

public class AbstarctChild  extends AbstractParent {

	public static void main(String[] args) {
		AbstarctChild obj = new AbstarctChild();
		obj.display();
		obj.show();

	}

	@Override
	public void display() {
		int a=2;
		int b = 1;
		int c = a+b;
		System.out.println(c);
		
	}

	@Override
	public void show() {
	System.out.println("World");	
		
	}
    }
