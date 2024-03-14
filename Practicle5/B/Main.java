import java.util.Scanner;
    public static String Name = Student.Name;
    public static int Enrollment = Student.Enrollment;
    public static boolean isPresent = Student.isPresent;
public class Main extends Student{
    public static void main(String[] args){
        Scanner Obj = new Scanner(System.in);
        System.out.print("Enter Student Name:");
        Name = Obj.nextLine();
        System.out.print("Enter Student Enrollment:");
        Enrollment = Obj.nextInt();
        System.out.print("Enter Student Is Present Or Not true/false:");
        isPresent = Obj.nextBoolean();
        Obj.close();
    }    
}
class Student{
    public static String Name;
    public static int Enrollment;
    public static boolean isPresent;
}
