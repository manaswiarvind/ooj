import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("enter thr number");
        int n=input.nextInt();

        int a=0;
        int b=1;
        int cnt=2;
        System.out.print(a+" ");
        System.out.print(b+" ");
        while(cnt<=n){
            int sum=a+b;
            a=b;
            b=sum;
            System.out.print(sum+" ");
            cnt++;
        }
    }
}
