package patterns.testyantra.com;
import java.util.Scanner;
public class JavaTriangle {

	public static void main(String[] args) {
		
		        Scanner sc= new Scanner(System.in);
		        System.out.println("Enter the string: ");
		        String x= sc.next();
		        int i,j;
		        int l = x.length();
		        for(i = 0;i<= l;i++)
		        {
		            for(j = 0;j<i;j++)
		                System.out.print (x.charAt(j));
		            System.out.println ();
		        }
		    }

	

}
