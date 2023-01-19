import org.example.ShortTitle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShortTitleTest {

    @Test
    public void getShortTitleShouldReturnPositiveResult() {
        String sourceTitle = "Это тестовая строка, воспроизводящая главную идею";
        int maxLength = 17;
        String expected = "Это тестовая...";
        assertEquals(expected, ShortTitle.getShortTitle(sourceTitle, maxLength));
    }

    @Test
    public void getShortTitleShouldReturnSameString() {
        String sourceTitle = "Hello";
        int maxLength = 15;
        String expected = "Hello";
        assertEquals(expected, ShortTitle.getShortTitle(sourceTitle, maxLength));
    }

    @Test
    public void getShortTitleShouldReturnEmptyString() {
        String sourceTitle = "Hello";
        int maxLength = 1;
        String expected = "";
        assertEquals(expected, ShortTitle.getShortTitle(sourceTitle, maxLength));
    }

    @Test
    public void getShortTitleInputIsEmptyStringShouldReturnEmptyString() {
        String sourceTitle = "";
        int maxLength = 15;
        String expected = "";
        assertEquals(expected, ShortTitle.getShortTitle(sourceTitle, maxLength));
    }

    @Test
    public void getShortTitleShouldReturnEmptyIfLengthIsNegative(){
        String sourceTitle = "ASdsd sddsvds sd";
        int maxLength = -4;
        String expected = "";
        assertEquals(expected, ShortTitle.getShortTitle(sourceTitle, maxLength));
    }
}
