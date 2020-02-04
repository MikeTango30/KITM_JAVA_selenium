import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selenium {

    private static final int SECONDS = 2;

    public static void main(String[] args) {
        System.out.println("Selenium TEST");

        System.setProperty("webdriver.chrome.driver", "webDrivers/chromedriver.exe");
        WebDriver browser = new ChromeDriver();

        browser.get("https://wwww.bing.com");

        WebElement searchField = browser.findElement(By.id("sb_form_q"));
        searchField.sendKeys("Baranauskas");
        searchField.sendKeys(Keys.ENTER);

        String searchResultCount = browser.findElement(By.className("sb_count")).getText();
        String searchCount = searchResultCount.replaceAll("[ ,A-Za-z]+", "");

        int count = Integer.parseInt(searchCount);

        String message = "Rašytojas nelabai  populiarus internetinėse platybėse";
        if (count >= 50000) {
            message = searchResultCount + "\n" + "Džiaugiamės, jog  jaunimas dar neužmiršo Anykščių šilelio.";
        }

        System.out.println(message);

        browser.close();

    }

    private static void waitForElementById(WebDriver browser, String id) {
        WebDriverWait webDriverWait = new WebDriverWait(browser, SECONDS);
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.id(id)));
    }
}
