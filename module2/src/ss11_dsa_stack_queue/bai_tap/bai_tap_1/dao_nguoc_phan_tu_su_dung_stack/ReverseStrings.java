package ss11_dsa_stack_queue.bai_tap.bai_tap_1.dao_nguoc_phan_tu_su_dung_stack;

import java.util.Stack;

public class ReverseStrings {
    public static String ReverseString(String input) {
        Stack<String> wStack = new Stack<>();
        String[] words = input.trim().split(" ");
        for (String mWord : words) {
            wStack.push(mWord);
        }
        String reverse = "";
        for (int i = 0; i < words.length; i++) {
            reverse += wStack.pop();
            if (!wStack.isEmpty()) {
                reverse += " ";
            }

        }
        return reverse;
    }
}
