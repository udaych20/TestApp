package exception.illegalstate;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;

public class Test {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();

		al.add("uday");
		al.add("kumar");
		al.add("roja");

		Iterator<String> iterator = al.iterator();

		while (iterator.hasNext()) {
//			String next = iterator.next();
//			System.out.println(next);
			// Exception in thread "main" java.lang.IllegalStateException - without calling
			// the next if we do any operation on that iterator
//			iterator.remove();
		}
		
	}
}
