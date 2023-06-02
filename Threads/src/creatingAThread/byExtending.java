package creatingAThread;

public class byExtending extends Thread {
    public void run() {
        System.out.println("Thread is running");
    }

    public static void main(String[] args) throws InterruptedException {
        byExtending b = new byExtending();
        b.start();
    }
}
