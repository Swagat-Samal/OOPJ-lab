class EvenThread extends Thread {

    int arr[];

    EvenThread(int a[]) {
        arr = a;
    }

    public void run() {
        System.out.println("Even index elements:");
        for (int i = 0; i < arr.length; i = i + 2) {
            System.out.print(arr[i] + " ");
        }
    }
}

class OddThread extends Thread {

    int arr[];

    OddThread(int a[]) {
        arr = a;
    }

    public void run() {
        System.out.println("\nOdd index elements:");
        for (int i = 1; i < arr.length; i = i + 2) {
            System.out.print(arr[i] + " ");
        }
    }
}

public class EvenOddThread {

    public static void main(String[] args) {

        int a[] = {10, 20, 30, 40, 50, 60};

        EvenThread t1 = new EvenThread(a);
        OddThread t2 = new OddThread(a);

        try {
            t1.start();
            t1.join();
            t2.start();
        } catch (Exception e) {
        }
    }
}
