package Strings;

public class Word1stUpper {

	public static void main(String[] args) {
			String s="hello java world";
			
			char[] ch=s.toCharArray();
			
			ch[0]=(char)(ch[0]-32);
			
			for(int i=1;i<ch.length;i++)
			{
				if(ch[i]==' ')
				{
					ch[i+1]=(char)(ch[i+1]-32);
				}
			}
			System.out.println(ch);
			
		}

	}


