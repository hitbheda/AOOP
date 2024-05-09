import java.util.*;

class Main{
    public static void main(String[] args) {
        HashSet<String> set1 = new HashSet<String>();
        String[] arr1 = {"Red","Green","Blue"};
        for(String month : arr1){
            set1.add(month);
        }
        for(String i : set1){
            System.out.println(i);
        }
    }
}