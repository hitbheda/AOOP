class A{
    void DisplayA(){
        System.out.println("This Is Class A");
    }
}interface B {
    public void DisplayInterface();
}class C extends A implements B {
    public void DisplayInterface(){
        System.out.println("This Is Interface Method");
    }
}class D extends C{
    void DisplayD(){
        System.out.println("This Is Class D");
    }
}class E extends C{
    void DisplayE(){
        System.out.println("This is Class E");
    }
}
public class Main {
    public static void main(String[] args) {
        D Obj1 = new D();
        Obj1.DisplayA();
        Obj1.DisplayInterface();
        Obj1.DisplayD();

        E Obj2 = new E();
        Obj2.DisplayA();
        Obj2.DisplayInterface();
        Obj2.DisplayE();
    }
}

