import java.util.Random;
public class Experiment_7
{
	public static void main(String[] args) {
	    Random rn=new Random();
		int count=0;
		int d1[] = new int[1000];
		int d2[] = new int[1000];
		System.out.println("pair of dices with same number are");
		for(int i=0;i<1000;i++){
		    d1[i]=1+rn.nextInt(6);
		    d2[i]=1+rn.nextInt(6);
		    
		    if(d1[i]==d2[i]){
			System.out.print("( "+d1[i]+","+d2[i]+" )\t");
		        count++;
		    }
		}
		System.out.println("\nNumber of doubles = "+count);
	}
}
