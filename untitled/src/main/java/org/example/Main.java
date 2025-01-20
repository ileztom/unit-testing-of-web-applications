import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public static void main(String[] args) {
    WebDriver driver = new ChromeDriver();
    System.setProperty("webdriver.chrome.driver", "C:/Users/Admin/Downloads/модульное тестирование веб-приложений/chromedriver-win64/chromedriver-win64/chromedriver.exe");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.get("https://ya.ru");
}