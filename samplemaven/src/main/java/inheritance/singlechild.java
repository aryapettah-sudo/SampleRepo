package inheritance;

public class singlechild extends singleparent{
public void print(){
System.out.println("from the child");

}

public static void main (String args[]) {
singlechild obj=new singlechild();
obj.display();
obj.print();
}
}