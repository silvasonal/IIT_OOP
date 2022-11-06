

public class BankAccount implements Comparable<BankAccount> {

    private String account_name;

    //constructor 
    public BankAccount(String acc_name){
        this.account_name = acc_name;
    }

    @Override public int compareTo(BankAccount ba){
        //if strings are equal
        if(this.account_name.compareTo(ba.account_name) == 0 )
            return 0;
        else if (this.account_name.compareTo(ba.account_name) > 0) 
            return 1;
        else 
            return -1;    
        
    }   
 
    public String getBankAccount(){
        return account_name;
    }
}
