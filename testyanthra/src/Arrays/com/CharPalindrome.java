package Arrays.com;

public class CharPalindrome {

	public static void main(String[] args) {
//		char[] a= {'M','A','L','A','Y','A','L','A','M'};
//		int i=0,j=a.length-1;
//		boolean flag=true;
//		while(i<j) {
//			
//			if(a[i]!=a[j]) flag=false;
//			i++;
//			j--;
//			
//		}
//		if(flag==false) System.out.println("not palindrome");
//		else System.out.println("Palindrome");
		int a [] = {1,2,2};
		int b [] = new int [a.length];
		int j=0;
		for(int i=a.length-1;i>=0;i--)
		{
			b[j]=a[i];
			j++;
		}
		boolean flag =false;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==b[i])
			{
				flag=true;
			}
			else
			{
				flag=false;
				break;
			}
		}
		if(flag==true)
		{
			System.out.println("pal");
		}
		else
		{
			System.out.println("not pal");
		}
	}
}
