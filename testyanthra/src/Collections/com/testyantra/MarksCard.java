package Collections.com.testyantra;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class MarksCard {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		ArrayList pu1=new ArrayList();
		System.out.println("enter pu1 subjects : ");
		
		pu1.add(scn.nextLine());
		pu1.add(scn.nextLine());
		pu1.add(scn.nextLine());
		pu1.add(scn.nextLine());
		pu1.add(scn.nextLine());
		pu1.add(scn.nextLine());
		
		ArrayList pu2=new ArrayList();
		System.out.println("enter pu2 subjects : ");
		
		pu2.add(scn.nextLine());
		pu2.add(scn.nextLine());
		pu2.add(scn.nextLine());
		pu2.add(scn.nextLine());
		pu2.add(scn.nextLine());
		pu2.add(scn.nextLine());
		
		
		if(pu2.equals(pu1)) {
			System.out.println("contains same");
		}
		else {
			System.out.println("not same");
		}
		
		
		ArrayList pu3=new ArrayList();
		pu3.addAll(pu1);
		pu3.addAll(pu2);
		
		Iterator itr=pu3.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}

		
	}

	
}
