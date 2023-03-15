package patterns.testyantra.com;

public class V {

	public static void main(String[] args) {
		int r=4;
		int c=7;
		for(int i=1;i<=r;i++) {
			for(int j=1;j<=c;j++) {
				if(i==j || i+j==8) {
					System.out.print("*");
				}
				else System.out.print(" ");
				
				
			}
			System.out.println();
			

	}

	}
}
