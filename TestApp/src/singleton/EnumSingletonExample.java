package singleton;

public enum EnumSingletonExample {
	INSTANCE;
	
	public void show() {
		String s = new String("First ENUM Singleton class");
		System.out.println(s);
	}

}
