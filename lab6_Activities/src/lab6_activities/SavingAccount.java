package lab6_activities;


// home Activity 1
public class SavingAccount {
     public static double annualInterestRate;
    private int SavingBalance;
    SavingAccount(){
}
SavingAccount(int SB){
    SavingBalance=SB;
    annualInterestRate=0;
}

    public int calculateMonthlyInterest(){
        SavingBalance += ((SavingBalance * annualInterestRate)/12);
        return SavingBalance;
        
    }
    public static void modifyInterestRate(double new_value){
        annualInterestRate=new_value;
    }
    public int getBalance(){
        return SavingBalance;
    }

}

