
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
public class CheckingAccount implements InterfaceAccount{

    String accountType;
    ArrayList<String> accountHolders=new ArrayList<>();
    double currentBalance;
    String accountNumber;
    double rateOfInterest;
    
   //constructor to initializde the values 
    public CheckingAccount(String name,double deposit){
        this.accountHolders.add(name);
        this.currentBalance=deposit;
        this.accountNumber=UniqueBankAccNumber.generate();
        this.accountType="checking";
        this.rateOfInterest=0.01;
    }
    //mplemented methods from the interface to perform required actions
    @Override
    public String getAccountType() {
        return accountType;
    }

    @Override
    public ArrayList<String> getAccountHolders() {
        return accountHolders;
    }

    @Override
    public double getCurrentBalance() {
        return currentBalance;
    }

    @Override
    public String getAccountNumber() {
        return accountNumber;
    }

    @Override
    public void addAccountHolder(String accHolder) {
        accountHolders.add(accHolder);
    }

    @Override
    public void deposit(double deposit) {
        this.currentBalance+=deposit;
    }

    @Override
    public void withdrawl(double withdrawAmt) {
        double oldCurrentBalance=this.currentBalance;
        if((oldCurrentBalance-withdrawAmt)<0){
            System.out.println("\nThis transaction cannot be made because the available balance is only "+oldCurrentBalance);
        }else{
            this.currentBalance=oldCurrentBalance-withdrawAmt;
        }
    }
//to calculate interest and to add the interest to the current balance
    @Override
    public void calculateInterest() {
        double interest;
        double currBal=this.currentBalance;
        double rateOfIn=this.rateOfInterest;
        interest=((currBal*rateOfIn)/100);
        this.currentBalance=currBal+interest;  
    }
    
}
