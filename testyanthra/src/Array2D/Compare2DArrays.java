package Array2D;

public class Compare2DArrays {

	public static void main(String[] args) {
		int[][] a1= {{10,20,30},{40,50,60},{70,80,90}};
		int[][] a2= {{10,20,30},{40,50,60},{70,80,90}};
		boolean flag=false;
		
				for (int i = 0; i < a1.length; i++) {
					
					for (int j = 0; j < a2.length; j++) {
						
						if (a1[i][j]!=a2[i][j]) {
							flag=true;
							break;
						}
						
					}
				}
				if(flag==true) System.out.println("Not Same");
				else System.out.println("Same");

	}

}
