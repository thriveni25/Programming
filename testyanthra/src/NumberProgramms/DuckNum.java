package NumberProgramms;

public class DuckNum {

	public static void main(String[] args) {
		int n=0702;
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
		else System.out.println("Not Duck");
		

	}

}
