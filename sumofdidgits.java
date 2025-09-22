import java.util.Scanner;
public class sumofdidgits {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("enter the number");
        int n=input.nextInt();

        int sum=0;
        while(n>0){
            int digit=n%10;
            sum+=digit;
            n=n/10;
        }
        System.out.println(sum);
    }
}
