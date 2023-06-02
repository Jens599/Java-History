package ThreadPriority;

public class priorityTest extends Thread{
    @Override
    public void run() {
        System.out.println("Running thread name: " + Thread.currentThread().getName());
        System.out.println("Running thread priority: " + Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {
        priorityTest o1 = new priorityTest();
        priorityTest o2 = new priorityTest();
        priorityTest o3 = new priorityTest();
        o1.setPriority(Thread.MIN_PRIORITY);
        o2.setPriority(Thread.MAX_PRIORITY);
        o1.start();
        o2.start();
        o3.start();
    }
}
