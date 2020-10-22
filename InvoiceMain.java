import java.io.*;
import java.util.Scanner;
class Invoice{
        private String num;
        private String description;
        private int qty;
        private double price;
        public Invoice(){ }
        
        public Invoice(String n,String des,int qt,double prce)
        {
            num=n;
            description=des;
            qty=qt;
            price=prce;
        }
       // Setters
        public void setNum(String n)
        {
            num=n;
        }
        public void setDescription(String des)
        {
            description=des;
        }
        public void setQty(int qt)
        {
            qty=qt;
        }
        public void setPrice(double p)
        {
            price=p;
        }
       // Getters
       public String getNum()
       {
           return num;
       }
       public String getDescription()
       {
           return description;
       }
       public int getQty()
       {
           return qty;
       }
       public double getPrice()
       {
           return price;
       }

       public double getInvoiceAmount(){
                 double invoiceAmount = 0.0;
                // Write your logic here
                if(qty>0 && price>0)
                {
                    invoiceAmount=qty*price;
                }
                return invoiceAmount;
       }
}
public class InvoiceMain{
         public static void main(String []args){
                   Invoice myInvoice;
                   //Write your code here 
                   Invoice InvoiceTest=new Invoice();
                   InvoiceTest.setNum("1245q1");
                   InvoiceTest.setDescription("Hard disk");
                   InvoiceTest.setQty(2);
                   InvoiceTest.setPrice(12563.35);
                   System.out.println("Number of the item: "+InvoiceTest.getNum());
                   System.out.println("Description of item: "+InvoiceTest.getDescription());
                   System.out.println("Qty of item:"+InvoiceTest.getQty());
                   System.out.println("Price of item: "+InvoiceTest.getPrice());
                   System.out.println("InvoiceAmount :"+InvoiceTest.getInvoiceAmount());
                   }
}
