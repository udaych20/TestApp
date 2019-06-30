package comparator;

import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;

public class ComparatorTest {

	public static void main(String[] args) {
		HashMap<Employee, String> h = new HashMap<>();
		
		h.put(new Employee(3,"Uday", "20000"), "polaris");
		h.put(new Employee(1,"Kumar", "1000"), "polaris");
		h.put(new Employee(2,"Sai", "3000"), "polaris");
		
		TreeMap<Employee,String> t = new TreeMap<Employee,String>(new Comparator<Employee>() {
		public int compare(Employee o1, Employee o2) {
			if(o1.getEno() == o2.getEno()) {
				return 0;
			}else if(o1.getEno() > o2.getEno()) {
				return 1;
			}
			return -1;
		};});
		t.putAll(h);
		
		System.out.println(t);
	}

}
