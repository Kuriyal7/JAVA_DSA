import java.util.Scanner;
public class leapyear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("enter the year");
        int n=sc.nextInt();
        if(n%4==0){
            if(n%100!=0){
                System.out.println("leap year");
            }
            else if (n%400==0){
                System.out.println("Leap year");
            }
            else{
                System.out.println("not a leap yaer");
            }
        }
    }
    
}
