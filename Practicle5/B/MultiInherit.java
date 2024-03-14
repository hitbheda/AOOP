import java.util.Scanner;

// Grand Parant Class (Base Class)
class Grand{
    protected String GrandName;
    void GetGrand(Scanner Obj){
        System.out.print("Enter The Name Of Grand Parant:");
        GrandName = Obj.nextLine();
    }
    void PutGrand(){
        System.out.println("The Name Of Grand Parant = "+GrandName);
    }
}

// Parant Class (Derive Class Of Grand Parant And Base Class Of Child)
class Parent extends Grand{
    protected String ParantName;
    void GetParant(Scanner Obj){
        System.out.print("Enter The Name Of Parant:");
        ParantName = Obj.nextLine();
    }
    void PutParant(){
        System.out.println("The Name Of Parant = "+ParantName);
    }
}

// Children Class (Derive Class Class)
class Child extends Parent{
    protected String ChildName;
    void GetChild(Scanner Obj){
        System.out.print("Enter The Name Of Child:");
        ChildName = Obj.nextLine();
    }
    void PutChild(){
        System.out.println("The Name Of Children = "+ChildName);
    }
}

// Main Class 
public class MultiInherit{
    public static void main(String args[]){
        Scanner Obj = new Scanner(System.in);
        Child newObj = new Child();
        newObj.GetGrand(Obj);
        newObj.PutGrand();
        newObj.GetParant(Obj);
        newObj.PutParant();
        newObj.GetChild(Obj);
        newObj.PutChild();
    }
}