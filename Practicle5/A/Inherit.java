import java.util.Scanner;

public class Inherit {
    protected static float w;
    protected static float h;
    public static void main(String[] args){
        Scanner Obj = new Scanner(System.in);
        System.out.print("Enter Width Of Ractangle :");
        w = Obj.nextFloat();
        System.out.print("Enter Height Of Ractangle :");
        h = Obj.nextFloat();
        Area newObj = new Area();
        newObj.Display();
        Obj.close();
    }
}

class Area extends Inherit{
    void Display(){
        System.out.println("Area Of Ractangle = "+Inherit.h*Inherit.w);
    }
}