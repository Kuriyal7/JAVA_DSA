import java.util.Scanner;


public class checking {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number");
    int n=sc.nextInt();
    System.out.println((n>=0)?((n>0)?"number is positive":"number is zero"):"number is negative");
    
}
}