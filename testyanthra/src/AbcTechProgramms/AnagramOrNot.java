package AbcTechProgramms;

import java.util.Arrays;

public class AnagramOrNot {

	public static void main(String[] args) {
		String s1="listen";
		String s2="silent";

		s1=s1.replace(" ","");
		s2=s2.replace(" ","");

		s1=s1.toUpperCase();
		s2=s2.toUpperCase();

		char[] ch1=s1.toCharArray();
		char[] ch2=s2.toCharArray();

		Arrays.sort(ch1);
		Arrays.sort(ch2);

		Boolean result=Arrays.equals(ch1,ch2);

		if(result==true)
		{
			System.out.println("Anagram");
		}
		else
		{
			System.out.println("Not Anagram");
		}

	}

}
