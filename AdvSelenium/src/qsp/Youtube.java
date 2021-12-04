package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Youtube {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.youtube.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@ id='search']")).sendKeys("kgf trailer");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//yt-icon[@ class='style-scope ytd-searchbox']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@ id='video-title' and @ title='KGF Trailer Hindi | Yash | Srinidhi | 21st Dec 2018']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//yt-formatted-string[.='667K' and @ class='style-scope ytd-toggle-button-renderer style-text']")).click();
	
	}

}
