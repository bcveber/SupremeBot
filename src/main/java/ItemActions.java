import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import static org.openqa.selenium.By.xpath;

class ItemActions {

    static void getItem(Item item, WebDriver webDriver) {
        webDriver.findElement(xpath("//*[contains(text(), '" + item.getKeywords() + "')]")).click();
    }

    static void addToCart(WebDriver webDriver) throws InterruptedException {
        Thread.sleep(1000);
        webDriver.findElement(By.cssSelector("input[value='add to cart']")).click();
    }

    static void selectSize(Item item, WebDriver webDriver) {
        webDriver.findElement(xpath("//*[contains(text(), '" + item.getSize() + "')]")).click();
    }

    static void checkout(CheckoutProfile cp, WebDriver webDriver) {
        webDriver.get("https://www.supremenewyork.com/checkout");

        webDriver.findElement(xpath("//*[@id=\"order_billing_name\"]")).sendKeys(cp.getFullName());
        webDriver.findElement(xpath("//*[@id=\"order_email\"]")).sendKeys(cp.getEmail());
        webDriver.findElement(xpath("//*[@id=\"order_tel\"]")).sendKeys(cp.getTel());
        webDriver.findElement(xpath("//*[@id=\"bo\"]")).sendKeys(cp.getAddress());
        webDriver.findElement(xpath("//*[@id=\"order_billing_zip\"]")).sendKeys(cp.getZip());
        webDriver.findElement(xpath("//*[@id=\"order_billing_city\"]")).sendKeys(cp.getCity());

        Select stateDropdown = new Select(webDriver.findElement(By.id("order_billing_state")));
        stateDropdown.selectByVisibleText(cp.getStateAbbrev());

        webDriver.findElement(xpath("//*[@id=\"rnsnckrn\"]")).sendKeys(cp.getCardNum());
        webDriver.findElement(xpath("//*[@id=\"orcer\"]")).sendKeys(cp.getCvv());

        Select expMonthDropdown = new Select(webDriver.findElement(xpath("//*[@id=\"credit_card_month\"]")));
        expMonthDropdown.selectByVisibleText(cp.getMonthExp());
        Select expYearDropdown = new Select(webDriver.findElement(xpath("//*[@id=\"credit_card_year\"]")));
        expYearDropdown.selectByVisibleText(cp.getYearExp());

        webDriver.findElement(xpath("//*[@id=\"cart-cc\"]/fieldset/p[2]/label/div")).click();
        webDriver.findElement(xpath("//*[@id=\"pay\"]/input")).click();
    }
}




