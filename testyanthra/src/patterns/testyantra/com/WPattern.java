package patterns.testyantra.com;

public class WPattern {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(j>=i)
				System.out.print("*");
				
			}
			System.out.println();
		}
		/*for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(j<i)
				System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
		}*/
		
	}

}
