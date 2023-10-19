import java.util.Scanner;
public class temperatureConverter{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter temperature");
        int n=sc.nextInt();
        int f=(n*(9/5))+32;
        System.out.println(f+" degree farenhite");
    }
}