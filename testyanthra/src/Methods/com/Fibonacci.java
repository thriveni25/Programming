package Methods.com;

public class Fibonacci {
	public static void fibonacci(int n) {
		int a=0;
		int b=1;
		int c =0;
		for(int i=1;i<=n;i++) {
			System.out.print(a+" ");
			c=a+b;
			a=b;
			b=c;
			
		}
	}

	public static void main(String[] args) {
		fibonacci(10);

	}

}
