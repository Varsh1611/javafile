import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "C:\\web driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		//launch website
		driver.navigate().to("https://www.urbanladder.com/orders/auth?src=track-order");
		
				//maximize the browser
				driver.manage().window().maximize();
				
				driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
				
				// enter order number
				driver.findElement(By.xpath("//input[@id='ip_379403698']")).sendKeys("345687643");
				
				//enter phone no
				driver.findElement(By.xpath("//input[@id='ip_394711104']")).sendKeys("8929661656");
				
				//click on submit button
				driver.findElement(By.xpath("//button[@class='_3Haew _1fVSi action-button _1njbS _1XfDi _1tgY9']")).click();
	

	}

}
