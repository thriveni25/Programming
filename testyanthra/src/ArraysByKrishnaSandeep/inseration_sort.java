package ArraysByKrishnaSandeep;

public class inseration_sort 
{
public static void inseration(int[]a)
{
	int temp;
	int j;
	for(int i =1;i<a.length;i++)
	{
		temp=a[i];
		j=i-1;
		while(j>=0&&temp<a[j])
		{
			a[j+1]=a[j];
			j=j-1;
		}
		a[j+1]=temp;
	}
	
}
public static void main(String[] args) 
{
	int[]a= {5,4,3,8,9,1};
	inseration(a);
	for(int k=0;k<a.length;k++)
	{
		System.out.println(a[k]);
	}
}
}
