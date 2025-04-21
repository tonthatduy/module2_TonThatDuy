package ss11_dsa_stack_queue.bai_tap.bai_tap_3.kiem_tra_chuoi_palindrome_su_dung_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class CheckPalindrome {
    public static boolean isPalindrome(String input) {
        String[] string = input.trim().toLowerCase().split("");
        Stack<String> stringStack = new Stack<>();
        Queue<String> stringQueue = new LinkedList<>();
        for (String s : string) {
            stringStack.push(s);
            stringQueue.add(s);
        }
        while (!stringQueue.isEmpty()) {
            if (!stringQueue.poll().equals(stringStack.pop())) {
                return false;
            }

        }
        return true;
    }
}
