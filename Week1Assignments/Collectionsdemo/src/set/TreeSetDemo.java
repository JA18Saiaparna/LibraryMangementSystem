package set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Set<Employee>  set2 = new TreeSet<Employee>(new MyComparator());
		
		set2.add(new Employee(103, "anand"));
		set2.add(new Employee(107, "vishal"));
		set2.add(new Employee(101, "rahul"));
		set2.add(new Employee(104, "priya"));
		
		System.out.println(set2);
		
		
	}

}
