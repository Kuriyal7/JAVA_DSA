import java.util.Scanner;

public class employee {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your name");
        String name=sc.nextLine();
        System.out.println("enter salary");
        int sal=sc.nextInt();
        int net;
        int gross= sal+(sal*30)/100+(sal*20)/100+2000;
        System.out.println(" YOUR SALARY SLIP IS ");
        System.out.println("employee name="+name);
        System.out.println("gross salary="+gross);

        if(gross<10000){
            System.out.println("tax is 0%");
            net=gross;
            System.out.println("net salary ="+net);
        }
        else if(gross>10000 && gross<20000){
            System.out.println("tax is 10%");
            net=gross-(gross*10)/100;
            System.out.println("net salary ="+net);
        }
        else if(gross>20000 && gross<30000){
            System.out.println("tax is 15%");
            net=gross-(gross*15)/100;
            System.out.println("net salary ="+net);
        }
        else if(gross>30000&& gross <80000){
            System.out.println("tax is 30%");
            net=gross-(gross*30)/100;
            System.out.println("net salary ="+net);
        }
        else if(gross>80000){
            System.out.println("tax is 40%");
            net=gross-(gross*40)/100;
            System.out.println("net salary ="+net);
        }
        else{
            System.out.println("your salary is not more than 10000");
        }
    }
    
}
