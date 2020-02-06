import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SeleniumTest {
    @Before
    public void setup() {
        Selenium.setup();
    }

    @Test
    public void searchByKeywordTest() {
        Selenium.searchByKeyword("Baranauskas");
    }

    @After
    public void close() {
        Selenium.close();
    }

}


//String searchResultCount = browser.findElement(By.className("sb_count")).getText();
//        String searchCount = searchResultCount.replaceAll("[ ,A-Za-z]+", "");
//
//        int count = Integer.parseInt(searchCount);
//
//        String message = "Rašytojas nelabai  populiarus internetinėse platybėse";
//        if (count >= 50000) {
//        message = searchResultCount + "\n" + "Džiaugiamės, jog  jaunimas dar neužmiršo Anykščių šilelio.";
//        }
//
//        System.out.println(message);