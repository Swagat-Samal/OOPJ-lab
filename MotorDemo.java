interface Motor {
    int capacity = 5;
    void run();
    void consume();
}

class WashingMachine implements Motor {

    public void run() {
        System.out.println("Washing Machine is running");
    }

    public void consume() {
        System.out.println("Washing Machine is consuming power");
    }

    void displayCapacity() {
        System.out.println("Capacity of the motor is " + capacity);
    }
}

public class MotorDemo {
    public static void main(String[] args) {

        WashingMachine wm = new WashingMachine();
        wm.run();
        wm.consume();
        wm.displayCapacity();
    }
}
