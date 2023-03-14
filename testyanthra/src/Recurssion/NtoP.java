package Recurssion;

public class NtoP{
public static void main(String[] args) {
    
    System.out.println(ntoPow(2,2));
	}

    static int ntoPow(int base,int pow) {
      if(pow<=0) return 1;
      else {
     	 return (base*ntoPow(base,pow-1));
     	 
      }
      
	}
    }