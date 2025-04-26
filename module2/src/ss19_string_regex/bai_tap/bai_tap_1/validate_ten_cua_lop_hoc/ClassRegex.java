package ss19_string_regex.bai_tap.bai_tap_1.validate_ten_cua_lop_hoc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassRegex {

    private static final String NAME_CLASS_REGEX = "^[APC]\\d{4}[GHIK]";

    public ClassRegex() {
    }

    public boolean validateClass(String regex) {
        Pattern pattern = Pattern.compile(NAME_CLASS_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
