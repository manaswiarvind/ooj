
class wrongage extends Exception {
   public  wrongage(String message){
        super(message);
    }
}


class father {
    int age;
  public father(int age) throws wrongage{
        if(age<0){
            throw new wrongage("Age is negative\n");
        }
        this.age=age;
   }
}


class son extends father{
    int sage;
    public son(int fage,int sage) throws wrongage{
        super(fage);
        if(fage<=sage){
            throw new wrongage("not possible\n");
        }
        this.sage=sage;
    }
}

public class lab7 {
    public static void main(String[] args){
        try{
            father f=new father(-45);
            son s=new son(45,15);
            System.out.println("father age"+f.age);
            System.out.println("son age"+s.sage);
        }
        catch(wrongage e){
            System.out.println("exception "+e.getMessage());
        }
    }
}
