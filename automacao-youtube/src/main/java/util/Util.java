package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Util {

    private static final int TIMEOUT = 15;

    // Agora é PUBLIC e STATIC → acessível de qualquer lugar
    public static WebDriver getDriver() {
        return DriverFactory.getDriver();
    }

    public static void openWeb(String url) {
        getDriver().get(url);
    }

    public static void insertTextElement(WebElement element, String texto) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(TIMEOUT));

        wait.until(ExpectedConditions.visibilityOf(element));
        element.clear();
        element.sendKeys(texto);
    }

    public static void clickElement(WebElement element) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(TIMEOUT));

        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }

    public static void selectElementValue(WebElement element, String valor) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(TIMEOUT));

        wait.until(ExpectedConditions.visibilityOf(element));

        Select select = new Select(element);
        select.selectByValue(valor);
    }

    public static boolean validateElementText(WebElement element, String expectedText) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(TIMEOUT));

        try {
            wait.until(ExpectedConditions.visibilityOf(element));
            return element.getText().equals(expectedText);
        } catch (Exception e) {
            return false;
        }
    }
}
