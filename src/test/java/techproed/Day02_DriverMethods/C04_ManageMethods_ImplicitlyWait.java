package techproed.Day02_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_ManageMethods_ImplicitlyWait {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        /*
        implicitlyWait(Duration.ofSeconds(20)) Sayfadaki webElementleri gorunur olana kadar(sayfada olusana kadar)
        maximum 20saniye bekler. Eger webElementler 2 saniyede olusursa 2 saniye bekler ve alt satira gecer.Fakat
        belirttigimiz maximum sure boyunca internetten yada sayfadan kaynakli olarak webElementler olusmazsa testimiz
        fail verir
          Thread.sleep() java kodlarını bizim belirttiğimiz süre kadar bekler. 30 saniye beklemesini belirtirsem
         30 saniye bekler ve alt satıra geçer.
         */
             //techproed sayfasina gidelim
        //amazona gidelim
        //techpro sayfasina geri donelim
        //sayfa basliginin techpro icerdigini test edelim
        //tekrar amazon sayfasina gidelim
        //sayfa basliginin Amazon icerdigini test edelim

    }
}
