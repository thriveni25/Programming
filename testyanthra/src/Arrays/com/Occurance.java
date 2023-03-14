package Arrays.com;

public class Occurance {  
    public static void main(String[] args) {  
        
        int [] a = new int [] {1, 2, 2, 3, 3, 3, 4, 4, 4};  
       
        int [] b = new int [a.length];  
        int visited = -1;  
        for(int i = 0; i < a.length; i++){  
            int count = 1;  
            for(int j = i+1; j < a.length; j++){  
                if(a[i] == a[j]){  
                    count++;    
                    b[j] = visited;  
                }  
            }  
            if(b[i] != visited)  
                b[i] = count;  
        }  
  
         
        for(int i = 0; i < b.length; i++){  
            if(b[i] != visited)  
                System.out.println(a[i] + "  occurs  " + b[i]);  
        }  
        
    }}  
