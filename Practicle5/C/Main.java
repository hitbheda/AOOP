import java.util.Scanner;

class Staff{
    protected static int[] staffId = new int[40];
    protected static String[] staffName = new String[40];
    protected static String[] staffRole = new String[40];
    protected static int staffCount;
    Scanner Obj = new Scanner(System.in);
    void getStaff(){
        System.out.print("How Many Member Are In Staff :");
        staffCount = Obj.nextInt();
        Obj.nextLine(); 
        for(int i = 0;i < staffCount;i++){
            System.out.println("Enter Staff Id " + i +"'s Details");
            staffId[i] = i;
            System.out.print("Enter Staff Name :");
            staffName[i] = Obj.nextLine();
            System.out.print("Enter Staff Role :");
            staffRole[i] = Obj.nextLine();
        }
    }
}

class TeachingStaff extends Staff{
    void filterData(){
        for(int i = 0;i < staffCount; i++){
            if(staffRole[i].equalsIgnoreCase("teacher")){
                System.out.println("Printing Teaching Staff Details:");
                System.out.println("Staff Id :"+staffId[i]);
                System.out.println("Staff Name :"+staffName[i]);
                System.out.println("Staff Role :"+staffRole[i]);
            }
        }
    }
}

class NonTeachingStaff extends Staff{
    void Display(){
        for(int i = 0;i < staffCount; i++){
            if(staffRole[i].equalsIgnoreCase("clerk") || staffRole[i].equalsIgnoreCase("peon")){
                System.out.println("Printing None Teaching Staff Details:");
                System.out.println("Staff Id :"+staffId[i]);
                System.out.println("Staff Name :"+staffName[i]);
                System.out.println("Staff Role :"+staffRole[i]);
            }
        }
    }
}
class Main {
    public static void main(String[] args){
        System.out.println("This Is Main");
        TeachingStaff Obj1 = new TeachingStaff();
        Obj1.getStaff();
        Obj1.filterData();
        NonTeachingStaff Obj2 = new NonTeachingStaff();
        Obj2.Display(); 
    }
}