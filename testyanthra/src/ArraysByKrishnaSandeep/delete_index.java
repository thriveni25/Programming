package ArraysByKrishnaSandeep;

public class delete_index 
{
public static void main(String[] args) 
{
	int []n= {1,2,3,4,5,6};
	
	int index=2;
	int j=0;
	
	int []n1=new int[n.length-1];
	
	for( int i=0; i<n.length;i++)
	{
			if(i==index)
			{
			continue;
			}
			n1[j++]=n[i];
	}
	for(int i=0;i<n.length-1;i++)
	System.out.print(n1[i]+" ");
	
}
}
