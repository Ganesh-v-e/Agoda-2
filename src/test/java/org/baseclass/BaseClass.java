package org.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {

	public static WebDriver driver;

	public void browserLaunch() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Homeeee\\eclipse-workspace\\Demo_Project\\Driver\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();
	}

	public static void url(String value) {
		driver.get(value);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public static void close() {
		driver.close();
	}

	public static void quit() {
		driver.quit();
	}

	public static void goTo() {
		driver.navigate().to("address");
	}

	public static void goBack() {
		driver.navigate().back();
	}

	public static void goFor() {
		driver.navigate().forward();
	}

	public static void load() {
		driver.navigate().refresh();
	}

	public static void get(String value) {
		driver.get(value);
	}

	public static void caution() {
		driver.switchTo().alert().accept();
	}

	public static void casee(WebElement elemnet) {
		Actions ac = new Actions(driver);
		ac.moveToElement(elemnet).build().perform();
	}

	public static void iframe(WebElement element) {
		driver.switchTo().frame(element);
	}

	public static void rob(WebElement element) throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_UP);
	}

	public static void checkBox(WebElement element) {
		element.click();
	}

	public static void isEnable(WebElement element) {
		element.isEnabled();
	}

	public static void isDisplay(WebElement element) {
		element.isDisplayed();
	}

	public static void isSelect(WebElement element) {
		element.isSelected();
	}

	public static void current(String url) {
		driver.get(url);
		System.out.println(url);
	}

	public static void getOptions(WebElement element) {
		Select s1 = new Select(element);
		s1.getOptions();
	}

	public static void getTi(String title) {
		driver.getTitle();
		System.out.println(title);
	}

	public static void sendKeys(WebElement element, String value) {
		element.sendKeys(value);

	}

	public static void erase(WebElement element) {
		element.clear();
	}

	public static void dropDown(WebElement element, String options, String value) {
		Select s = new Select(element);

		try {
			if (options.equalsIgnoreCase("byIndex")) {
				int parsInt = Integer.parseInt(value);
				s.deselectByIndex(parsInt);
			} else if (options.equalsIgnoreCase("byValue")) {
				s.selectByValue(value);
			} else if (options.equalsIgnoreCase("byVisibleText")) {
				s.selectByVisibleText(value);

			} else {
				System.out.println("Invalid");
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}

	}

	public static void text(WebElement element) {
		element.getText();

	}

}
