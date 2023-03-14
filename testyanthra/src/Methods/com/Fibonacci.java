package Methods.com;

public class Fibonacci {
	public static void fibonacci(int n) {
		int a=0;
		int b=1;
		int c = 0;
		for(int i=1;i<=n;i++) {
			System.out.print(a+" ");
			a=b;
			b=c;
			c=a+b;
		}
	}

	public static void main(String[] args) {
		fibonacci(10);

	}

}
