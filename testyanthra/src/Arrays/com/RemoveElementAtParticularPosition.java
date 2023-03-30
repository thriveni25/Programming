package Arrays.com;


public class RemoveElementAtParticularPosition {

	public static void main(String[] args) {
//		Scanner sc= new Scanner(System.in);
//		System.out.println("Enter the size of an array ");
//		int size=sc.nextInt();
//		int [] arr=new int[size];
//		System.out.println("Enter the array elements... ");
//		for (int i = 0; i < size; i++) {
//			arr[i]=sc.nextInt();
//		}
//		System.out.println("The array elements are... ");
//		for (int i = 0; i < size; i++) 
//		{
//			System.out.print(arr[i]+" ");
//		}
		
		int arr[]= {10,20,30,40,50};
		
		//System.out.println("Enter the removing index... ");
		
		int index=2	;
		/*if(index>=arr.length)
		{
		//System.out.println("Array Index Invalid...");
		}
		else
		{*/
		int [] arr1= new int[arr.length-1];
		
		int temp=0;
		
		for (int i = 0; i < arr.length; i++)
		{
	       if(i!=index) 
	       {
			arr1[temp]=arr[i];
			temp++;
			
	       }
	     //  else
	    //	   arr1[temp]=arr[i];
	       	
	    }
		//System.out.println("=====Updated array elements are... =====");
		for (int i = 0; i <arr1.length; i++) 
		{
			System.out.print(arr1[i]+" ");
		}
	}
}

	


