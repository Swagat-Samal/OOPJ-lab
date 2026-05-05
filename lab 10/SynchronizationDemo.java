class Display {

    synchronized void print(String msg) {
        String[] words = msg.split(" ");
        for (String w : words) {
            System.out.println(Thread.currentThread().getName() + ": " + w);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Interrupted");
            }
        }
    }
}

class MyThread extends Thread {

    Display d;
    String message;

    MyThread(Display d, String message, String name) {
        super(name);
        this.d = d;
        this.message = message;
    }

    public void run() {
        d.print(message);
    }
}

public class SynchronizationDemo {

    public static void main(String[] args) {

        Display obj = new Display();

        MyThread t1 = new MyThread(obj, "I Love java Very Much", "Thread 1");
        MyThread t2 = new MyThread(obj, "I Love java Very Much", "Thread 2");

        t1.start();
        t2.start();
    }
}
