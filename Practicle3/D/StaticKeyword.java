// import java.util.Scanner;

class Hello{
  static int Count;
  Hello(){
    Count++;
    System.out.println("Count = "+Count);
  }
}

public class StaticKeyword {
 public static void main(String[] args) {
  Hello Obj1 = new Hello();
  Hello Obj2 = new Hello();
  Hello Obj3 = new Hello();

 }  
}
