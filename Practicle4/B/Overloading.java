import java.util.Scanner;
class Method{
    final double PI = 3.14f;
    void Area(float radius){
        System.out.println("Area Of Circle = "+(PI*radius*radius));
    }
    void Area(float length,float width){
        System.out.println("Area Of Rectangle = "+(length*width));
    }
}
public class Overloading{
    public static void main(String[] args){
        Scanner Obj = new Scanner(System.in);
        System.out.print("Enter Redius Of Circle:");
        float r = Obj.nextFloat();
        System.out.print("Enter Length Of Rectangle:");
        float l = Obj.nextFloat();
        System.out.print("Enter Width Of Rectangle:");
        float w = Obj.nextFloat();
        Method newObj = new Method();
        newObj.Area(r);
        newObj.Area(l,w);
    }
}