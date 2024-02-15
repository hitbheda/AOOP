import java.util.Scanner;
public class Prime{
    public static void main(String[] arg){
        // Variable Declaration
        int count = 0;
        // Input From User
        Scanner newObj = new Scanner(System.in);
        System.out.print("Enter Number:");
        int n = newObj.nextInt();
        // Logic Of Prime Number
        for(int i = 2;i <= n; i++){
            count = 0;
            for(int j = 2;j <= i / 2; j++){

                if(i % j == 0){
                   count ++;
                   break;
                }

            }
            // OutPut
            if(count == 0){
                System.out.println(i);
            }
        }
    }
}