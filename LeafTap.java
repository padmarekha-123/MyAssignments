package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafTap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver = new ChromeDriver();
driver.get("http://leaftaps.com/opentaps/control/main");
driver.manage().window().maximize();
driver.findElement(By.id("username")).sendKeys("demosalesmanager");
driver.findElement(By.id("password")).sendKeys("crmsfa");
driver.findElement(By.className("decorativeSubmit")).click();
driver.findElement(By.linkText("CRM/SFA")).click();
driver.findElement(By.linkText("Leads")).click();
driver.findElement(By.linkText("Create Lead")).click();
driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test Leaf");
driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Padma");
driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Rekha");
driver.findElement(By.className("smallSubmit")).click();
driver.close();

	}

}
