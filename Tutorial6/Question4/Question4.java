import java.util.ArrayList;

public class Question4{

    private String title;
    private double price;
    private String publiashed_year;
    private String author;

    ArrayList<Book> informations =  new ArrayList<Book>();

    public Question4(){
        this.title = "";
        this.price = 0.0;
        this.publiashed_year = "";
        this.author ="";
    }

     //set methods
     public  void setTitle(String title){
        this.title = title;
    }

    public void setPrice(Double price){
        this.price = price;
    }

    public void setPubliashedYear(String publiashed_year){
        this.publiashed_year = publiashed_year;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public String getTitle(){
        return (title);
    }

    public double getPrice(){
        return price;
    }

    public String getPubliashed_year(){
        return publiashed_year;
    }

    public String getAuthor(){
        return author;
    }

        

    public void AddInformation(String title,Double price , String published_year , String author){

        Book info = new Book();

        info.setTitle(title);
        info.setPrice(price);
        info.setPubliashedYear(published_year);
        info.setAuthor(author);

        informations.add(info);
        System.out.println("Added");

    }



    public static void main(String[] args) {

        Question4 b = new Question4();

        b.AddInformation("aaa", 250.0, "600", "abc");

    }

}
