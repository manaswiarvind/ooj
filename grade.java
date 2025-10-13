class calgrade{

    void calculategrade(int marks){
        if(marks>=90){
            System.out.println("grade is A");
        }
        else if(marks>=80){
            System.out.println("grade is B");
        }
        else if(marks>=70){
            System.out.println("grade is C");
        }
        else if(marks>=60){
            System.out.println("grade is D");
        }
        else if(marks>=50){
            System.out.println("grade is E");
        }
        else{
            System.out.println("grade is F");
        }
    }

       void calculategrade(int marks1,int marks2,int marks3){
            int avg=(marks1+marks2+marks3)/3;
            System.out.println("avg is "+avg);
            if(avg>=90){
            System.out.println("grade is A");
        }
        else if(avg>=80){
            System.out.println("grade is B");
        }
        else if(avg>=70){
            System.out.println("grade is C");
        }
        else if(avg>=60){
            System.out.println("grade is D");
        }
        else if(avg>=50){
            System.out.println("grade is E");
        }
        else{
            System.out.println("grade is F");
        }
        }

       void calculategrade(double per){
             if(per>=90){
            System.out.println("grade is A");
        }
        else if(per>=80){
            System.out.println("grade is B");
        }
        else if(per>=70){
            System.out.println("grade is C");
        }
        else if(per>=60){
            System.out.println("grade is D");
        }
        else if(per>=50){
            System.out.println("grade is E");
        }
        else{
            System.out.println("grade is F");
        }
        }

}

public class grade {
    public static void main(String[] args){
        calgrade c1=new calgrade();
        calgrade c2=new calgrade();
        calgrade c3=new calgrade();

        c1.calculategrade(95);
        c2.calculategrade(97,96,97);
        c3.calculategrade(98);
    }
}
