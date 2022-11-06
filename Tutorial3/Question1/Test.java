package Question1;
import Question1.VendingMachine;

public class Test {

    public static void main(String[] args) {
        
        //VendingMachine v1 = new VendingMachine(5);
       VendingMachine v1 = new VendingMachine(4);
        System.out.println("Total cans: " + v1.max_cans);

        //buying a soda can
        v1.insertToken();
        v1.insertToken();
        v1.insertToken();
        v1.insertToken();
        v1.insertToken();
        v1.insertToken();
        v1.insertToken();
       
        v1.viewTokens();
        v1.viewCans();
        
        System.out.println("--------- Fill cans-----------------");
        v1.fillCans(6);
        System.out.println("Added 6 cans");

        System.out.println("Total cans: " + v1.max_cans);



    }
}

    

