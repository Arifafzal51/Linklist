import java.util.Scanner;

class fact{
    public static int fact(int n){
        if(n==1){
            return 1;

        }
        int rec=fact(n-1);
        int ans=n*rec;
        return ans;

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(fact(n));

    }
}