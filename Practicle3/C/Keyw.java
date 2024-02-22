import java.util.Scanner;
class rect{
    String Name;
    int Enrollment;
    rect(String Name,int Enrollment){
        this.Enrollment = Enrollment;
        this.Name = Name;
    }
    void Display(){
        System.out.println("Name Of Student = "+Name);
        System.out.println("Enrollment Of Student = "+Enrollment);
    }
}

public class Keyw{
    public static void main(String[] args){
        Scanner Obj = new Scanner(System.in);
        System.out.print("Enter Name:");
        String Name = Obj.nextLine();
        System.out.print("Enter Name:");
        int Enrollment = Obj.nextInt();
        rect r1 = new rect(Name,Enrollment);
        r1.Display();
        rect r2 = new rect(Name , Enrollment);
       r2.Display();
    }
}
