import java.util.Scanner;
class Reverse{
  public static void main(String[] args) {
    Scanner newObj = new Scanner(System.in);
    System.out.print("Enter Number:");
    int n = newObj.nextInt();
    int lastNum = 0,rev = 0;
    while(n!=0){
        lastNum = n % 10;
        rev = (rev * 10 ) + lastNum;
        n = n / 10;
    }
    System.out.print("Reversed Number :"+rev);
  }
}
