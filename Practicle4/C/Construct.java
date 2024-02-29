import java.util.Scanner;
class hello{
    float l;
    float w;
    hello(){
        l = 10;
        w = 5;
    }
    hello(float l,float w){
        this.l = l;
        this.w = w;
    }
    void display(){
        System.out.println("Area Of Rectsngle = "+(l*w));
    }
}

public class Construct{
    public static void main(String[] args){
        Scanner Obj = new Scanner(System.in);
        System.out.print("Enter Length Of Rectangle:");
        float l = Obj.nextFloat();
        System.out.print("Enter Width Of Rectangle:");
        float w = Obj.nextFloat();
        hello o1 = new hello();
        o1.display();
        hello o2 = new hello(l,w);
        o2.display();
    }
}