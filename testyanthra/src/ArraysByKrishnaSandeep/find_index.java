package ArraysByKrishnaSandeep;

public class find_index 
{
public static void main(String[] args) 
{
	String []s= {"red","blue","black","orange"};
	int index=0;
	for(int i=0;i<s.length;i++)
	{
		if(s[i]=="orange")
		{
		index=i;	
		}
	}
	System.out.println(index);
}
}
