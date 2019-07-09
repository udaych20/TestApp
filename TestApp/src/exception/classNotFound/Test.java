package exception.classNotFound;

public class Test {

	public static void main(String[] args) {
		try {
			
			/*
			 * java.lang.ClassNotFoundException: Abc at
			 * java.net.URLClassLoader.findClass(URLClassLoader.java:381) at
			 * java.lang.ClassLoader.loadClass(ClassLoader.java:424) at
			 * sun.misc.Launcher$AppClassLoader.loadClass(Launcher.java:335) at
			 * java.lang.ClassLoader.loadClass(ClassLoader.java:357) at
			 * java.lang.Class.forName0(Native Method) at
			 * java.lang.Class.forName(Class.java:264) at Test.main(Test.java:5)
			 */
			Class.forName("Abc");
			
			/*
			 * java.lang.ClassNotFoundException: Abc at
			 * java.net.URLClassLoader.findClass(URLClassLoader.java:381) at
			 * java.lang.ClassLoader.loadClass(ClassLoader.java:424) at
			 * sun.misc.Launcher$AppClassLoader.loadClass(Launcher.java:335) at
			 * java.lang.ClassLoader.loadClass(ClassLoader.java:357) at
			 * java.lang.Class.forName0(Native Method) at
			 * java.lang.Class.forName(Class.java:264) at Test.main(Test.java:5)
			 */
			//Test1.testPrint();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		/*
		 * Exception in thread "main" java.lang.NoClassDefFoundError: Test$Test1 at
		 * Test.main(Test.java:11) Caused by: java.lang.ClassNotFoundException:
		 * Test$Test1 at java.net.URLClassLoader.findClass(URLClassLoader.java:381) at
		 * java.lang.ClassLoader.loadClass(ClassLoader.java:424) at
		 * sun.misc.Launcher$AppClassLoader.loadClass(Launcher.java:335) at
		 * java.lang.ClassLoader.loadClass(ClassLoader.java:357) ... 1 more
		 */
		
			Test1.testPrint();
		
	}
	
	static class Test1{
		
			static void testPrint(){
				System.out.println("print");
			}
	}

}