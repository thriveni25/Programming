package NumberProgramms;

public class PrintSumOfPrimesInGivenNumber {

	public static void main(String[] args) {
		int n=1428357;
		int sum=0;
		while(n>0) {
			int d=n%10;
			int count=0;
			for(int i=1;i<=d;i++) {
				if(d%i==0) {
					count++;
				}	
			}
			if(count==2) {
				sum+=d;
			}
			n/=10;
		}
		
		System.out.println(sum+" is the sum of primes");
	}

}
