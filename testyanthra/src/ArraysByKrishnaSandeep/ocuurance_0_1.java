package ArraysByKrishnaSandeep;

public class ocuurance_0_1 
{
public static int[]sort(int[]a)
{
	int zeroCount=0;
	int oneCount=0;
	for(int i=0;i<a.length;i++)
	{
	  if(a[i]==0)
     	
		zeroCount++;
	
      	if(a[i]==1)
	
		oneCount++;
	  }
	for(int i=0;i<zeroCount;i++)
	{
		a[i]=0;
	}
	for(int i=zeroCount;i<(zeroCount+oneCount);i++)
	{
		a[i]=1;
	}
	for(int i=(zeroCount+oneCount);i<a.length;i++)
	{
		a[i]=2;
	}
	
	return a;
	}

	public static void main(String[] args) 
	{
		int[]a= {1,0,2,1,1,0,2,2,0,1};
		sort(a);
		for(int k=0;k<a.length;k++)
		{
			System.out.println(a[k]);
		}
}

}
