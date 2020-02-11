import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selenium {
    static WebDriver browser;

    private static final int SECONDS = 2;

    public static void setup(){
        System.setProperty("webdriver.chrome.driver", "webDrivers/chromedriver.exe");
        browser = new ChromeDriver();

        browser.get("https://wwww.bing.com");
    }

    public static void close() {

        browser.close();
    }

    public static void searchByKeyword(String keyword) {
        WebElement searchField = browser.findElement(By.id("sb_form_q"));
        searchField.sendKeys(keyword);
        searchField.sendKeys(Keys.ENTER);
    }

    public static void main(String[] args) {

        System.out.println("Selenium Maven TestNG");
    }

    private static void waitForElementById(WebDriver browser, String id) {
        WebDriverWait webDriverWait = new WebDriverWait(browser, SECONDS);
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.id(id)));
    }
}
