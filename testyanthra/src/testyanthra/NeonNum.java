package testyanthra;

public class NeonNum {

	public static void main(String[] args) {
		int n=9;
		int sqr=n*n;
		int sum=0;
		
		while(sqr>0) {
			int res=sqr%10;
			sum+=res;
			sqr=sqr/10;
		}
		if(sum==n) {
			System.out.println("neon num");
		}
		else {
			System.out.println("not neon num");
		}

	}

}
