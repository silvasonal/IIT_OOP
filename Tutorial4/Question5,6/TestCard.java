import java.security.cert.CertPathBuilderException;

public class TestCard {
    
    public static void main(String[] args) {
        
        CreditCard cc = new CreditCard("SM SILVA", 12345, 999);

        if(cc.isExpired()==false)
            System.out.println("Card is Not expired");
        else
            System.out.println("Card is expired");
        
        //System.out.println(cc.getName());    
        System.out.println(cc.format());


        CreditCard cc1 = new CreditCard("O. SILVA", 3333, 123456);

        if(cc1.isExpired()==false)
            System.out.println("Card is Not expired");
        else
            System.out.println("Card is expired");
        
        //System.out.println(cc.getName());    
        System.out.println(cc1.format());

        //-------------------------------------------------------

        // Driver dl = new DriverLicense("SM SILVA", 12345, 999);

        // if(dl.isExpired()==false)
        //     System.out.println("Card is Not expired");
        // else
        //     System.out.println("Card is expired");
        
        // System.out.println(dl.getName());    
        // System.out.println(dl.format());


    }

}
