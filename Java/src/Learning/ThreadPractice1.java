package Learning;

class MyThread extends Thread {
    public void run() {
        int i = 1;
        while (true) {
            System.out.println(i + " Hello");
            i++;
        }
    }
}

public class ThreadPractice1 {
    public static void main(String[] args) {
        // Thread using extends
        MyThread t = new MyThread();
        t.start();

        int i = 1;
        while (true) {
            System.out.println(i + " World");
            i++;
        }
    }
}
