package Collections.com.testyantra;
import java.util.ArrayList;
import java.util.Iterator;
public class ice_Cream {

	public static void main(String[] args) {
		//ice_Cream ic =new ice_Cream();
		ArrayList al=new ArrayList();
		al.add("chocolate");
		al.add("vennela");
		al.add("straberry");
		al.add("almond");
		al.add("butterscotch");
		
		Iterator itr=al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
