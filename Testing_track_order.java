import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Testing_track_order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "C:\\web driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		//launch website
		driver.navigate().to("https://www.urbanladder.com/");
		
				
		//maximize the browser
		driver.manage().window().maximize();
		
	
			   
				//click on Truck icon
			   driver.findElement(By.xpath("//a[@class='_1otc2'][@href='/orders']")).click();
			 
				
				// enter order number
				driver.findElement(By.xpath("//input[@id='ip_379403698']")).sendKeys("345687643");
				
				//enter phone no
				driver.findElement(By.xpath("//input[@id='ip_394711104']")).sendKeys("8929661656");
				
				//click on submit button
				driver.findElement(By.xpath("//button[@class='_3Haew _1fVSi action-button _1njbS _1XfDi _1tgY9']")).click();
	}

}
