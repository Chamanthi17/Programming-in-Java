
import java.util.InputMismatchException;
import java.util.Scanner;

public class Experiment_12{
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            try {
                    System.out.print("Enter numbers: ");
                    int num1 = input.nextInt();
                    int num2 = input.nextInt();
                    int result = num1 / num2;
                    System.out.println(num1 + " / " + num2 + " = " + result);
            }
            catch (InputMismatchException e) {
                    System.out.println("Enter interger values only");
            }
            catch (ArithmeticException e){
                    System.out.println("Can't divide by zero.");
            }
    }    
}
