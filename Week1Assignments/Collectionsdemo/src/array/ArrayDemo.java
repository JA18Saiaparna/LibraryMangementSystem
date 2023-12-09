package array;

public class ArrayDemo {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50};
        System.out.println(a[0]);
        int accounts[]=new int[4];
        accounts[0]=1;
        accounts[1]=20;
        for (int ac : accounts) {
			System.out.println(ac);
		}
	}

}
