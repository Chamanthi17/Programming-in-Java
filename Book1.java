import java.io.*;
class BookFair{
	private String Bname;
	private double price;
	public BookFair(){
		this.Bname="Twilight";
		this.price=1800.00;
	}
	public void Input(String Bname,double price){
		this.Bname=Bname;
		this.price=price;
	}
	public void calculate(){
		double discount;
		if(this.price<=1000)
			discount=0.02*price;
		else if(this.price>1000 && this.price<=3000)
			discount=0.1*price;
		else
			discount=0.15*price;
		this.price=price-discount;
	}
	public void display(){
		System.out.println("Book name: "+this.Bname);
		System.out.println("Price: "+this.price);
	}
}

public class Book1{
	public static void main(String args[]){
		BookFair b1=new BookFair();
		BookFair b2=new BookFair();
		b1.calculate();
		b1.display();
		b2.Input("Java",3000.00);
		b2.calculate();
		b2.display();
	}
}
