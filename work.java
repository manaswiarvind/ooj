import java.util.Scanner;
interface staff{
    public void performduties();
}

class doctor implements staff{
   public void performduties(){
    System.out.println("Doctor checking the patients\n");
    }
}

class nurse implements staff{
   public void performduties(){
    System.out.println("Nurse helping the doctors\n");
    }
}

class technician implements staff{
   public void performduties(){
    System.out.println("Technician checks the machines\n");
    }
}

public class work {
    public static void main(String[] args){
        staff[] s1={new doctor(),new nurse(),new technician()};
        for(staff s:s1){
            s.performduties();
        }
    }
}
