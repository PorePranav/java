package ProducerConsumer;
import java.util.LinkedList;

public class ProducerConsumer{
    public static void main(String[] args) throws InterruptedException {
        final PC pc = new PC();

        Thread t1 = new Thread(new ProducerRunnable(pc));
        Thread t2 = new Thread(new ConsumerRunnable(pc));

        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }

    static class ProducerRunnable implements Runnable{
        PC pc;

        public ProducerRunnable(PC pc){
            this.pc = pc;
        }

        @Override
        public void run() {
            try{
                pc.produce();
            }
            catch (InterruptedException ex){
                System.out.println(ex.getMessage());
            }
        }
    }

    static class ConsumerRunnable implements Runnable{
        PC pc;

        public ConsumerRunnable(PC pc){
            this.pc = pc;
        }

        @Override
        public void run(){
            try{
                pc.consume();
            }
            catch (InterruptedException ex){
                System.out.println(ex.getMessage());
            }
        }
    }
    public static class PC{
        LinkedList<Integer> list = new LinkedList<>();
        int capacity = 2;

        public void produce() throws InterruptedException{
            int value = 0;
            while(true){
                synchronized(this){
                    while(list.size() == capacity)
                        wait();
                    System.out.println("Producer produced " + value);
                    list.add(value++);
                    notify();
                    Thread.sleep(500);
                }
            }
        }

        public void consume() throws InterruptedException {
            while(true){
                synchronized(this){
                    while(list.size() == 0)
                        wait();
                    int value = list.removeFirst();
                    System.out.println("Consumer consumed " + value);
                    notify();
                    Thread.sleep(500);
                }
            }
        }
    }
}