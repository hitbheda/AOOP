import java.util.Scanner;

class rect{
    int h,w;
    rect(){
        h = 10;
        w = 4;
    }
    rect(int p){
        h = p;
        w = p;
    }
    rect(int p,int q){
        h = p;
        w = q;
    }
    void display(){
        System.out.println("Area Of Rectangle is = "+(h*w));
    }
}

public class Area{
    public static void main(String[] args){
        Scanner newObj = new Scanner(System.in);
        System.out.println("Enter P:");
        int p = newObj.nextInt();
        System.out.println("Enter Q:");
        int q = newObj.nextInt();

        rect r1 = new rect();
        rect r2 = new rect(p);
        rect r3 = new rect(p,q);
        r1.display();
        r2.display();
        r3.display();
    }
}