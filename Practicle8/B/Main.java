class Thread1 extends Thread{
    public void run(){
        try {
            for(int i = 0;i <= 200; i++){
                if(i%2 != 0){
                    System.out.println("Odd Number:"+i+" ");
                    // System.out.println(i+" ");
                }
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println("Error While Compiling "+e);
        }
    }
}

class Thread2 extends Thread{
    public void run(){
        try {
            // System.out.println("Printing Even Number:");
            for(int i = 0;i <= 200; i++){
                if(i%2 == 0){
                    System.out.println("Even Number:"+i+" ");
                    // System.out.println(i+" ");
                }
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println("Error While Compiling "+e);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Thread1 th1 = new Thread1();
        Thread2 th2 = new Thread2();
        th1.start();
        th2.start();
    }
}