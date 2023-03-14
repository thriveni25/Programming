package Arrays.com;

public class Insert1ElementAtParticularPosition {

	public static void main(String[] args) {
		
			    int[] a= {9, 5, 3, 6, 7, 1, 2, 4};
			    int index = 5;
			    int element = 100;
			    int[] newarr = new int[a.length + 1];

			    
			    for (int i = 0; i < index; i++) {
			      newarr[i] = a[i]; 
			    }
			    newarr[index] = element;

			   
			    for (int i = index + 1; i < newarr.length; i++ ) {
			      newarr[i] = a[i - 1];
			    }

			   
			    for (int j = 0; j < newarr.length; j++) {
			      System.out.print(newarr[j] + " ");
			    }
			  }
			
     }


