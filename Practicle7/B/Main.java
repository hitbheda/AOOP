import java.util.Scanner;
class Myexception extends Exception{
    private int ex;
        Myexception(int balance){
        ex = balance;
    }
public String toString(){
return "Insufficient balanceance!!";
    }
}
class Main{
    static int divide(int balance, int amount) throws Myexception{
        if (balance > amount){
            throw new Myexception(balance);
        }
        else{
            return (balance = balance - amount);
        }
}

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int balance=25000;
        while(balance >= 0){
            System.out.println("\nAccount balanceance : " + balance+"\n");
            if(balance==0){
                break;
            }
            System.out.print("Enter Withdrawal Amount : ");
            int amount = sc.nextInt();
            try{
                balance=divide(balance, amount);
            }
            catch (Myexception me){
                System.out.println("\n"+me);
            }
        }
        }
}