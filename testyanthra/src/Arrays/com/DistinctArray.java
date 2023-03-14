package Arrays.com;

public class DistinctArray {

	public static void main(String[] args) {
		int[] a1= {10,20,30,40,50};
		int[] a2= {10,30,50,70};
		for(int i=0;i<a1.length;i++)
		{
			boolean flag=false;
			for(int j=0;j<a2.length;j++)
			{
				if(a1[i]==a2[j])
				{
					flag=true;
				}
			}
			if(flag==false)
			{
				System.out.println(a1[i]);
			}
			
			
		}
		
		for(int i=0;i<a2.length;i++)
		{
			boolean flag=false;
			for(int j=0;j<a1.length;j++)
			{
				if(a2[i]==a1[j])
				{
					flag=true;
				}
			}
			if(flag==false)
			{
				System.out.println(a2[i]);
			}
			
			
		}
	}

}