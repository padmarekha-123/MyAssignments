package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver = new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
driver.findElement(By.id("pass")).sendKeys("Tuna@321");
driver.findElement(By.name("login")).click();
driver.findElement(By.linkText("Create a new Facebook account.")).click();
	}

}
