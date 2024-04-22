import java.util.Scanner;

class MyException extends Exception{
    private int ex;
    MyException(int b){
        ex = b;
    }
    public String toString(){
        return "Number Can't Be Divided By "+ex;
    }
}

public class Main{
    static void divide(int a,int b) throws MyException{
        if(b == 0){
            throw new MyException(b);
        }else{
            System.out.println("Division = "+(a/b));
        }
    }

    public static void main(String[] arg){
        Scanner Obj = new Scanner(System.in);
        System.out.print("Enter A : ");
        int a = Obj.nextInt();
        System.out.print("Enter B : ");
        int b = Obj.nextInt();
        try {
            divide(a, b);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}