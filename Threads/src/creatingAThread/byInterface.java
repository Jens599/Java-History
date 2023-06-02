package creatingAThread;

public class byInterface implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread is running");
    }

    public static void main(String[] args) {
        byInterface i = new byInterface();
        Thread t = new Thread(i);
        t.start();
    }
}
