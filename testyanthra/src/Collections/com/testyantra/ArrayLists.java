package Collections.com.testyantra;
import java.util.Iterator;
import java.util.LinkedList;
public class ArrayLists {

	public static void main(String[] args) {
		LinkedList lhs=new LinkedList();
		lhs.add(52);
		lhs.add(76);
		lhs.add(66);
		lhs.add(86);
		lhs.add(99);
		lhs.add(35);
		lhs.add(98);
		lhs.add(69);
		lhs.add(97);
		lhs.add(68);
		
		Iterator itr=lhs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
