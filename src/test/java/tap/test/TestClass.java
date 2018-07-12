package tap.test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestClass {
	//WebDriver driver=ActionClass.driver;
	
	@BeforeClass
	public void launch()
	{
		ActionClass.launchBrowser();
	}
	@Test
	public void test001_basic_auth_test() {
		ActionClass.basic_auth();
	}
	

	}
	
