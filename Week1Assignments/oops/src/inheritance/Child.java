package inheritance;

public class Child  extends Parent{
    int cid=102;
    public Child()
    {
    	super();
    	System.out.println("Constructor of child");
    }
    public void m1()
	 {
		 System.out.println("Method1 from Child");
	 }
	public static void main(String[] args) {
		 Child c=new Child();
		 
		 System.out.println(c.pid);
		 Parent p=new Parent();
		 p.m1();
	}
	@Override
	public String toString() {
		return "Parent [pid=" + pid + "]";
	}
	
}
