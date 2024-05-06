import java.io.FileOutputStream;
import java.util.Scanner;

class WriteFile{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter File Name :");
        String FileName = sc.nextLine();
        try{
            FileOutputStream Obj = new FileOutputStream(FileName,false);
            System.out.print("Enter File Content :");
            String Data = sc.nextLine();
            byte[] arr = Data.getBytes();
            Obj.write(arr);
            Obj.close();
        } catch (Exception e){
            System.out.println("Error While Execution "+e);
        }
    }
}