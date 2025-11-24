import java.util.Scanner;

public class store {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int[] prices=new int[5];
        for(int i=0;i<5;i++){
            System.out.println("Enter the price");
            prices[i]=input.nextInt();
        }
        System.out.println("Enter the index");
        int n=input.nextInt();
        try{
            if(n<0 || n>4){
                throw new IndexOutOfBoundsException("Out of range");
            }
            System.out.println("Price "+prices[n]);
        }
        catch(IndexOutOfBoundsException e){
                System.out.println("Exception"+e.getMessage());
        }
    }
}
