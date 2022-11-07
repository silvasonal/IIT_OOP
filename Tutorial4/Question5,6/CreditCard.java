
public class CreditCard extends Card {
    
    private int pin_number;
    private int number;

    public CreditCard(){}

    public CreditCard(String n, int pin, int num)
    {
        super(n);
        this.pin_number = pin;
        this.number = num;
    }

    public boolean isExpired(){
        return false;
    }

    @Override public String format(){
        return super.format() + "\n" + 
               "Pin Number: " + this.pin_number + "\n" +
               "Card Number: " + this.number;
               
    }


}
