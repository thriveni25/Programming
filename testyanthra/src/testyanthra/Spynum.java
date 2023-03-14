package testyanthra;

public class Spynum {

	public static void main(String[] args) {
		int n=123;
		int sum=0;
		
		int prod = 1;
		while(n!=0){
			int rem=n%10;
			sum=sum+rem;
			prod=prod*rem;
			n/=10;
		}	
		if(sum==prod) {
			System.out.println("spy num");
		}
		else {
			System.out.println("not spy num"); 
		}
		}
	

}
