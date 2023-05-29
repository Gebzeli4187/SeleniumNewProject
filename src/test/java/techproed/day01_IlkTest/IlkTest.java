package techproed.day01_IlkTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IlkTest {
    public static void main(String[] args) {
        System.setProperty("chromeDriver","src/resources/drivers/chromedriver.exe");
        // Java uygulamalarında system özelliklerini ayarlamak icin bu methodu kullaniriz.
        System.out.println(System.getProperty("chromeDriver"));
        WebDriver driver = new ChromeDriver();
        driver.get("https://techproeducation.com");
    }
}
