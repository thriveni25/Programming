package patterns.testyantra.com;

public class Y {

	public static void main(String[] args) {
		int c=5;
		int r=5;
		
		for(int i=1;i<=r;i++) {
			for(int j=1;j<=c;j++) {
				if((j==i & i<=3)|| (i+j==6 & i<=3) ||( j==3 & i>=3)) {
					System.out.print("* ");
				}
				else System.out.print("  ");
				
				
			}
			System.out.println();
			
		}

	}

}
