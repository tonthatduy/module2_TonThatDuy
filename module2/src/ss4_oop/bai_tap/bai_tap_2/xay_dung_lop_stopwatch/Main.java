package ss4_oop.bai_tap.bai_tap_2.xay_dung_lop_stopwatch;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        System.out.println("Chương trình đang chạy từ 1970: " + stopWatch.getStartTime() + " millisecond");
        Scanner scanner = new Scanner(System.in);
        System.out.println("\"EnTer\" Để kết thúc");
        scanner.nextLine();
        stopWatch.stop();
        System.out.println("Chương Trình Đã Dừng");
        System.out.println("Thời gian đã chạy được: " + stopWatch.getElapsedTime()/1000.0 + " second");
        System.out.println("Thời gian dừng chương trình: " + stopWatch.getEndTime());
    }
}



