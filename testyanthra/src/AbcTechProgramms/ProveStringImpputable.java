package AbcTechProgramms;

public class ProveStringImpputable {

	public static void main(String[] args) {
       String s1="Venkata";
       String s2="Hemanth";
       s1.concat(s2);
       System.out.println(s1);  //Venkata   
       //String is immutable we can't change.
       
       
       StringBuffer s3=new StringBuffer("Venkata");
       StringBuffer s4=new StringBuffer("Hemanth");
       s3.append(s4);
       System.out.println(s3);//VenkataHemanth.
       //StringBuffer is mutable we can change.
       
       StringBuilder s5=new StringBuilder("Venkata");
       StringBuilder s6=new StringBuilder("Hemanth");
       s5.append(s6);
       System.out.println(s5);//VenkataHemanth.
       //StringBuilder is mutable we can change.
       
	}

}
