package test.programs.com;

public class Neon {

	public static void main(String[] args) {
		int n=9;
		int sqr=n*n;
		int sum=0;
		while(sqr>0) {
			int d=sqr%10;
			sum=sum+d;
			sqr/=10;
		}
		if(sum==n) System.out.println("neon");
		else System.out.println(" not neon");

	}

}
