public class Deadlock {
    public static Object lock1 = new Object();
    public static Object lock2 = new Object();

    public static void main(String[] args) {
        Thread1 runnable1 = new Thread1();
        Thread2 runnable2 = new Thread2();

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);

        thread1.start();
        thread2.start();
    }

}

class Thread1 implements Runnable{
    @Override
    public void run(){
        synchronized (Deadlock.lock1){
            System.out.println("Thread1 acquired lock1");
            System.out.println("Thread1 attempting to acquire lock2");

            synchronized (Deadlock.lock2){
                System.out.println("Acquired lock2");
            }
        }
    }
}

class Thread2 implements Runnable{
    @Override
    public void run(){
        synchronized (Deadlock.lock2){
            System.out.println("Thread2 acquired lock2");
            System.out.println("Thread2 attempting to acquire lock1");

            synchronized (Deadlock.lock1){
                System.out.println("Acquired lock1");
            }
        }
    }
}
