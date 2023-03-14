package test.programs.com;

public class DeleteElement {

	public static void main(String[] args) {

			int arr[]= {10,20,30,40,50};
			int index=2	;
			
			int [] arr1= new int[arr.length];
			
			int temp=0;
			
			for (int i = 0; i < arr.length; i++)
			{
		       if(i!=index) 
		       {
				arr1[temp]=arr[i];
				temp++;
				
		       }
		    
		       	
		    }
			
			for (int i = 0; i <arr.length-1; i++) 
			{
				System.out.print(arr1[i]+" ");
			}
		}
	}

		


