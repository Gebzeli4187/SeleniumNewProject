package techproed.Day02_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_DriverMethods_ClassWork {
    public static void main(String[] args) {
        System.setProperty("chromeDriver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //Amazon sayfasına gidelim
        driver.get("https://www.amazon.com");
        //Sayfa başlığının Amazon içerdiğini test edelim
        String actualTitle= driver.getTitle();
        String expectedTitle="Amazon";
        if (actualTitle.contains(expectedTitle)){
            System.out.println("Tested PASSED");
        }else System.out.println("Tested FAIL");
        //Url'in https://www.amazon.com olduğunu test edelim
           String actualUrl= driver.getCurrentUrl();
           String expectedUrl= "https://www.amazon.com/";
           if (actualUrl.equals(expectedUrl)){
               System.out.println("Tested PASSED");
           }else System.out.println("Tested FAIL" +actualUrl);
               //Sayfayı kapatalım

        driver.close(); // Browser'ı kapatır
        // driver.quit() -> birden fazla browser varsa hepsini kapatır.


    }
}
