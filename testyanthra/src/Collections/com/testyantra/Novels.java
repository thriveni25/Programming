package Collections.com.testyantra;
import java.util.Iterator;
import java.util.LinkedList;
public class Novels {

	public static void main(String[] args) {
		LinkedList li=new LinkedList();
		li.add("novel1");
		li.add("novel2");
		li.add("novel3");
		li.add("novel4");
		li.add("novel5");
		
		//System.out.println(li);
		
		LinkedList li1=new LinkedList();
		li1.add(li);
		
		Iterator itr=li1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
