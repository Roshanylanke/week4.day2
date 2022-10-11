package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		//launch the browser
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.leafground.com/drag.xhtml;jsessionid=node03verg0z075n31ai7n4a3r1rfp365346.node0");
		
		WebElement drag = driver.findElement(By.xpath("//p[text()='Drag to target']"));
		WebElement drop = driver.findElement(By.xpath("//span[text()='Droppable Target']"));
		Actions builder = new Actions(driver);
		builder.dragAndDrop(drag, drop);
		
		
		builder.clickAndHold(drag).moveToElement(drop).perform();
		
		Point location = drag.getLocation();
		Point location1 = drop.getLocation();
		
		
		
		
		System.out.println("object dragged");
		
		
		

	}

}
