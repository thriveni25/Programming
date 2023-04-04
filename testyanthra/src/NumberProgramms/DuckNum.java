package NumberProgramms;

public class DuckNum {

	public static void main(String[] args) {
		/*int n=702;
		int c=0;
		boolean flag=false;
		while(n>9) {
		int	d=n%10;
		if(d==0) {
		c++;
		}
		n/=10;
		if(c==1) {
			flag=true;
			break;
		}
		else {
			
			flag=false;
		}
		}
		if(flag==true) System.out.println("Duck num");
		else System.out.println("Not Duck");*/
		
		
		String s="325013";
		
		boolean flag=true;
		if(s.charAt(0)=='0') 
		{
			flag=false;

		}
		else 
		{
		for(int i=1;i<s.length();i++) {
			
			if(s.charAt(i)=='0')
			{
				flag=true;
				break;
			}
			else
			flag=false;
		}
	}
		if(flag==true) {
			System.out.println("duck number");
		}
		else {
			System.out.println("not duck");
		}
	}
}
