class Thread1 extends Thread{
    public void run(){
        try {
            for(int i = 1;i <= 200; i++){
                if(i%2 != 0){
                    System.out.println("Odd Number:"+i+" ");
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
            for(int i = 1;i <= 200; i++){
                if(i%2 == 0){
                    System.out.println("Even Number:"+i+" ");
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