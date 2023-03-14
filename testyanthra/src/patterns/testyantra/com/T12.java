package patterns.testyantra.com;

public class T12 {

	public static void main(String[] args) {
		char c='a';
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=4;j++) {
				if(i==1||j==1||i==4||j==4) {
				System.out.print(c+" ");
				c++;
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}


	}

}
