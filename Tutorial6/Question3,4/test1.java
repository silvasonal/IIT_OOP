import java.util.*;
public class test1 {
    

    public static void listDemo(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++)
        {
        int element = list.get(i);
        list.remove(i);
        list.add(0, element + 1);
        }
        System.out.println(list);
        }
    
    public static void main(String[] args) {
        
        ArrayList<Integer> numbers = [5, 10, 15];
        listDemo(numbers);

    }

}
