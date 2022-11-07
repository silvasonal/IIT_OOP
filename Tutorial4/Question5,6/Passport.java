public class Passport extends Card{

    private String birth_location;
    private int expiration_year;
    
    public Passport(){}

    public boolean isExpired(){
        return true;
    }

    @Override public String format(){
        return super.format() + "\n" + 
               "birth location: " + this.birth_location + "\n" +
               "expiration_year: " + this.expiration_year;
    }
    
}
