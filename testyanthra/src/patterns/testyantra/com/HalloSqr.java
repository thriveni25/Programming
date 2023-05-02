package patterns.testyantra.com;

public class HalloSqr {

	public static void main(String[] args) {
		int n=5;
		/*for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==1||j==1||i==n||j==n)
				System.out.print("*");
				else
					System.out.print(" ");	
			}
			System.out.println();
		}*/
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if((i==1 && j<5 && j>1) || (i==n && j<5 && j>1) || (j==1 && i<5 && i>1) || (j==n && i<5 && i>1))
				System.out.print("*");
				else
					System.out.print(" ");	
			}
			System.out.println();
		}
	}
}
