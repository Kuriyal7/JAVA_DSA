import java.util.Scanner;
public class greatest{

public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter numbers");
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    System.out.println((a>b)?((a>c)?+a+" is greatest":+c+" is greatest"):((b>c)?+b+" is greatest":+c+" is greatest"));
}
}