import java.util.*;

class Main{
    public static void main(String[] args) {
        LinkedList<String> list1 = new LinkedList<String>();
        String[] arr1 = {"January","February","March","April","May","June","July","August","Suptember"};
        for(String month : arr1){
            list1.add(month);
        }
        System.out.println(list1);
    }
}