package AccountProblem;

import java.util.Scanner;

public class Account {
    public static void main(String [] args) {
        //creating object of account class
        Account account = new Account();
        //using scanner utility class
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Withdraw Amount : ");
        int withdrawAmount = scanner.nextInt();
        account.debitAmount(withdrawAmount ,50000F);
        scanner.close();
    }


    public static float debitAmount(int withdrawAmount, float accountBalance) {
        if(withdrawAmount <= accountBalance)
        {
            accountBalance= accountBalance-withdrawAmount;
            System.out.println("You have debited "+withdrawAmount+". Now your Current account balance :"+accountBalance);
        }
        else if (withdrawAmount > accountBalance)
            System.out.println("Debited amount exceeded current account balance.");
        return accountBalance;
    }

}
