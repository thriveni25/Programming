package test.programs.com;

public class Demo1 {

	public static void main(String[] args) {
		int a[]= {3,4,5,3,2,2,3,1,2};
		//        0,1,2,3,4,5,6,7,8
	      int t=4;
	      
	      for(int i=0;i<a.length;i++)
	      {
	    	  int sum=0;
	    	   if(a[i]==t)
	    	   {
	    		   System.out.println(i);
	    		   i++;
	    	   }
	    	   
	    	  for(int j=i+1;j<a.length;j++)
	    	  {
	    		   if(sum==t)
	    		   {
	    			   System.out.println(i+" "+j);
	    			   break;
	    			   
	    		   }if(sum>t)
	    		   {
	    			   break;
	    		   }else if(j<a.length)
	    			   
	    		   
	    		   {
	    			   sum=sum+a[j];
	    		   }
	    		   
	    	  }
	      }
	      

	      }

	}


