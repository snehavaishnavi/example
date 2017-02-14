/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class BankAccountDemo {
    public static void main(String[] args){
        //creating a checking account and peforming actions on the balance
        String name1="Jacob Smith";
        double deposit1=0;
        CheckingAccount account1=new CheckingAccount(name1, deposit1);
        System.out.println("\nthe account number created for Jacob Smith is: "+account1.getAccountNumber());
        account1.deposit(1000);
        System.out.println("\nthe current balance after the deposit is: "+account1.getCurrentBalance());
        account1.withdrawl(250);
        System.out.println("\nthe current balance after the withdrawal is: "+account1.getCurrentBalance());
        account1.calculateInterest();
        System.out.println("\nthe current balance after the interest is calulated and added is: "+account1.getCurrentBalance());
        account1.withdrawl(800);
        System.out.println("\nthe current balance after the withdrawal is: "+account1.getCurrentBalance());
        account1.calculateInterest();
        System.out.println("\nthe current balance after the interest is calulated and added is: "+account1.getCurrentBalance());
        
        //creating a savings account and performing actions on the balance
        String name2="Angela Dimello";
        double deposit2=900;
        SavingsAccount account2=new SavingsAccount(name2, deposit2);
        System.out.println("\n\nthe account number for Angela Dimello is: "+account2.getAccountNumber());
        account2.calculateInterest();
        System.out.println("\nthe current balance after the interest is calulated and added is: "+account2.getCurrentBalance());
        account2.deposit(100);
        System.out.println("\nthe current balance after the deposit is: "+account2.getCurrentBalance());
        account2.calculateInterest();
        System.out.println("\nthe current balance after the interest is calulated and added is: "+account2.getCurrentBalance());
        account2.withdrawl(1000);
        System.out.println("\nthe current balance after the withdrawal is: "+account2.getCurrentBalance());
         
    }
}
