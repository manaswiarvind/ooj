import java.util.Scanner;
public class university {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number of students\n");
        int n=input.nextInt();
        input.nextLine();
        String[] names=new String[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the name of the student");
            names[i]=input.nextLine();
        }
        for(int i=0;i<n;i++){
            try{
                 if(names[i].isEmpty()){
                    throw new NullPointerException("NUll");
            }
            System.out.println("Length"+names[i].length());
            }

            catch(NullPointerException e){
                System.out.println("Exception "+e.getMessage());
            }
        }
           input.close();
        }
        
    }

