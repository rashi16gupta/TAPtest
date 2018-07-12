package tap.test;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import io.restassured.RestAssured;

public class ActionClass {
	static WebDriver driver;
	static WebDriverWait wait;
	
	public static void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver","C:/rashi/chromedriver/chromedriver.exe");
		 driver = (WebDriver) new ChromeDriver();
		driver.get("http://10.0.31.161:9292/");
		 wait = new WebDriverWait(driver,20); 
		driver.manage().window().maximize();
	 	
	}
	
	public static void basic_auth() {
		//driver.findElement(By.xpath("//*[@href='/basic_auth']")).click();
		
		String admin="admin";
		String URL = "http://" + admin + ":" + admin + "@" + "10.0.31.161:9292/basic_auth";
		driver.navigate().to(URL);

	
	}	
	
}

