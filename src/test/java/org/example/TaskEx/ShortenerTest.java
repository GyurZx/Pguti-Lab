package org.example.TaskEx;

// import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.regex.*;
import static org.junit.jupiter.api.Assertions.*;

class ShortenerTest {

    ShortenerTask1 shortener = new ShortenerTask1();

    @BeforeEach
    void setUp() {
    }
    // короче тут доделать, а то нихера не получается
    @Test
    public void test_two_different_URLs() {
        String shortURL1 = shortener.urlShortener("https://www.codewars.com/kata/5ef9ca8b76be6d001d5elc3e");
        assertTrue(testFormat(shortURL1), "Wrong string format!");
        String shortURL2 = shortener.urlShortener("https://www.codewars.com/kata/5efae11e2d12df00331f91a6");
        assertTrue(testFormat(shortURL2), "Wrong string format!");
        assertEquals("https://www.codewars.com/kata/5ef9ca8b76be6d001d5elc3e", shortener.urlRedirector(shortURL1));
        assertEquals("https://www.codewars.com/kata/5efae11e2d12df00331f91a6", shortener.urlRedirector(shortURL2));
    }
    @Test
    public void test_same_URLs() {
        String shortURL1 = shortener.urlShortener("https://www.codewars.com/kata/5ef9c85dc41b4e000f9a645f");
        assertTrue(testFormat(shortURL1), "Wrong string format!");
        String shortURL2 = shortener.urlShortener("https://www.codewars.com/kata/5ef9c85dc41b4e000f9a645f");
        assertTrue(testFormat(shortURL2), "Wrong string format!");
        assertEquals("Shood work with same URLs", shortURL1, shortURL2);
        assertEquals("https://www.codewars.com/kata/5efae11e2d12df00331f91a6", shortener.urlRedirector(shortURL1));
    }

    public static boolean testFormat(String string) {
        return Pattern.matches("^short.ly\\/[a-z]{1,4}$", string);
    }
}