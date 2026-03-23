import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestExample {

    @Test
    public void testGoogle() throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        System.out.println("Title: " + driver.getTitle());

        Thread.sleep(5000); // wait 5 seconds

        driver.quit();
    }
}