package AbcTechProgramms;

public class CountVowels {

	public static void main(String[] args) {
       String x="Yasarapu venkata hemanth";
       char[] y=x.toCharArray();
       int size=y.length;
       int vc=0;
       int cc=0;
       int spc=0;
       int i=0;
       while(i!=size)
       {
    	   if(y[i]>'a' && y[i]<'z')
    	   {
    		   if(y[i]=='a' || y[i]=='e' || y[i]=='i' || y[i]=='o' || y[i]=='u')
    		   {
    			   vc++;
    		   }
    		   else
    		   {
    			   cc++;
    		   }
    	   }
    	   else
    	   {
    		   spc++;
    	   }
    	   ++i;
       }
       System.out.println(vc);
       System.out.println(cc);
       System.out.println(spc);
       
	}

}
