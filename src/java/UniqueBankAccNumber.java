
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public final class UniqueBankAccNumber {
    static ArrayList<String> accNum=new ArrayList<>();
    //method to generate unique bank account number
    public static String generate(){
       String acctNumber=null;
       do{
           Random accNumGenerator = new Random();
           int strLength=accNumGenerator.nextInt(100000);
           acctNumber = String.format("%05d", strLength);
       }while(check(acctNumber));
       
        accNum.add(acctNumber);
        return acctNumber;
       
    }
    //method to check if the generated account number is already present or not
    public static boolean check(String an){
        boolean flag=false;
        for(String s:accNum){
            if(an==s){
                flag=true;
            }
        }
            return flag;
    }
    
}
