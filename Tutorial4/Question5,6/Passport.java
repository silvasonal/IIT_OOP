public class Passport extends Card{

    private String birth_location;
    private int expiration_year;
    
    public Passport(){}

    public boolean isExpired(){
        return true;
    }
    
}
