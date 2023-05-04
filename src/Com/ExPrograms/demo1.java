package Com.ExPrograms;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class demo1 {
	public static void main(String[] args)  {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter country");
		String mycountry=sc.nextLine();
		boolean mystatus=false;
		System.setProperty("webdriver.gecko.driver","./Resource\\geckodriver_001.exe");
		WebDriver driver =new FirefoxDriver();
	
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("REGISTER")).click();
		
		Select opts=new Select(driver.findElement(By.name("country")));
		List<WebElement>values=opts.getOptions();
		//System.out.println(values);
		for(WebElement value:values) {
			String actualCountry=value.getText();
			if(actualCountry.equalsIgnoreCase(mycountry)) {
				System.out.println("expected country exits");
				
			
			//System.out.println(actualCountry);
			opts.selectByValue(actualCountry);
			mystatus=true;
			break;
		}}
			if(mystatus=false) {
				System.out.println("does not exist");
			}
			
		
}}
