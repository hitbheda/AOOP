//package Practicle4.A;
import java.util.Scanner;

class Circle{
    final double PI = 3.14f;
    Circle(float r){
        System.out.println("The Circumphrance Of Circle = "+(2*PI*r));
        System.out.println("The Area Of Circle = "+(PI*r*r));
    }
}
public class Fine {
    public static void main(String[] args) {
        Scanner newObj = new Scanner(System.in);
        System.out.print("Enter Radius Of Circle :");
        float r = newObj.nextInt();
        Circle o1 = new Circle(r);
    }
}