import java.util.Scanner;

public class prime {
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    if(n==1 || n==0){
        System.out.println("not a prime number");
    }
    for(int i=2;i<=n;i++){
        if(i==n-1){
            System.out.println("not a prime number");
            break;
        }
        if(n%i!=0){
            System.out.println("it is a prime number");
            break;
        }

    }
 }   
}
