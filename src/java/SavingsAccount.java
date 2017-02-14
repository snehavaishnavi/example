
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class SavingsAccount implements InterfaceAccount {
    
    String accountType;
    ArrayList<String> accountHolders=new ArrayList<>();
    double currentBalance;
    String accountNumber;
    
    
    // constructor used to initialize the values 
    public SavingsAccount(String name,double deposit){
        if(deposit>=100){
            this.currentBalance=deposit; 
            this.accountHolders.add(name);
            this.accountNumber=UniqueBankAccNumber.generate();
            this.accountType="savings";
            
        }else{
            System.out.println("the deposit must atleast be 100$");
        }
        
    }
    
    //to get the account type
    @Override
    public String getAccountType() {
        return this.accountType;
    }

    //to get the account holders of the savings account
    @Override
    public ArrayList<String> getAccountHolders() {
        return this.accountHolders;
    }

    //to get the current balance
    @Override
    public double getCurrentBalance() {
        return this.currentBalance;
    }

    //to get the account number
    @Override
    public String getAccountNumber() {
        return this.accountNumber;
    }

    // to add a holder
    @Override
    public void addAccountHolder(String accHolder) {
        this.accountHolders.add(accHolder);
    }

    //to deposit money
    @Override
    public void deposit(double deposit) {
        this.currentBalance+=deposit;
    }

    //to withdraw money
    @Override
    public void withdrawl(double withdrawAmt) {
        double oldCurrentBalance=this.currentBalance;
        if((oldCurrentBalance-withdrawAmt)<100){
            System.out.println("\nThis transaction cannot be made because the available balance is only "+oldCurrentBalance);
        }else{
            this.currentBalance=oldCurrentBalance-withdrawAmt;
        }
    }

    //to calculate interest according to different rate of interests and to add it to the current balance
    @Override
    public void calculateInterest() {
        double interest;
        double currBal=this.currentBalance;
        double rateOfIn=0;
        if(currBal<1000){
            rateOfIn=0.01;
        }else if(currBal>=1000 && currBal<10000){
            rateOfIn=0.05;
        }else if(currBal>=10000){
            rateOfIn=0.1;
        }
        interest=((currBal*rateOfIn)/100);
        this.currentBalance=currBal+interest; 
    }
    
}
