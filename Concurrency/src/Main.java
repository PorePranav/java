public class Main {
    public static void main(String[] args) {
        System.out.println(ThreadColor.ANSI_PURPLE + "Hello from main thread");

        Thread anotherThread = new AnotherThread();
        anotherThread.setName("==Another Thread==");
        anotherThread.start();

//        new Thread(){
//            @Override
//            public void run(){
//                System.out.println(ThreadColor.ANSI_GREEN + "Hello from anonymousClass");
//            }
//        }.start();

        Thread myRunnableThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(ThreadColor.ANSI_RED + "Hello from anonymousRunnable implementation of run()");
                try {
                    anotherThread.join();
                    System.out.println(ThreadColor.ANSI_RED + "anotherThread terminated, running anonymousThread again.");
                } catch (InterruptedException ex) {
                    System.out.println(ThreadColor.ANSI_RED + "I couldn't wait after all. I was interrupted.");
                }
            }
        });
        myRunnableThread.start();

        //anotherThread.interrupt();

        System.out.println(ThreadColor.ANSI_PURPLE + "Hello again from the main thread");
    }
}
