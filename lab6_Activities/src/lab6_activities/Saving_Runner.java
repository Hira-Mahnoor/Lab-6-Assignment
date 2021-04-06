/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_activities;

//home activity 1
public class Saving_Runner {
    public static void main(String[] args) {
        SavingAccount A1= new SavingAccount(2000);
        SavingAccount A2= new SavingAccount(3000);
        SavingAccount.modifyInterestRate(0.03);
        A1.calculateMonthlyInterest();
        A2.calculateMonthlyInterest();
       System.out.println("The new Saving balance for Saver1 is "+A1.getBalance());
       System.out.println("The new Saving balance for Saver1 is "+A2.getBalance());
   
       System.out.println("After modifying the interest Rate to 4% ");
       SavingAccount.modifyInterestRate(0.04);
        A1.calculateMonthlyInterest();
        A2.calculateMonthlyInterest();
        System.out.println("The new Saving balance for Saver1 is "+A1.getBalance());
        System.out.println("The new Saving balance for Saver2 is "+A2.getBalance());
     
        
      
        
    }
    
    
}
