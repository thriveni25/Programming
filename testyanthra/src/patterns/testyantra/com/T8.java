package patterns.testyantra.com;

public class T8 {

	public static void main(String[] args) {
		int n=5;
		char c='z';
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(c+" ");	
				c++;
			}
			System.out.println();
		}
	}
}
