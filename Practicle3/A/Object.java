import java.util.Scanner;
class NewClass{
    int Enrollment;
    String Name;
    void stud(){
        Scanner newObj = new Scanner(System.in);
        System.out.print("Enter Name Of Student:");
        Name = newObj.nextLine();
        System.out.print("Enter Enrollment Of Student:");
        Enrollment = newObj.nextInt();
    }
    void display(){
        System.out.println("The Studen Name = "+Name);
        System.out.println("The Studen Enrollment = "+Enrollment);
    }
}
public class Object{
    public static void main(String[] arg){
        NewClass Obj1 = new NewClass();
        NewClass Obj2 = new NewClass();
        NewClass Obj3 = new NewClass();
        Obj1.stud();
        Obj1.display();
        Obj2.stud();
        Obj2.display();
        Obj3.stud();
        Obj3.display();
    }
}
