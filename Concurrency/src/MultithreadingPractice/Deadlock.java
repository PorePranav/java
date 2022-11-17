package MultithreadingPractice;

public class Deadlock {
    private static final Object lock1 = new Object();
    private static final Object lock2 = new Object();

    private static class Thread1 extends Thread{
        @Override
        public void run() {
            synchronized (lock1){
                System.out.println("Thread1 acquired lock1");

                try{
                    Thread.sleep(100);
                }
                catch (InterruptedException ex){
                    System.out.println(ex.getMessage());
                }

                synchronized (lock2){
                    System.out.println("Thread1 acquired lock1 and lock2");
                }

                System.out.println("Thread1 released lock2");
            }
            System.out.println("Thread1 released lock1");
        }
    }

    private static class Thread2 extends Thread{
        @Override
        public void run(){
            synchronized (lock2){
                System.out.println("Thread2 acquired lock2");

                try{
                    Thread.sleep(100);
                }
                catch (InterruptedException ex){
                    System.out.println(ex.getMessage());
                }

                synchronized (lock1){
                    System.out.println("Thread2 acquired lock1 and lock2");
                }

                System.out.println("Thread2 released lock1");
            }
            System.out.println("Thread2 released lock2");
        }
    }

    public static void main(String[] args) {
        new Thread1().start();
        new Thread2().start();
    }


}
