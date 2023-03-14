package patterns.testyantra.com;

public class T13 {

	public static void main(String[] args) {
		int c=1;
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=4;j++) {
				if(i==1||j==1||i==4||j==4) {
				System.out.print(c+" ");
				}
				else {
					System.out.print("  ");
				}
			}
			c++;
			System.out.println();
		}


	}

}
