import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class WebScrapper {
    /**
     * Retrieve contents from a URL and return them as a string.
     *
     * @param url url to retrieve contents from
     * @return the contents from the url as a string, or an empty string on error
     */
    public static String urlToString(final String url) {
        Scanner urlScanner;
        try {
            urlScanner = new Scanner(new URL(url).openStream(), "UTF-8");
        } catch (IOException e) {
            return "";
        }
        String contents = urlScanner.useDelimiter("\\A").next().trim();
        urlScanner.close();
        return contents;
    }

    public static void main(String[] unused) {
        String script = urlToString("http://erdani.com/tdpl/hamlet.txt");
        String[] arrayScript = script.split("\\s+");
        String keyword = "Prince";
        String keyword2 = keyword.toUpperCase();
        String keyword3 = keyword.toLowerCase();
        int count = 0;
        for (int i = 0; i < arrayScript.length; i++)
            if (arrayScript[i].equals(keyword) || arrayScript[1].equals(keyword2) || arrayScript[1].equals(keyword3)); {
                count += 1;
        }
        int length = arrayScript.length;
        System.out.println ("length" + " " + length);
        System.out.println ("word" + " " + count);

    }
}
