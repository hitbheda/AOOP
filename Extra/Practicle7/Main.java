import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("./file.txt");
            int character;
            while ((character = fileReader.read()) != -1) {
                System.out.println((char) character);
            }
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
