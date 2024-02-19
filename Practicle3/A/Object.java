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
        NewClass Obj = new NewClass();
        Obj.stud();
        Obj.display();
    }
}
