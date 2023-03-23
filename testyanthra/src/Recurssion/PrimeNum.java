package Recurssion;

public class PrimeNum {
		
		public static void main(String[] args) {
			if (prime(n))
				System.out.println("Prime Number");
			else
				System.out.println("Not prime");

		}
		static int n =6 ;
		static int h = n / 2 + 1;
		static int i=2;


		static boolean prime(int n) {
			if (i==h) { 
				return true;
			}
			if (n % i == 0) {
				return false;
			}
				i++;
			
			return prime(n);

		}

	
}
