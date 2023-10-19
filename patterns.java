import java.util.Scanner;
public class patterns {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); 
        System.out.println("enter the size");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++){

                if(i==n||j==1||j==i)
               {
                System.out.print("*");
               }
               else
               System.out.print(" ");
            }
            System.out.println();
        }
        
    }
    
}
