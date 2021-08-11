package org.tube;


import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selen {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("WebDriver.Chrome.driver","C:\\Users\\ARUNKUMAR\\esclipse new\\First\\Driver\\chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		driver.get("http://blueballtechnologies.com/index.php");
		driver.manage().window().maximize();
		
	WebElement s = driver.findElement(By.id("countries"));
	
	
	System.out.println("tedxt");
Select	g=new Select(s);

List<WebElement> options = g.getOptions();
for(int i=0;i<options.size();i++) {
	String text = options.get(i).getText();
	System.out.println(text);
}



	


	
	}
}
