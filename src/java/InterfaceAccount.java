
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
public interface InterfaceAccount {
    
    public String getAccountType();
    public ArrayList<String> getAccountHolders();
    public double getCurrentBalance();
    public String getAccountNumber();
    public void addAccountHolder(String accHolder); 
    public void deposit(double deposit);
    public void withdrawl(double withdrawAmt);
    public void calculateInterest();
    
}
