package test.programs.com;

public class P2 {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) {
			int x=0,y=4;
			for(int j=1;j<=i;j++) {
				int r=i+x;
				System.out.print(r+" ");
				x=x+y;
				x--;
			}
			System.out.println();
			
		}



	}

}
