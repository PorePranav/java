package Counter;

public class Main{
    public static void main(String[] args) {
        Countdown countdown = new Countdown();

        CountdownThread thread1 = new CountdownThread(countdown);
        thread1.setName("Thread 1");

        CountdownThread thread2 = new CountdownThread(countdown);
        thread2.setName("Thread 2");

        thread1.start();
        thread2.start();

    }
}

class Countdown{
    int i;
    public void doCountdown(){
        String color = switch (Thread.currentThread().getName()) {
            case "Thread 1" -> ThreadColor.ANSI_CYAN;
            case "Thread 2" -> ThreadColor.ANSI_PURPLE;
            default -> ThreadColor.ANSI_GREEN;
        };

        synchronized (this) {
            for (i = 10; i > 0; i--) {
                System.out.println(color + Thread.currentThread().getName() + ": i=" + i);
            }
        }
    }
}

class CountdownThread extends Thread{
    private final Countdown threadCountdown;

    public CountdownThread(Countdown threadCountdown){
        this.threadCountdown = threadCountdown;
    }

    @Override
    public void run(){
        threadCountdown.doCountdown();
    }
}