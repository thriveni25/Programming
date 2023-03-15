package patterns.testyantra.com;

public class K {

	public static void main(String[] args) {
		int c=5;
		int r=7;
		
		for(int i=1;i<=r;i++) {
			for(int j=1;j<=c;j++) {
				if((j==1 || i+j==6 || i-j==2)) {
					System.out.print("* ");
				}
				else System.out.print("  ");
				
				
			}
			System.out.println();
			
		}


	}

}
