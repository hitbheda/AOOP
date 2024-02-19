import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner newObj = new Scanner(System.in);
        System.out.println("Enter First Number:");
        int x = newObj.nextInt();
        System.out.println("Enter Second Number:");
        int y = newObj.nextInt();
        System.out.println("1.Sum");
        System.out.println("2.Sub");
        System.out.println("3.Div");
        System.out.println("4.Multi");
        System.out.println("Choose Option:");
        int op = newObj.nextInt();
        if (op == 1) {
            System.out.printf("Sum:"+Sum(x,y));
        }else if(op == 2){
            System.out.printf("Subtraction:"+Sub(x,y));
        }else if(op == 3){
            System.out.printf("Division:"+Div(x,y));
        }else if(op == 4){
            System.out.printf("Multiplication:"+Multi(x,y));
        }else {
            System.out.println("Invalid input!");
        }
        
    }
    public static int Sum(int a, int b){
        return a+b;
    }
    public static int Sub(int a,int b){
        return a-b;
    }
    public static int Div(int a, int b){
        return a/b;
    }
    public static int Multi(int a,int b){
        return a*b;
    }
}
