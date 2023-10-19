import java.util.Scanner;

public class main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []a ={12,3,4,5,6,7,8};
        first_occurence(a, 3, 0);
        System.out.println(first_occurence(a, 9, 0));
        

    }
    public static int first_occurence(int []a,int x,int i){
        if(i==a.length){
            return -1;
        }
        if(x==a[i]){
            return i;
        }
        return first_occurence(a, x, i+1);

    }
}