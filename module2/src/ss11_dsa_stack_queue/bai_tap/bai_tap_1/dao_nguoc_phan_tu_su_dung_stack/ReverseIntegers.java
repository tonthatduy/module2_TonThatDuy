package ss11_dsa_stack_queue.bai_tap.bai_tap_1.dao_nguoc_phan_tu_su_dung_stack;

import java.util.Stack;

public class ReverseIntegers {
    public static void ReverseArray(int[] arr) {
        Stack<Integer> integers = new Stack<>();
        for (int num : arr) {
            integers.push(num);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = integers.pop();
        }
    }

}
