package Question1;

import java.util.*;

interface Printable {
    void print(); 
}


class Letter implements Printable {

    private String text;

        public void print(){
            this.text ="hello";
            System.out.println(text);
        }
    }

class Student implements Printable {

    String name;
    String[] strArray = new String[5];

        public void print(){
    
        }
    }

