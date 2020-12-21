package Test;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Tester {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/cgupta31.EAD/Downloads/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.MINUTES);
		driver.get("http://20.15.66.54:8080/eApps/");
		Thread.sleep(10000);
		//String title = driver.getTitle();
		//System.out.println(title);
		driver.manage().window().maximize();
		// WebDriverWait wait=new WebDriverWait(driver, 20);
		ArrayList<String> tabs2 = new ArrayList<String>(
				driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(1));
		// wait.until(ExpectedConditions.)
		driver.findElement(By.id("userName")).sendKeys("eapp_admin");
		driver.findElement(By.id("password")).sendKeys("vilink");
		driver.findElement(By.id("Logon")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.linkText("New Application")).click();
		Thread.sleep(4000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.body.style.transform='scale(0.9)'");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//td[@title='Indexed Universal Life']"))
				.click();
		driver.findElement(By.id("NewApplication")).click();
		Thread.sleep(4000);
		System.out.println(tabs2.size());
		if(tabs2.size()>2)
			driver.switchTo().window(tabs2.get(2));
		
		driver.findElement(By.id("a_WorkItemID_getting_started_iul")).sendKeys(
				"2134-12-32-14.32.14.312432C01");
		driver.findElement(By.id("a_ApplicationCompInd_getting_started_iul1"))
				.click();
		driver.findElement(By.id("a_PIOtherThanOwn_getting_started_iul2")).click();
		driver.findElement(By.id("a_AgentID_AGT1_getting_started_iul")).sendKeys("2134124");
		WebElement distributionChannel = driver.findElement(By
				.id("a_DistributionChannel_getting_started_iul"));
		Select selectdistribution = new Select(distributionChannel);
		selectdistribution.selectByVisibleText("Morgan Stanley");
		WebElement state = driver.findElement(By
				.id("a_ApplicationJurisdiction_getting_started_iul"));
		Select selectState = new Select(state);
		selectState.selectByVisibleText("AL");

		driver.findElement(By.id("a_PremiumWA_getting_started_iul")).sendKeys(
				"");
		driver.findElement(By.id("a_CurrentAmt_getting_started_iul")).sendKeys(
				"");
		driver.findElement(By.id("a_IllustrationPDFInd_getting_started_iul2"))
				.sendKeys("");
		Thread.sleep(2000);
		driver.close();
	}

}
