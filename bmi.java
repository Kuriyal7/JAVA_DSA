import java.util.Scanner;
public class bmi{

public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the weight");
    int w=sc.nextInt();
    System.out.println("enter the height");
    int h=sc.nextInt();
    int b=w/(h*h);
    System.out.println((b>18.5)?((b>25.9)?"overweight":"normal"):"underweight");

}
}