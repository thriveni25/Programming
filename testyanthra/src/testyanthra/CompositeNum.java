package testyanthra;
import java.util.Scanner;
public class CompositeNum {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number ");
			int a=sc.nextInt();
			if(a==2) System.out.println("prime ");
			for (int i = 2; i <=a; i++) {
				if(a%i==0)
				{
					System.out.println("Composite number ");
					break;
				}
				else
				{
					System.out.println("Prime number ");
					break;
				}
			}
		}
}
