import java.util.ArrayList;

import javax.print.DocFlavor.STRING;

public class Book{
    private String title;
    private double price;
    private int publiashed_year;
    private String author;

    ArrayList<Book> informations =  new ArrayList<Book>();

    public Book(){
        this.title = "";
        this.price = 0.0;
        this.publiashed_year = 0;
        this.author ="";
    }

     //set methods
     public  void setTitle(String title){
        this.title = title;
    }

    public void setPrice(Double price){
        this.price = price;
    }

    public void setPubliashedYear(int publiashed_year){
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

    public int getPubliashed_year(){
        return publiashed_year;
    }

    public String getAuthor(){
        return author;
    }

    // public String toString(){


    //     String information ="";

        // information =   this.title;
        //                 this.publiashed_year;
        //                 this.author;
        //                 this.price;

    //     return information;
    // }

    public void AddInformation(String title,Double price , int published_year , String author){

        Book info = new Book();

        info.setTitle(title);
        info.setPrice(price);
        info.setPubliashedYear(published_year);
        info.setAuthor(author);

        informations.add(info);
        System.out.println("Added");

    }



    public static void main(String[] args) {

        Book b = new Book();

        b.AddInformation("aaa", 250.0, 2000, "abc");

        

    }

}