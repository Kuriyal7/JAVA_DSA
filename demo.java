import java.util.Scanner;

public class demo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n=sc.nextInt();
        int i=2;
        while(i!=n)
        {
            if(n%i==0)
            {
                n=n/i;
            }
            else
                i++;
        }
        System.out.println("highest prime factor is "+n);
        
    }
}
