package gcdandhcf;

/**
 * @author Uday GCD - Gratest Common Diviser HCF - Highest Common Factor
 *
 */
public class GCDAndHCFTest {
	public static void main(String[] args) {
//		System.out.println("gcdRecurssive -> "+ gcdRecurssive(24, 60));
//		System.out.println("gcd -> "+gcd(24, 60));
		System.out.println(gcdEuclid(16,30));


	}

	static int gcdRecurssive(int a, int b) {
		if (b != 0) {
			return GCDAndHCFTest.gcdRecurssive(b, a % b);
		} else {
			return a;
		}
	}

	static int gcd(int a, int b) {
		int gcd = 0;
		int i;
		double amod,bmod=0;
		
		for(i = 1; i <= a && i <= b; i++)
		{
//		System.out.println(" i -> "+i +" a -> "+a +" b-> "+ b+" gcd-> "+gcd);
		amod= a % i;
		bmod= b % i;
		System.out.println("amod -> " +amod+ "bmod-> "+bmod+" i -> "+i +" gcd-> "+gcd);
		if((amod == 0) && (bmod == 0))
		{
		 gcd = i;
		}
		}
		return gcd;
	}
	/**
	 * This method takes two positive integers and finds their gcd using 
	 * Euclid's algorithm
	 * @param a
	 * @param b
	 * @return
	 */
	public static int gcdEuclid(int a, int b) {
		
		if (b == 0) return a;
		int mod = a% b;
		System.out.println(mod);
		return gcdEuclid(b, mod);
	}	

}
