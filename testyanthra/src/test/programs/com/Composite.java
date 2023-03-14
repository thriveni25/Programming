package test.programs.com;

public class Composite {

	public static void main(String[] args) {
		int a=6;
		while(a>2) {
			for(int i=1;i<=a/2;i++) {
			if(a%i==0) {
				
				System.out.println("composite");
				break;
				
			}
			else 
				{
				System.out.println("Not composite");
				}
			break;
		}

	}

}
}