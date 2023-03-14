package test.programs.com;

public class GCD {

	public static void main(String[] args) {
		int a=4;
		int b=6;
		int n=a>b?a:b;
		while(true) {
			if(a%n==0 && b%n==0) break;
			n--;
		}
		System.out.println(n);	

	}

}
