package Recurssion;

public class ReverseNum {
	static int rev=0;
	 static int rem;
	public static int reverse(int n) {
		
		if(n<=0) {
			return n;
		}
		else {
			rem=n%10;
			rev=(rev*10)+rem;
			n/=10;
			reverse(n);
			return rev;
			
		}
	}

	public static void main(String[] args) {
		System.out.println(reverse(123));

	}

}
