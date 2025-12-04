package inheritance;

public class MultipleChild  implements  MultipleParent1,MultipleParent2{

	public static void main(String[] args) {
		MultipleChild obj=new MultipleChild();
obj.display();
obj.show();
	}

	@Override
	public void show() {
	int a=2;
int b=1;
int c = a+b;
System.out.println(c);
		
	}

	@Override
	public void display() {
		System.out.println("Hi");
		
	}

}
