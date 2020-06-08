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


        System.out.print("Enter full name: ");
        String name = scanner.nextLine();

        System.out.print("Enter email: ");
        String email = scanner.nextLine();

        System.out.print("Enter telephone number: ");
        String tel = scanner.nextLine();

        System.out.print("Enter address only: ");
        String address = scanner.nextLine();

        System.out.print("Enter zip: ");
        String zip = scanner.nextLine();

        System.out.print("Enter city: ");
        String city = scanner.nextLine();

        System.out.print("Enter state code (i.e. CA): ");
        String state = scanner.nextLine();

        System.out.print("Enter city: ");
        String card = scanner.nextLine();

        System.out.print("Enter exp month (i.e. 06): ");
        String expMonth = scanner.nextLine();

        System.out.print("Enter exp year (i.e. 2025): ");
        String expYear = scanner.nextLine();

        System.out.print("Enter cvv: ");
        String cvv = scanner.nextLine();

        CheckoutProfile checkoutProfile = new CheckoutProfile(name, email, tel, address, zip, city, state, card, expMonth, expYear, cvv);

        start(item, checkoutProfile);
    }

    private static void start(Item item, CheckoutProfile checkoutProfile) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver/chromedriver");
        WebDriver webDriver = new ChromeDriver();

        webDriver.get("https://www.supremenewyork.com/shop/all/" + item.getCategory());

//        webDriver.get("https://www.supremenewyork.com/shop/all/" + "jackets");

        Item testItem = new Item("jackets", "Medium", "Military Trench");
        CheckoutProfile testCheckoutProfile = new CheckoutProfile("Test user", "abc123@gmail.com", "5031233344", "1152 walk drive", "97070", "Wilsonville", "OR", "1234567812345678", "06", "2025", "123");

        ItemActions.getItem(item, webDriver);
//        ItemActions.getItem(testItem, webDriver);

        Thread.sleep(1000);
        ItemActions.selectSize(item, webDriver);
        Thread.sleep(1000);
        ItemActions.addToCart(webDriver);
        Thread.sleep(1000);

        ItemActions.checkout(checkoutProfile, webDriver);
//        ItemActions.checkout(testCheckoutProfile, webDriver);

    }


}


