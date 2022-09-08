import java.util.Scanner;

public class rec{
    public static void num(int n) {
        if(n==0){
            return;
        }

        System.out.println(n);
        num(n-1);

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i= sc.nextInt();


        int n =i;
        num(n);
    }
}