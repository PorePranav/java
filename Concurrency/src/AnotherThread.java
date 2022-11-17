public class AnotherThread extends Thread{
    @Override
    public void run() {
        System.out.println(ThreadColor.ANSI_BLUE + "Hello from " + getName());
        try{
            Thread.sleep(5000);
        }
        catch (InterruptedException ex){
            System.out.println(ThreadColor.ANSI_BLUE + "Another thread woke me up");
            return;
        }

        System.out.println(ThreadColor.ANSI_BLUE + "3 seconds have passed and I am awake again");
    }
}
