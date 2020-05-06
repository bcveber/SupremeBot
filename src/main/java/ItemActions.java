import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

class ItemActions {

    static void getItem(Item item, WebDriver webDriver) {
        webDriver.findElement(By.xpath("//*[contains(text(), '" + item.getKeywords() + "')]")).click();
    }

    static void addToCart(WebDriver webDriver) throws InterruptedException {
        Thread.sleep(1000);
        webDriver.findElement(By.cssSelector("input[value='add to cart']")).click();
    }

    static void selectSize(Item item, WebDriver webDriver) {
        webDriver.findElement(By.xpath("//*[contains(text(), '" + item.getSize() + "')]")).click();
    }

    static void checkout(Item item, WebDriver webDriver) {
        webDriver.get("https://www.supremenewyork.com/checkout");
    }
}
