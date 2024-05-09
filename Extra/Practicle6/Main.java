import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            FileInputStream file = new FileInputStream("./file.txt");
            int data = file.read();
            while(data != -1){
                System.out.print((char)data);
                data = file.read();
            }
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
