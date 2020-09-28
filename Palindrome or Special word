import java.io.*;
import java.util.Scanner;
public class PalindromeNSpl{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		String str=sc.next();
		int i,j,count=0;
		String []lst=str.split("");
		j=(lst.length-1);
		for(i=0;i<(lst.length/2);i++){
			if(j>0){
				if(lst[i].equals(lst[j]))
					count++;
			}
			j--;
			
		}
		if(count==1)
			System.out.println("Only Special Word");
		else if(count==(lst.length/2))
			System.out.println("Palindrome");
		else
			System.out.println("Not a Special word and not a Palindrome");
	}
}
