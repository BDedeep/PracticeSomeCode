package Threads;

//class A implements Runnable {
//    public void run(){
//        for(int  i = 0; i <= 5;i++){
//            System.out.println("Hi");
//            try {
//                Thread.sleep(10);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }
//}

//class B implements Runnable {
//    public void run(){
//        for(int  i = 0; i <= 5;i++){
//            System.out.println("Hello");
//        }
//    }
//}
public class SampleThreads {
    public static void main(String[] args) {
        Runnable obj1 = () -> {
                for (int i = 0; i <= 5; i++) {
                    System.out.println("Hi");
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {e.printStackTrace();
                    }
                }
        };
        Runnable obj2 = () -> {
            for (int i = 0; i <= 5; i++) {
                System.out.println("Hellow");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {e.printStackTrace();
                }
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
}
