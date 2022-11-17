package MultithreadingPractice;
import java.util.LinkedList;

public class ProducerConsumer{
    public static void main(String[] args)
            throws InterruptedException
    {
        // Object of a class that has both produce()
        // and consume() methods
        final PC pc = new PC();

        // Create producer thread
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run()
            {
                try {
                    pc.produce("t1");
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Create consumer thread
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run()
            {
                try {
                    pc.consume("t2");
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    pc.produce("t3");
                }
                catch (InterruptedException ex){
                    System.out.println(ex.getMessage());
                }
            }
        });

        // Start both threads
        t1.start();
        t2.start();
        t3.start();

        // t1 finishes before t2
        t1.join();
        t2.join();
        t3.join();
    }

    // This class has a list, producer (adds items to list
    // and consumer (removes items).
    public static class PC {

        // Create a list shared by producer and consumer
        // Size of list is 2.
        LinkedList<Integer> list = new LinkedList<>();
        int capacity = 10;

        // Function called by producer thread
        public void produce(String name) throws InterruptedException
        {
            int value = 0;
            while (true) {
                synchronized (this)
                {
                    // producer thread waits while list
                    // is full
                    while (list.size() == capacity)
                        wait();

                    System.out.println("Producer " + name + " produced-"
                            + value);

                    // to insert the jobs in the list
                    list.add(value++);

                    // notifies the consumer thread that
                    // now it can start consuming
                    notify();

                    // makes the working of program easier
                    // to  understand
                    Thread.sleep(500);
                }
            }
        }

        // Function called by consumer thread
        public void consume(String name) throws InterruptedException
        {
            while (true) {
                synchronized (this)
                {
                    // consumer thread waits while list
                    // is empty
                    while (list.size() == 0)
                        wait();

                    // to retrieve the first job in the list
                    int val = list.removeFirst();

                    System.out.println("Consumer " + name + " consumed-" + val);

                    // Wake up producer thread
                    notify();

                    // and sleep
                    Thread.sleep(500);
                }
            }
        }
    }
}