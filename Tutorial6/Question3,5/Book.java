import java.util.ArrayList;


public class Book implements Comparable<Book>{
    private String title;
    private double price;
    private String publiashed_year;
    private String author;

    ArrayList<Book> informations =  new ArrayList<Book>();

    public Book(){
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

    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", year=" + publiashed_year +
                ", author='" + author + '\'' +
                '}';
    }

    @Override public int compareTo(Book b){
        if(this.publiashed_year.compareTo(b.getPubliashed_year()) == 0 )
             return 0;
        else if (this.publiashed_year.compareTo(b.getPubliashed_year()) > 0) 
             return 1;
        else 
             return -1;
    }   

  

}

  