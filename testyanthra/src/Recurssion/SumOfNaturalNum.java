package Recurssion;

public class SumOfNaturalNum {

	public static void main(String[] args) {
		int n=10;
		System.out.println(sum(n));
	}
	private static int sum(int n) {
		if(n<=1) {
			return n;
		}
		else return(n+sum(n-1));
	}

}
