import java.util.*;

public class Mod2Problem8 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
    
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("Original ArrayList: " + list);
        reverse(list);
    }
    public static void reverse(ArrayList<Integer> list) {
        int size = list.size();
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println(); 
    }
}