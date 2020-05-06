import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Scanner;

public class App {

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter item category: ");
        String category = scanner.nextLine();

        System.out.print("Enter item size: ");
        String size = scanner.nextLine();

        System.out.print("Enter item keywords: ");
        String keyword = scanner.nextLine();

        Item item = new Item(category, size, keyword);

        start(item);
    }

    private static void start(Item item) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver/chromedriver");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.supremenewyork.com/shop/all/" + item.getCategory());

        ItemActions.getItem(item, webDriver);
        Thread.sleep(1000);
        ItemActions.selectSize(item, webDriver);
        Thread.sleep(1000);
        ItemActions.addToCart(webDriver);
        Thread.sleep(1000);
        ItemActions.checkout(item, webDriver);

    }


}


