//package tutorial;

class testVending {

    public static void main(String[] args) {
        
        vending v1 = new vending();
       
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


        v1.insertToken();
        v1.insertToken();
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
        v1.fillCans(10);
        System.out.println("Added 10 cans"+ v1);

    }
}
