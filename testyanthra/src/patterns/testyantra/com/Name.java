package patterns.testyantra.com;

public class Name {

	public static void main(String[] args) {
		V();
		E();
		N();
		K();
		Y();
		
	}
	public static void V() {
		int r=4;
		int c=7;
		for(int i=1;i<=r;i++) {
			for(int j=1;j<=c;j++) {
				if(i==j || i+j==8) {
					System.out.print("V");
				}
				else System.out.print(" ");
				
				
			}
			System.out.print("");
			System.out.println();
			System.out.println();
		//	System.out.println();
			
		}

	}
		public static void E() {
			int c=5;
			int r=5;
			
			for(int i=1;i<=r;i++) {
				for(int j=1;j<=c;j++) {
					if(i==1 || j==1 || i==5 || i==3 ) {
						System.out.print("E ");
					}
					else System.out.print("  ");
					
					
				}
				System.out.print("");
				System.out.println();
				System.out.println();
				
			}
			}
			public static void N() {
				int c=5;
				int r=5;
				
				for(int i=1;i<=r;i++) {
					for(int j=1;j<=c;j++) {
						if((i==j  || j==1 || j==5)) {
							System.out.print("N ");
						}
						else System.out.print("  ");
						
						
					}
					System.out.print("");
					System.out.println();
					System.out.println();
					
				}
					
				}
				public static void K() {
					int c=5;
					int r=7;
					
					for(int i=1;i<=r;i++) {
						for(int j=1;j<=c;j++) {
							if((j==1 || i+j==6 || i-j==2)) {
								System.out.print("K ");
							}
							else System.out.print("  ");
							
							
						}
						System.out.print("");
						System.out.println();
						System.out.println();
						
					}
						
					}
					public static void Y() {
						int c=5;
						int r=5;
						
						for(int i=1;i<=r;i++) {
							for(int j=1;j<=c;j++) {
								if((j==i & i<=3)|| (i+j==6 & i<=3) ||( j==3 & i>=3)) {
									System.out.print("Y ");
								}
								else System.out.print("  ");
								
								
							}
							System.out.print("");
							System.out.println();
							System.out.println();
							
							
						}

						
					
				
				
		
	}
}
