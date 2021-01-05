package Experiment_11;
import java.util.Scanner;

public class Currency{
	
		Scanner sc = new Scanner(System.in);
		double INR, USD , EURO , YEN ;

		public void dollarToRupee(){
			System.out.println("Enter how many dollars to convert into Rupees : ");
			USD = sc.nextDouble();
			INR = USD*73 ;
			System.out.println("Dollar ="+USD+"equal to INR="+INR);
		} 
		
		public void euroToRupee(){
			System.out.println("Enter how many euros to convert into Rupees : ");
			EURO = sc.nextDouble();
			INR = EURO*90 ;
			System.out.println(EURO +"EURO'S Equals to "+INR+"INR");
		}
				
		public void yenToRupee(){
			System.out.println("Enter how many YEN'S to convert into Rupees : ");
			YEN = sc.nextDouble();
			INR = YEN*0.71;
			System.out.println(YEN +"YEN'S Equals to "+INR+"INR");
		}

		public void rupeeToDollar(){
			System.out.println("Enter how many Rupees to convert into dollars : ");
			INR = sc.nextDouble();
			USD = INR/73 ;
			System.out.println("INR ="+INR+"equal to Dollar="+USD);
		} 

		public void rupeeToEuro(){
			System.out.println("Enter Rupees to convert into Euro:");
			INR = sc.nextDouble();
			EURO =(INR/90);
			System.out.println("Rupee ="+INR +"equal to Euro="+EURO);
		} 

		public void rupeeToYen(){
			System.out.println("Enter Rupees to convert into Yen:");
			INR = sc.nextDouble();
			YEN =(INR/0.71);
			System.out.println("INR="+INR +"equal to YEN"+YEN);
		}	
}


