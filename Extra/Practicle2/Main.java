import java.util.Scanner;

class Number {
    int num1, num2;
    Number(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
}

class Add extends Number {
    Add(int num1, int num2) {
        super(num1, num2);
    }
    int add() {
        return num1 + num2;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number 1:");
        int n1 = sc.nextInt();
        System.out.print("Enter Number 2:");
        int n2 = sc.nextInt();
        Add addition = new Add(n1, n2);
        System.out.println("Sum: " + addition.add());
    }
}
