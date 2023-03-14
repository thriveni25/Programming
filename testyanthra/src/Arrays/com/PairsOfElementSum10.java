package Arrays.com;

public class PairsOfElementSum10 
{ 
    public static void main(String[] args) 
    { 
        int[] a = {6, 5, 4, 3, 2, 1, 8, 9, 10}; 
       
        for (int i = 0; i < a.length; i++) 
            for (int j = i + 1; j < a.length; j++) 
                if (  a[i] + a[j] == 10) 
                    System.out.println(a[i] + " + " + a[j] + " = 10"); 
    } 
}
