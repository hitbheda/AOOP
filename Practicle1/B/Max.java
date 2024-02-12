import java.util.Scanner;

class Max{
	public static void main(String[] args){
		System.out.print("Enter A:");
		Scanner Obj = new Scanner(System.in);
		int a = Obj.nextInt();
		System.out.print("Enter B:");
		int b = Obj.nextInt();
		System.out.print("Enter C:");
		int c =Obj.nextInt();
		int Ans = ((a>b)?(a>c ?a:c):(b>c)?b:c);
		System.out.println("Max Number = "+Ans);
	}
}
