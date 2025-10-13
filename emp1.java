class employee{
    String name;
    double salary;

    public employee(String name,double salary){
        this.name=name;
        this.salary=salary;
    }

    employee comparesalary(employee e){
        if(this.salary>e.salary){
            return this;
        }
        else{
            return e;
        }
    }
    void display(){
        System.out.println("name "+name+"salary "+salary);
    }
}
public class emp1 {
    public static void main(String[] args){
        employee e1=new employee("Manaswi",10000);
        employee e2=new employee("Kirti",29028302);
        employee e=e1.comparesalary(e2);
        e.display();
    }
}
