package Arrays.com;

public class Occurance2nd {
    public static void main(String[] args) {
        int[] a = {2, 5, 5, 9, 10, 2, 8, 9};
        int count = 0;
        boolean flag=false;
        for(int i=0; i < a.length; i++){
            if(a[i] == 5){
                count++;
                flag=true;
                if(count == 10) {
                    //System.out.println(i);
                    break;
                }
                if(flag==true) {
                	System.out.println(i);
                }
                else {
                	System.out.println("not occured");
                }
        }
        
    }
}}