import java.util.Scanner;

public class days {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the day");
        int n=sc.nextInt();
        if(n==1)
        System.out.println("monday");
        else if(n==2)
        System.out.println("tuesday");
        else if(n==3)
        System.out.println("wednesday");
        else if(n==4)
        System.out.println("thrusday");
        else if(n==5)
        System.out.println("friday");
        else if(n==6)
        System.out.println("saturday");
        else
        System.out.println("sunday");
    }
}
