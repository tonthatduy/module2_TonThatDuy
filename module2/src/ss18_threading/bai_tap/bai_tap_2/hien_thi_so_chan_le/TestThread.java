package ss18_threading.bai_tap.bai_tap_2.hien_thi_so_chan_le;

public class TestThread {
    public static void main(String[] args) {
        OddThread oddThread = new OddThread();
        EvenThread evenThread = new EvenThread();
        oddThread.start();
        try {
            oddThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        evenThread.start();
    }
}

