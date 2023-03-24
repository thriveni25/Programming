package AbcTechProgramms;

public class ReverseString {

	public static void main(String[] args) {
		String s="Hemanth";
		char[] a=s.toCharArray();
		int size=a.length;
		char a1[] = new char[size];

		int i=0;
		while(i!=size)
		{
			a1[size-1-i]=a[i];
			++i;
		}
		System.out.println(a);
		System.out.println(a1);


	}

}
