package Experiment_11 ;
import java.util.Scanner; 

public class DistanceConverter{
	

	Scanner sc = new Scanner(System.in);
	double km , meter , mile , input ;
		
	public void metersToKm(){
		input = sc.nextDouble();
		km = input*0.001; 
		System.out.println(input +" meters = "+km +" Kilometers");	
	}
		
	public void milesToKm(){
		input = sc.nextDouble();
		km = input*1.609344; 
		System.out.println(input +" miles = "+km +" Kilometers");		
	}

	public void kmToMeters(){
		input = sc.nextDouble();
		meter = input/0.001; 
		System.out.println(input +" Kilometers = "+meter +" meters");		
	}

	public void kmToMiles(){
		input = sc.nextDouble();
		km = input/1.609344; 
		System.out.println(input +" Kilometers = "+ km +" miles");		

	}
	
}
