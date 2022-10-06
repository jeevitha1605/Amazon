package marathon;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
	    ChromeDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.amazon.in/");
	    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags for boys",Keys.ENTER);
	    String bag = driver.findElement(By.xpath("//span[text()=\"1-48 of over 30,000 results for\"]")).getText();
	    System.out.println(bag+" the total number of bags for boys");
	    driver.findElement(By.xpath("//span[text()='Brand']/following::span[text()='American Tourister']")).click();
	    driver.findElement(By.xpath("//span[text()='Generic']")).click();
	    String americanTourist = driver.findElement(By.xpath("//span[text()='1-48 of over 5,000 results for']")).getText();
	    System.out.println(americanTourist+"No.of bags in american and generic");
		// TODO Auto-generated method stubsyso
if(bag.equals(americanTourist))
{
	System.out.println("Filtered not applied");
}
else
{
	System.out.println("Filter applied");
}
driver.findElement(By.xpath("//span[text()='Sort by:']")).click();
driver.findElement(By.id("s-result-sort-select_4")).click();
//get title and discount
Thread.sleep(3000);
String title = driver.findElement(By.xpath("//span[contains(text(),'21 L Latest Trends Laptop Backpack')]")).getText();
System.out.println("Title"+title);
String discount = driver.findElement(By.xpath("//span[text()='(73% off)']")).getText();
System.out.println("Discount percentage"+discount);
	}

	
}
