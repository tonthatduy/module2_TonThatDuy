package ss19_string_regex.thuc_hanh;

public class Demo {
    public static void main(String[] args) {
        String name = "Tôn Thất Duy";
        String regexName = "^([A-Z][a-z]*)\\s([A-Z][a-z]*\\s)*([A-Z][a-z]*)$";
        String regexName1 = "^([A-Z][a-z]*)(\\s[A-Z][a-z]*)?(\\s[A-Z][a-z]*)+$";
        boolean check = name.matches(regexName);
    }
}
