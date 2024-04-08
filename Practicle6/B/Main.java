import java.util.Scanner;

abstract class Shape{
    float area;
    abstract void calculateArea(Scanner sc);
}

class Triangle extends Shape{
    void calculateArea(Scanner sc){
        System.out.print("\nEnter Triangle Base :");
        int base = sc.nextInt();
        System.out.print("Enter Triangle Height :");
        int height = sc.nextInt();
        area = (base*height)/2;
        System.out.println("Area of Triangle :"+ area);
    }
}

class Rectangle extends Shape{
    void calculateArea(Scanner sc){
        System.out.print("\nEnter Rectangle Length :");
        int length = sc.nextInt();
        System.out.print("Enter Rectangle Width :");
        int width = sc.nextInt();
        area = length*width;
        System.out.println("Area of Rectangle :"+area);
    } 
}

class Circle extends Shape{
    void calculateArea(Scanner sc){
        System.out.print("\nEnter Circle Radius :");
        int radius = sc.nextInt();
        area = 3.14f*radius*radius;
        System.out.println("Area of Circle :"+area+"\n");
    }
}

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle Obj1 = new Rectangle();
        Obj1.calculateArea(sc);
        Triangle Obj2 = new Triangle();
        Obj2.calculateArea(sc);
        Circle Obj3 = new Circle();
        Obj3.calculateArea(sc);
    }
}