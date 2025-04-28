package ss13_thuat_toan_tim_kiem.bai_tap.bai_tap_1.tim_chuoi_tang_dan_co_do_dai_lon_nhat;

public class CheckString {
    public static boolean checkString(String string) {
        if (string == null || string.isEmpty()) {
            return false;
        }
        return true;
    }

    public static String checkCharacterOfString(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < stringBuilder.length(); i++) {
            char c = stringBuilder.charAt(i);
            if (Character.isLetter(c)) {
                stringBuilder.append(c);
            }
        }
        return stringBuilder.toString();
    }

}
