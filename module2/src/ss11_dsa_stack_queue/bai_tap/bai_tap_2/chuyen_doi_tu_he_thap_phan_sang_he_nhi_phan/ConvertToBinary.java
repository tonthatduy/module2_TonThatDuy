package ss11_dsa_stack_queue.bai_tap.bai_tap_2.chuyen_doi_tu_he_thap_phan_sang_he_nhi_phan;

import java.util.Scanner;
import java.util.Stack;

public class ConvertToBinary {
    public static String Convert(int input) {
        Stack<Integer> integers = new Stack<>();
        String result = "";
        while (input > 0) {
            int numberStack = input % 2;
            integers.push(numberStack);
            input = input / 2;
        }
        while (!integers.isEmpty()) {
            result += integers.pop();
        }
        return result;
    }
}
