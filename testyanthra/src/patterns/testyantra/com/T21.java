package patterns.testyantra.com;

public class T21 {

	public static void main(String[] args) {
		int n=5;
		for(int i=5;i<=1;i++) {
			for(int j=n-i;j>0;j--) {
				System.out.print(" ");
			     }
				for(int j1=1;j1<=i;j1++) {
					System.out.print(j1);	
				}
				
				System.out.println();
			}
			
	}

}
