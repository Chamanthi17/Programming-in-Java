import java.io.*;
import java.util.Scanner;
public class ElectricityBillCalculation{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        float previous,current;
        ElectricityBill consumer1=new ElectricityBill(123,"Venkat",1254.3f,1780.5f,"domestic");
        ElectricityBill consumer2=new ElectricityBill();
        consumer2.setNumber(345);
        consumer2.setName("Surya");
        consumer2.setPreviousReading(345.76f);
        consumer2.setCurrentReading(401.34f);
        consumer2.setType("commercial");
        System.out.println("Consumer 1 Details:");
        System.out.println("Consumer 1 number is :"+consumer1.getNumber());
        System.out.println("Consumer 1 name is :"+consumer1.getName());
        System.out.println("Consumer 1 previous month reading is :"+consumer1.getPreviousReading());
        System.out.println("Consumer 1 cuurent reading is :"+consumer1.getCurrentReading());
        System.out.println("Consumer 1 EB type:"+consumer1.getType());
        System.out.println("Consumer 1 Current bill is :"+consumer1.getBill());
        System.out.println("Consumer 2 Details:");
        System.out.println("Consumer 2 number is :"+consumer2.getNumber());
        System.out.println("Consumer 2 name is :"+consumer2.getName());
        System.out.println("Consumer 2 previous month reading is :"+consumer2.getPreviousReading());
        System.out.println("Consumer 2 cuurent reading is :"+consumer2.getCurrentReading());
        System.out.println("Consumer 2 EB type:"+consumer2.getType());
        System.out.println("Consumer 2 ElectricityBill is :"+consumer2.getBill());
    }
}
class ElectricityBill{
    private int consumer_num;
    private String consumer_name;
    private float previous_month_reading;
    private float current_month_reading;
    private String type_of_connection;
    public ElectricityBill(){
    }
    public ElectricityBill(int num, String name,float previous_reading,float current_reading,String type){
        this.consumer_num=num;
        this.consumer_name=name;
        this.previous_month_reading=previous_reading;
        this.current_month_reading=current_reading;
        this.type_of_connection=type;
    }
    public void setNumber(int num){
        consumer_num=num;
    }
    public void setName(String name){
        consumer_name=name;
    }
    public void setPreviousReading(float previous_reading){
        previous_month_reading=previous_reading;
    }
    public void setCurrentReading(float current_reading){
        current_month_reading=current_reading;
    }
    public void setType(String type){
        type_of_connection=type;
    }
    public int getNumber(){
        return this.consumer_num;
    }
    public String getName(){
        return this.consumer_name;
    }
    public float getPreviousReading(){
        return this.previous_month_reading;
    }
    public float getCurrentReading(){
        return this.current_month_reading;
    }
    public String getType(){
        return this.type_of_connection;
    }
    public float getBill(){
        float bill,diff;
        diff=current_month_reading - previous_month_reading;
        if(type_of_connection=="domestic")
        {
            if(diff<=100){
                bill=diff*1f;
            }
            else if(diff>100 && diff<=200){
                bill=(100*1f)+((diff-100)*2.50f);
            }
            else if(diff>200 && diff<=500){
                bill=(100*1f)+(100*2.50f)+((diff-200)*4f);
            }
            else{
                bill=(100*1f)+(100*2.50f)+(300*4f)+((diff-500)*6f);
            }
        }
        else
        {
            if(diff<=100){
                bill=diff*2f;
            }
            else if(diff>100 && diff<=200){
                bill=(100*2f)+((diff-100)*4.50f);
            }
            else if(diff>200 && diff<=500){
                bill=(100*2f)+(100*4.50f)+((diff-200)*6f);
            }
            else{
                bill=(100*2f)+(100*4.50f)+(300*6f)+((diff-500)*7f);
            }
        }
        return bill;
    } 
}
