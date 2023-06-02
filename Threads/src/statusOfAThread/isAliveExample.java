package statusOfAThread;

public class isAliveExample extends Thread{
    @Override
    public void run() {
        for (int i=1;i<=4;i++)
        {
            System.out.println("Status: " + isAlive());
        }
        System.out.println("Thread 1 exits");
    }

    public static void main(String[] args) {
        joinExample c = new joinExample();
        c.start();
        System.out.println("Now status after alive function : " + c.isAlive());
    }
}
