package testyanthra;

public class SqrRoot {

	public static void main(String[] args) {
		int a=9;
		boolean flag=false;
		int prod=1;
		for(int i=1;i<=a/2;i++) {
			prod=i*i;
			if(prod==a) {
				flag=true;
				prod=i;
				break;
			}
			
		}
		if(flag==true) {
			System.out.println("sqr of "+a+ " is "+prod);
		}
		else
		{
		System.out.println("not");	
		}
		
	}

}
