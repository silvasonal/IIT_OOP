public class DriverLicense extends Card{
    
    private int expiration_year;

    public DriverLicense(){};

    public boolean isExpired(){
        return true;
    }

    @Override public String format(){
        return super.format() + "\n" + 
               "expiration_year: " + this.expiration_year;
    }

}
