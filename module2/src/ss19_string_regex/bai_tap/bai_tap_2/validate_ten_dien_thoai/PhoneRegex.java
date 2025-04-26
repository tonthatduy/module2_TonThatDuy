package ss19_string_regex.bai_tap.bai_tap_2.validate_ten_dien_thoai;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneRegex {
    private static final String PHONE_REGEX = "\\(\\d{2}\\)-\\(0\\d{9}\\)";

    public PhoneRegex() {
    }

    public boolean validatePhone(String string) {
        Pattern pattern = Pattern.compile(PHONE_REGEX);
        Matcher matcher = pattern.matcher(string);
        return matcher.matches();

    }
}
