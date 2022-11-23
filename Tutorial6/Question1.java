public class Question1 {
    

    public static void loadArray(int[] list) {
        for (int i = 1; i < list.length; i++)
        {
            list[i] = list[i] + list[i - 1];
        }
        
        for(int i=0;i<list.length;i++){
            System.out.println(list[i]);
        }
    }
    
    public static void main(String[] args) {
        
        int[] numbers = {3, 6};

        loadArray(numbers);

    }

}

//output
//a) -
//b) 3,9
//c) 4,10,18
//d) 1,3,6,10
//e) 8,12,14,14,18

