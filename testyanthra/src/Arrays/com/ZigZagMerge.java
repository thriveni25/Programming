package Arrays.com;
public class ZigZagMerge
{
 public static void main(String[] args) 
   {
      int[] a = {1,2,3,4,5};
      int[] b = {6,7,8,9,10};
      int[] c= new int[a.length+b.length];
      int k=0;
      int j=0;
      for(int i=0; i<c.length; i++)
      {
        if(k<a.length)
              c[i++]=a[k++];
      
        if (j<b.length)
               c[i]=b[j++];
      }
      for(int i=0; i<c.length; i++)
      {
      System.out.print(c[i]+" ");
      }
   }
}
