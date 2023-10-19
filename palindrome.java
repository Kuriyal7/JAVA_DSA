import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        int m=n;
        int rev=0;
        while(m>0){
            int l=m%10;
            rev=rev*10+l;
            m=m/10;
        }
        if(rev==n){
            System.out.println("number is polindrome");
        }
        else{
            System.out.println("not a polindrome");
        }

    }
    
}
