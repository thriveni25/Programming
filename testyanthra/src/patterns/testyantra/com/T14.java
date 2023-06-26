package patterns.testyantra.com;

public class T14 {

	public static void main(String[] args) {
		int n=7;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if((i==j)||(i+j==n+1)||(i==1||j==1||i==n||j==n)) {
				System.out.print("*");
				}
				else {
					System.out.print(" ");	
				}
			}
			System.out.println();
		}


	}

}
