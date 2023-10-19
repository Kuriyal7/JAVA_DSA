import java.util.Scanner;
public class digitsum{

public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number");
    int n=sc.nextInt();
   int m;
    int sum=0;
    while(n>0){
        m=n%10;
        sum=sum +m;
        n=n/10;
    }
    System.out.println(sum);
}
}