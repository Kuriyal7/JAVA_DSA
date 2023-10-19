import java.util.Scanner;
public class agegroup{

public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter tyhe age");
    int n=sc.nextInt();
    System.out.println((n>13)?((n>19)?"adult":"teenage"):"child");
    

}
}