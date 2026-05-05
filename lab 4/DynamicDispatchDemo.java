class Apple {
    void show() {
        System.out.println("This is Apple class show() method");
    }
}

class Banana extends Apple {
    void show() {
        System.out.println("This is Banana class show() method");
    }
}

class Cherry extends Apple {
    void show() {
        System.out.println("This is Cherry class show() method");
    }
}

public class DynamicDispatchDemo {
    public static void main(String[] args) {

        Apple obj;  
        obj = new Apple();
        obj.show();

        obj = new Banana();
        obj.show();

        obj = new Cherry();
        obj.show();
    }
}
