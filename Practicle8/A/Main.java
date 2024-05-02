class Thread1 extends Thread{
    public void run(){
        try{
            for(int i = 0; i < 2; i++){
                System.out.println("This Is Thread 1");
                Thread.sleep(1000);
            }
        }catch(Exception e){
            System.out.println("Error While Copiling :"+e);
        }
    }
}

class Thread2 extends Thread{
    public void run(){
        try{
            for(int i = 0; i < 2; i++){
                System.out.println("This Is Thread 2");
                Thread.sleep(2000);
            }
        }catch(Exception e){
            System.out.println("Error While Copiling :"+e);
        }
    }
}

class Main{
    public static void main(String[] args) {
        Thread1 th1 = new Thread1();
        Thread2 th2 = new Thread2();
        th1.start();
        th2.start();
    }
}