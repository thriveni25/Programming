package Methods.com;

public class Factorial {
	public static long factorial(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		return fact;
	}

	public static void main(String[] args) {
		System.out.println(factorial(4));

	}

}
