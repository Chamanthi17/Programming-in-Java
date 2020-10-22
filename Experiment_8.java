import java.util.Scanner;
import java.util.regex.*;
public class Experiment_8{
	public static void main(String[] args) {
	    String user_name,user_id,user_mobilenumber;
	    Scanner sc =new Scanner(System.in);
		System.out.println("Enter the user Name");
		user_name= sc.next();
		if(Pattern.matches("[a-zA-Z]+[0-9]+",user_name))
		    System.out.println(user_name+" is valid user name");
		else
		    System.out.println(user_name+" is invalid user name");
		System.out.println("Enter the user id");
		user_id= sc.next();
		if(Pattern.matches("[0-9]+",user_id))
		    System.out.println(user_id+" is valid user id");
		else
		    System.out.println(user_id+" is invalid user id,user id should have only numbers");
		System.out.println("Enter the user mobile number");
		user_mobilenumber= sc.next();
		if(Pattern.matches("[789]{1}[0-9]{9}",user_mobilenumber))
		    System.out.println(user_mobilenumber+" is valid mobile number");
		  
		else
		    System.out.println(user_mobilenumber+" is invalid mobile number");
	}
}
