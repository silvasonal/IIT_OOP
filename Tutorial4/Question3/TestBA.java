import java.util.Collections;
import java.util.ArrayList;

//import java.util.*;

public class TestBA {
    
    public static void main(String[] args) {
        
        ArrayList<BankAccount> baList = new ArrayList<BankAccount>();
        
        baList.add(new BankAccount("ba3"));
        baList.add(new BankAccount("ba1"));
        baList.add(new BankAccount("ba2"));
        baList.add(new BankAccount("ba4"));
        
        Collections.sort(baList);

        for(BankAccount ba : baList){
           System.out.println(ba.getBankAccount());
        }

    }
}
