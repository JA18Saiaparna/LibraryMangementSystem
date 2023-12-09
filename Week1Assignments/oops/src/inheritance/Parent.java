package inheritance;

public class Parent extends Object {
 int pid=100;
 public void m1()
 {
	 System.out.println("Method1 from Parent");
 }
 public Parent()
 {
	 super();
	 System.out.println("Constructor from Parent");
 }

}
