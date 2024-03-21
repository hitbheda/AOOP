class A{
    void call_me(){
        System.out.println("Inside A");
    }
}
class B extends A{
    void call_me(){
        System.out.println("Inside B");
    }
}
class C extends A{
    void call_me(){
        System.out.println("Inside C");
    }
}
class Main{
    public static void main(String args[]){
        A a1=new A();
        B b1=new B();
        C c1=new C();
        A r;
        r=b1;
        r.call_me();
        r=a1;
        r.call_me();
        r=c1;
        r.call_me();
        System.out.println();
    }
}