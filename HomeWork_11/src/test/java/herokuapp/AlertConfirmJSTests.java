package herokuapp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertConfirmJSTests extends BaseTest {
    @Test
    public void alertConfirmTestJS() {
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        WebElement alertButton = driver.findElement(By.xpath("//button[contains(text(),'JS Confirm')]"));

        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("return arguments[0].click()", alertButton);

        Alert alert = driver.switchTo().alert();
        alert.accept();

        String result = getResult();
        Assert.assertEquals(result, "You successfully clicked an alert");
    }

    private String getResult() {
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        return javascriptExecutor.executeScript("return document.getElementById('result').textContent").toString();
    }
}
