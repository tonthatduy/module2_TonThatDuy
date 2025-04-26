package ss19_string_regex.bai_tap.bai_tap_3.crawl_tin_tuc;

import javax.imageio.IIOException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Crawl {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://dantri.com.vn/the-gioi.htm");
            Scanner scanner = new Scanner(new InputStreamReader(url.openStream()));
            scanner.useDelimiter("\\Z");
            String content = scanner.next();
            scanner.close();
            content = content.replaceAll("\\n+", "");
            Pattern pattern = Pattern.compile("class=\"title\"[^>]*>(.*?)</a>");
            Matcher matcher = pattern.matcher(content);
            while (matcher.find()) {
                System.out.println(matcher.group(1));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
