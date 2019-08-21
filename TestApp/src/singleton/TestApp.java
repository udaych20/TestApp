package singleton;

import java.io.IOException;

public class TestApp {
	private enum Num {
		ONE, TWO, THREE
	}

	public static void main(String[] args) throws IOException {
		EnumSingletonExample.INSTANCE.show();
//		Runtime r = Runtime.getRuntime();
//		r.exec("calc");

//		for (Num num : Num.values()) {
//			System.out.println(num);
//		}
		Num caseString = Num.TWO;

		switch (caseString) {
		case ONE:
			System.out.println(Num.valueOf("ONE"));
			break;
		case TWO:
			System.out.println(Num.valueOf("TWO"));
			break;
		default:
			System.out.println("Not Found");
			break;
		}
	}
}
