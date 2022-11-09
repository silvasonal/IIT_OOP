public class q5 {
    public static void main(String[] args) {
    String x = "abc";
    String y = x; //abc
    y = new String("123");
    String z = x; //abc
    y = x; //abc
    z = "456";
    System.out.println(x+y+z);
    }
    }
