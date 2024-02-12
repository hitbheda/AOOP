import java.util.Scanner;
class Matrix1 {
    public static void main(String[] args){
        Scanner newObj = new Scanner(System.in);
         int[][] m1 =new int[3][3];
         int[][] m2 =new int[3][3];
         int[][] sum =new int[3][3];

         System.out.println("Enter Data Of M1");
         for(int i=0;i<3;i++){
              for(int j=0;j<3;j++){
                  System.out.print("Enter "+i+" "+j+":");
                  m1[i][j] = newObj.nextInt();
              }
         }
        System.out.println("Enter Data Of M2");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print("Enter "+i+" "+j+":");
                m2[i][j] = newObj.nextInt();
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                sum[i][j] = m1[i][j] + m2[i][j];
            }
        }

        for(int i=0;i<3;i++){
            for(int j =0;j<3;j++){
                System.out.print(sum[i][j]);
            }
            System.out.print('\n');
        }
    }
}