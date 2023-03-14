package testyanthra;

import java.util.Scanner;

public class HappyOrSadNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The  Number...");
		
		int num=sc.nextInt();
		int temp=num;
		
		   while(true)
		   {
			int sum=0;
			while(num>0)
			{
				int rem=num%10;
				sum+=rem*rem;
				num/=10;
			}
			num=sum;
			
			if(num==1)
			{
				System.out.println(" Happy number");
				break;
			}
			else if(num==4)
			{
				System.out.println("Sad number");
				break;
			}
		
		   }
	}

	
	}


