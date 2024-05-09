import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter File Name :");
            String fName = sc.nextLine();
            File file = new File(fName);

            System.out.print("Enter File Data :");
            String fData = sc.nextLine();
            FileOutputStream fos = new FileOutputStream(file);
            
            byte[] bytes = fData.getBytes();
            fos.write(bytes);
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
