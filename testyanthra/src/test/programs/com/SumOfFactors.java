package test.programs.com;

public class SumOfFactors {

	public static void main(String[] args) {
		int n=9;
		int sum=0;
		
			for(int i=1;i<=n;i++) {
				if(n%i==0) {
					sum=sum+i;
				}
			
			
		}
			System.out.println(sum);

	}

}
