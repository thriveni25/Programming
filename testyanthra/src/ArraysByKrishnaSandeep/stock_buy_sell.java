package ArraysByKrishnaSandeep;

public class stock_buy_sell 
{
public static void main(String[] args) 
{
	int[]a= {10,2,40,80,90};
	int min=Integer.MAX_VALUE;
	int max=Integer.MIN_VALUE;
	
	for(int i=0;i<a.length;i++)
	{
		if(a[i]<min)
		{
			min=a[i];
		}
		if(a[i]-min>max)
		{
			max=a[i]-min;
		}
	}
	System.out.println("max value is "+ max);
	
}
}
