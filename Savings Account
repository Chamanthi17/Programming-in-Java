import java.io.*;
public class Savings
{
    public static void main(String args[])
    {
        SavingsAccount saver1 = new SavingsAccount(2000.0);
        SavingsAccount saver2 = new SavingsAccount(3000.0);

        SavingsAccount.modifyInterestRate(4);
        System.out.printf("for saver 1 account balance is : %.2f\n",saver1.getsavingsBalance());
        System.out.printf("for saver 1 annual Interest Rate is : %.2f\n",saver1.getannualInterestRate());
        System.out.printf("for saver 1 monthly Interest is : %.2f\n",saver1.calculateMonthlyInterest());
        System.out.printf("for saver 1 new balance is : %.2f\n",saver1.getsavingsBalance());
        System.out.println();
        System.out.printf("for saver 2 account balance is : %.2f\n",saver2.getsavingsBalance());    
        System.out.printf("for saver 2 annual Interest Rate is : %.2f\n",saver2.getannualInterestRate());
        System.out.printf("for saver 2 monthly Interest is : %.2f\n",saver2.calculateMonthlyInterest());
        System.out.printf("for saver 2 new balance is : %.2f\n",saver2.getsavingsBalance());
        SavingsAccount.modifyInterestRate(5);
        System.out.println();
        System.out.printf("For next month\n");
        System.out.println();
        System.out.printf("for saver 1 account balance is : %.2f\n",saver1.getsavingsBalance());
        System.out.printf("for saver 1 annual Interest Rate is : %.2f\n",saver1.getannualInterestRate());
        System.out.printf("for saver 1 monthly Interest is : %.2f\n",saver1.calculateMonthlyInterest());
        System.out.printf("for saver 1 new balance is : %.2f\n",saver1.getsavingsBalance());
        System.out.println();
        System.out.printf("for saver 2 account balance is : %.2f\n",saver2.getsavingsBalance());
        System.out.printf("for saver 2 annual Interest Rate is : %.2f\n",saver2.getannualInterestRate());
        System.out.printf("for saver 2 monthly Interest is : %.2f\n",saver2.calculateMonthlyInterest());
        System.out.printf("for saver 2 new balance is : %.2f\n",saver2.getsavingsBalance());
    }
}
class SavingsAccount
{
    static double annualInterestRate;
    private double savingsBalance;

    public SavingsAccount(double balance)
    {
        savingsBalance = balance;
    }

    public double calculateMonthlyInterest()
    {
        double monthlyInterest;
        monthlyInterest=(savingsBalance*annualInterestRate)/12;
        savingsBalance+=monthlyInterest;
        return monthlyInterest;
    }

    public static void modifyInterestRate(double rate)
    {
        annualInterestRate = rate;
    }


    public static double getannualInterestRate(){
        return annualInterestRate;
    }

    public double getsavingsBalance(){
        return savingsBalance;
    }

}
