package test.programs.com;

public class Armstrong {

	public static void main(String[] args) {
		int n=153;
		int num=n;
		int count=0;
		while(n>0) {
			n/=10;
			count++;
		}
		int sum=0;
		num=n;
		while(n>0) {
			int d=n%10;
			int prod=1;
			for(int i=1;i<=count;i++) {
				prod*=d;
			}
			sum+=prod;
			n/=10;
		}
		if(sum==num) System.out.println("Armstrong");
		else System.out.println("Not Armstrong");
		
		
	}

}
