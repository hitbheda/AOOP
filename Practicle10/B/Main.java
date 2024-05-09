import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1,"Hit");
        map.put(2,"Khelan");
        map.put(3,"Nandan");
        map.put(4,"Krishiv");

        for(int i:map.keySet()){
            System.out.println("Key "+i+" Val "+map.get(i));
        }
    }    
}
