package Array2D;

import java.util.Arrays;

public class Transpose {

	public static void main(String[] args) {
		int a[][]= {{10,20,30},{70,80,90},{40,50,60}};
		//int b[][]= {{40,50,60},{10,20,30},{70,80,90},{40,50,60}};
//		int b[][]=new int[a[0].length][a.length];
//        
//        for(int i=0;i<a.length;i++) {
//        	
//			for(int j=0;j<a[i].length ;j++) {
//				
//			b[j][i]=a[i][j];
//				
//			}
//        }
//        System.out.println(Arrays.deepToString(a));
//         System.out.println(Arrays.deepToString(b));
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[j][i]+" ");
			}
			System.out.println();
		}
			
	}


	}


