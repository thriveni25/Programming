package patterns.testyantra.com;

public class R {

	public static void main(String[] args) {
		int c=5;
		int r=7;
		
		for(int i=1;i<=r;i++) {
			for(int j=1;j<=c;j++) {
				if(i==1 || j==1 ||i==3 || (j==5 & i<=3 ) || i-j==2 ) {
					System.out.print("* ");
				}
				else System.out.print("  ");
				
				
			}
			System.out.println();
			
		}

	}

}
