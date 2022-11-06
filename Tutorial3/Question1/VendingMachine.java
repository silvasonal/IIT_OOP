package Question1;

class VendingMachine{

    private int remaining_cans;
    public int max_cans;
    private int no_of_tokens;

    public VendingMachine(){
        //int cans =10;
        //int tokens=0;
        remaining_cans=0;
    }

    public VendingMachine(int cans){
        //int tokens=0;
        this.max_cans = cans;        
        remaining_cans=0;

    }

    public void insertToken(){
        if(max_cans>0){
            this.no_of_tokens +=1;
            this.remaining_cans = max_cans - 1;
            this.max_cans -=1;            
        }
    }
 
    //get the can-count at a given time
    public void viewCans(){
        System.out.println("Remaning cans: " + remaining_cans);
    }

    //get the token-count at a given time
    public void viewTokens(){
        System.out.println("Sold tokens: " + no_of_tokens);
    }

    //this method will use to insert the cans to the vending machine
    public void fillCans(int cans){
        //if (remaining_cans >= cans ){
            max_cans = max_cans + cans;
            //remaining_cans = remaining_cans - cans;
        //}        
    }

}



