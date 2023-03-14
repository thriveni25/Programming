package Recurssion;

public class Add10to1 {
	public static int count(int n) {
		
		if(n>1) {
			System.out.println(n);
			return (count(n-1));
		}
		else return n;
		
	}
	

	public static void main(String[] args) {
		System.out.println(count(10));

	}

}
