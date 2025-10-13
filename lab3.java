import java.util.Scanner;
class book{
    String name;
    String author;
    int price;
    int num_pages;
    Scanner input=new Scanner(System.in);
    public book(String name,String author,int price,int num_pages){
        this.name=name;
        this.author=author;
        this.price=price;
        this.num_pages=num_pages;
    }
   
    public void setname(String name){
        this.name=name;
    }
    public void setauthor(String author){
        this.author=author;
    }
    public void setprice(int price){
        this.price=price;
    }
    public void setnumpages(int num_pages){
        this.num_pages=num_pages;
    }
    public String getname(){
        return name;
    }
    public String getauthor(){
        return author;
    }
    public int getprice(){
        return price;
    }
    public int getnumpages(){
        return num_pages;
    }
     public String toString(){
        return("name"+name+"\n"+"author"+author+"\n"+"price"+price+"\n"+"pages"+num_pages);
    }
}
public class lab3 {
    public static void main(String[] args){
        int n;
        Scanner input=new Scanner(System.in);
        System.out.println("enter number of books");
        n=input.nextInt();
        input.nextLine(); 
        book[] books=new book[n];
        for(int i=0;i<n;i++){
            System.out.println("enter details of book "+(i+1));
            System.out.println("Eter name of book");
            String name=input.nextLine();
            System.out.println("enter author");
            String author=input.nextLine();
             System.out.println("enter price");
            int price=input.nextInt();
             input.nextLine();
            System.out.println("enter number of pages");
            int numpages=input.nextInt();
            input.nextLine();
            books[i]=new book(name,author,price,numpages);
        }
        input.close();
        for(int i=0;i<n;i++){
           System.out.println(books[i]);
        }
    }
}
