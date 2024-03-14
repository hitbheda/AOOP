import java.util.Scanner;

public class Inherit {
    public static float w;
    public static float h;
    public static void main(String[] args){
        Scanner Obj = new Scanner(System.in);
        System.out.print("Enter Width Of Ractangle :");
        w = Obj.nextFloat();
        System.out.print("Enter Height Of Ractangle :");
        h = Obj.nextFloat();
        Area newObj = new Area();
        Obj.close();
    }
}

class Area extends Inherit{
    Area(){
        System.out.println("Area Of Ractangle = "+Inherit.h*Inherit.w);
    }
}