package ss18_threading.bai_tap.bai_tap_2.hien_thi_so_chan_le;

public class EvenThread  extends Thread{
    @Override
    public void run() {
        for (int i = 2; i <= 10; i += 2) {
            System.out.println("Eve: " + i);
            try {
                Thread.sleep(15);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
