package Threads;

public class MultiThreads {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread1 :"  + i );
                try{
                    Thread.sleep(1000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread2 :"  + i );
                try{
                    Thread.sleep(1000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        });
        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();

        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("All threads have finished executed");
    }
}
