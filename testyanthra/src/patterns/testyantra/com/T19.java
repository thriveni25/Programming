package patterns.testyantra.com;

public class T19 {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=5;i++) {
			
			for(int j=n-i;j>0;j--) {
				System.out.print(" ");
			     }
			
				for(int j1=1;j1<=i;j1++) {
					System.out.print(i);	
				}
				
				System.out.println();
			}

	}

}
