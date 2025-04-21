package ss11_dsa_stack_queue.bai_tap.bai_tap_1.dao_nguoc_phan_tu_su_dung_stack;

public class Main {
    public static void main(String[] args) {

        // Đảo ngược mảng cho trước
        int[] numbers = {1, 2, 3, 4, 5,};
        System.out.println("Mảng ban đầu");
        for (int n : numbers) {
            System.out.print(n + " ");
        }
        ReverseIntegers.ReverseArray(numbers);
        System.out.println();
        System.out.println("Mảng sau khi đảo ngược");
        for (int n : numbers) {
            System.out.print(n + " ");
        }
        System.out.println();

        // Đảo ngược chuỗi
        String strings = "Hello CodeGym";
        System.out.println("Chuỗi bắt đầu: " + strings);
        String reverseString = ReverseStrings.ReverseString(strings);
        System.out.println("Chuỗi sau khi đảo: " + reverseString);

    }

}
