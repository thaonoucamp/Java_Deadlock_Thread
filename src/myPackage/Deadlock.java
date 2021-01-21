package myPackage;

public class Deadlock implements Runnable{
    public synchronized void test1() {
        System.out.println("test 1");
        test2();
    }

    public synchronized void test2() {
        System.out.println("test 2");
        test1();
    }

    @Override
    public void run() {
        test1();
    }

    public static void main(String[] args) {
        Deadlock d = new Deadlock();

        Thread t1 = new Thread(d);
        Thread t2 = new Thread(d);

        t1.start();
        t2.start();
    }
}
// bay chuot;

// Tranh deadlock;

// truy cap vao Ham ko thoat ra duoc;