package ss18_threading.bai_tap.bai_tap_1.thread_don_gian;

public class NumberGenerator implements Runnable {

    public NumberGenerator() {
    }

    @Override
    public void run() {
        int hash = this.hashCode();
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() +
                    " | hashCode: " + hash +
                    " | number: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread bị gián đoạn");
            }
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new NumberGenerator(), "Thread-1");
        Thread t2 = new Thread(new NumberGenerator(), "Thread-2");

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
    }
}
