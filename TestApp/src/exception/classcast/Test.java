package exception.classcast;

public class Test {

	public static void main(String[] args) {
		Object s = new String("1");
		
		/*
		 * Exception in thread "main" java.lang.ClassCastException: java.lang.String
		 * cannot be cast to java.lang.Integer at
		 * exception.classcast.Test.main(Test.java:7)
		 */
		int a  = (Integer)s;
//		Integer valueOf = Integer.valueOf((String)s);
//		System.out.println(valueOf);
		
	}

}
