import java.util.Scanner;
import java.util.Arrays;

public class pattern {
  /**
   * @param a
   * @return
   */
  public static int water(int []a){
    int leftmax=0,rightmax=0,waterlevel,trapppedwater=0;
    for(int i=1;i<a.length;i++)
    {
      for(int j=i-1;j>=0;j--)
      {
        if(a[j]>leftmax){
          leftmax=a[j];
        }
        
      }
      for(int k=i+1;k<a.length;k++)
      {
        if(a[k]>rightmax)
        {
          rightmax=a[k];
        }
        
      }
      if(rightmax>leftmax){
        waterlevel=leftmax;
      }
      else{
        waterlevel=rightmax;
      }
      trapppedwater=trapppedwater+(waterlevel-a[i]);
    }
    return trapppedwater;

  }  
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
      int x[]={4,2,0,6,3,2,5};
      System.out.println("trappped water is "+water(x));


   }

}

