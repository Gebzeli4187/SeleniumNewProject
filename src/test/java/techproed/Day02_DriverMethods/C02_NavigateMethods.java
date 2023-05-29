package techproed.Day02_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_NavigateMethods {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("chromeDriver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // Techproeducation sayfasina gidelim.
        driver.navigate().to("https://techproeducation.com");
        Thread.sleep(3000);
        // Sonra Amazon sayfasina gidelim
        driver.navigate().to("https://amazon.com");
        Thread.sleep(3000);
        // Amazon sayfasinin basligini yazdiralim
        System.out.println("Sayfa Basligi = " + driver.getTitle());
        // Techproeducation sayfasina geri donelim
        driver.navigate().back();
        Thread.sleep(3000);
        // Sayfa basligini yazdiralim
        System.out.println("Techpro Sayfa basligi = " + driver.getTitle());
        // Amazon sayfasina tekrar gidip url'i yazdiralim
        driver.navigate().forward();
        Thread.sleep(3000);
        // Amazon sayfasindayken sayfayi yenileyelim.
        driver.navigate().refresh();
        Thread.sleep(3000);

    }
}
