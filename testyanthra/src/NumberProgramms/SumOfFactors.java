package NumberProgramms;

public class SumOfFactors {

	public static void main(String[] args) {
		int n=10;
		int sum=0;
		for(int i=1;i<=n/2;i++) {
			if(n%i==0) {
				sum=sum+i;
				System.out.println(i);
			}
		}
		System.out.println(sum+"= sum");
		
     
	}

}
