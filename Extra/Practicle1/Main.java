public class Main {
    public static void main(String args[]) {
        int i = 0;
        while (args[i]) {
            i++;
            sum += args[i];
        }
        System.out.println("Sum ="+sum);
    }
}
