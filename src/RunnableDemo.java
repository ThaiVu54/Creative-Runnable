public class RunnableDemo implements Runnable{
    private String name;

    public RunnableDemo(String name) {
        this.name = name;
        System.out.println("creating " + name);
    }

    public RunnableDemo() {
    }

    @Override
    public void run() {
       try {
           for (int i = 4; i > 0; i--) {
               System.out.println("thread: "+name+", "+i);
               Thread.sleep(50);
           }
       } catch (InterruptedException e) {
           System.out.println("Thread \" + Name + \" interrupted.");
       }
        System.out.println("Thread " + name + " exiting.");
    }

    public static void main(String[] args) {
        Runnable runnable1 = new RunnableDemo("Thread-1-HR-Database");
        Runnable runnable2 = new RunnableDemo("Thread-2-HR-Database");
        Thread th1 = new Thread(runnable1);
        Thread th2 = new Thread(runnable2);
        th1.start();
        th2.start();
    }
}
