package NumberProgramms;

public class SumofDigits {

	public static void main(String[] args) {
		int n=12345;
		int sum=0;
		while(n>0) {
			sum+=n%10;
			n/=10;
		}
      System.out.println("Sum ="+sum);
	}

}
