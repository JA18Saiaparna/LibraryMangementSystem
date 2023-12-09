package set;
import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
public class SetDemo {

	public static void main(String[] args) {
		Set<String>s=new HashSet<>();
		s.add("hi");
		s.add("Welcome");
		s.add("Bye");
		System.out.println(s);
		
		Set<Integer>s1=new HashSet<>();
		s1.add(10);
		s1.add(20);
		s1.add(5);
		System.out.println(s1);
		
		Set<Integer>s2=new LinkedHashSet<>();
		s2.add(900);
		s2.add(800);
		s2.add(707);
		System.out.println(s2);

	}

}
