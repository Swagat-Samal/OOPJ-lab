class SubstringThread extends Thread {

    String str;

    SubstringThread(String s) {
        str = s;
    }

    public void run() {

        try {
            for (int i = 1; i < str.length(); i++) {
                System.out.println(str.substring(0, i));
                Thread.sleep(500);
            }
        } catch (Exception e) {
        }
    }
}

class ReverseThread extends Thread {

    String arr[];

    ReverseThread(String a[]) {
        arr = a;
    }

    public void run() {

        try {
            for (int i = 0; i < arr.length; i++) {

                String rev = "";

                for (int j = arr[i].length() - 1; j >= 0; j--) {
                    rev = rev + arr[i].charAt(j);
                }

                System.out.println(rev);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
        }
    }
}

public class StringThreadExp {

    public static void main(String[] args) {

        String str = "KIIT";
        String arr[] = {"KIIT", "CSE", "IT", "CSSE", "CSCE"};

        SubstringThread t1 = new SubstringThread(str);
        ReverseThread t2 = new ReverseThread(arr);

        t1.start();
        t2.start();
    }
}