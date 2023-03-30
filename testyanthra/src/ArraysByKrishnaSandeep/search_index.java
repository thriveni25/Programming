package ArraysByKrishnaSandeep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class search_index
{
	public static void main(String[] args) throws IOException
	{
		int []a= {1,2,3,4,6};
		boolean ispresent=false;
		Integer index=null;
		System.out.println("enter the number to be searched");
		BufferedReader br=new BufferedReader( new InputStreamReader(System.in));
		String inuput =br.readLine();
		Integer number=Integer.valueOf(inuput);
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==number)
			{
				ispresent=true;
				index=i;
			}
		}
		if(ispresent==true)
		{
			System.out.println(" element is present at index"+index);
		}
		else
		{
			System.out.println("element is not present");
		}
	}

}
