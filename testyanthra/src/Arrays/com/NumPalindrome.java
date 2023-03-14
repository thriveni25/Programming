package Arrays.com;

public class NumPalindrome {

	public static void main(String[] args) {
		int a[]= {1,2,3,2,1};
		int i=0,j=a.length-1;
		boolean flag=true;
		while(i<j) {
			
			if(a[i]==a[j]) {
			i++;
			j--;
			}
			else
			 flag=false;
		}
		if(flag==false) System.out.println("not palindrome");
		else System.out.println("Palindrome");

	}

}
 