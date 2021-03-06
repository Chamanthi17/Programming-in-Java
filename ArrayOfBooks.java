import java.io.*;
import java.util.Scanner;
public class ArrayOfBooks{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        Book[] book=new Book[30];
        System.out.println("Enter no.of books:");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            String s1=new String();
            long num;
            String s2=new String();
            String s3=new String();
            System.out.println("Enter book details(Name,ISBN num,Author,Publisher):");
            s1=sc.next();
            num=sc.nextLong();
            s2=sc.next();
            s3=sc.next();
            book[i]=new Book();
            book[i].setName(s1);
            book[i].setISBNNumber(num);
            book[i].setAuthorName(s2);
            book[i].setPublisher(s3);
        }
        for(int i=0;i<n;i++)
        {
            int j=i+1;
            System.out.println("Details of book -"+j);
            book[i].getBookInfo();
            System.out.println();
        }
    }
}
class Book{
    private String name;
    private long isbn_number;
    private String author_name;
    private String publisher;
    public Book(){
    }
    public Book(String name,long isbn_number,String author_name,String publisher){
        this.name=name;
        this.isbn_number=isbn_number;
        this.author_name=author_name;
        this.publisher=publisher;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setISBNNumber(long isbn_number){
        this.isbn_number=isbn_number;
    }
    public void setAuthorName(String author_name){
        this.author_name=author_name;
    }
    public void setPublisher(String publisher){
        this.publisher=publisher;
    }
    public String getName(){
        return this.name;
    }
    public long getISBNNumber(){
        return this.isbn_number;
    }
    public String getAuthorName(){
        return this.author_name;
    }
    public String getPublisher(){
        return this.publisher;
    }
    public void getBookInfo(){
        System.out.println("Book name "+name);
        System.out.println("ISBN number "+isbn_number);
        System.out.println("Author name "+author_name);
        System.out.println("Publisher name "+publisher);
    }
}
