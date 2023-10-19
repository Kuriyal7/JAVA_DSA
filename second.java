import java.util.Scanner;
public class second{

public static void main(String[] args) {
          
          Scanner sc=new Scanner(System.in);
          System.out.println("enter the number");
          int n=sc.nextInt();
          System.out.println((n%2==0)?"number is even":"number is odd");
     }
}