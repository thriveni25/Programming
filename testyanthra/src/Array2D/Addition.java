package Array2D;

public class Addition {

	public static void main(String[] args) {
		int a[][]= {{10,20,30},{70,80,90},{40,50,60},{10,20,30}};
		int b[][]= {{40,50,60},{10,20,30},{70,80,90},{40,50,60}};
		
        for(int i=0;i<a.length;i++) {
        	
			for(int j=0;j<a[i].length ;j++) {
				
			
				System.out.print(a[i][j]+b[i][j]+" ");
			}
			System.out.println();
	}

	}

}
