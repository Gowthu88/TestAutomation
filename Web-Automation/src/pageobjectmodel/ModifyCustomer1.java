package pageobjectmodel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ModifyCustomer1 {
	public static WebDriver oBrowser=null;
	public static  ActiTimePage1 oPage=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyWindow();
		createCustomer();
		 modifyCustomer();
		 deleteCustomer();
		 logout();
		 closeApplication();

	}
	static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "E:\\EXAMPLE\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oPage=new  ActiTimePage1(oBrowser);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}

	static void navigate()
	{
		try
		{
			oBrowser.navigate().to("http://localhost:82/login.do");
			oBrowser.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}

	static void login()
	{
		try
		{
          oPage.getUserName().sendKeys("admin");
          oPage.getPassword().sendKeys("manager");
          oPage.getLogin().click();
          Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void minimizeFlyWindow()
	{
		try
		{
			oPage.gettingStartedShortcutsPanelId().click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	static void createCustomer()
	{
		try
		{
			oPage.gettask().click();
			Thread.sleep(2000);
			oPage.getAddnew().click();
			Thread.sleep(2000);
			oPage.getnewCustomer().click();
			Thread.sleep(2000);
			oPage.getCustomerName().sendKeys("DemoCustomer");
			Thread.sleep(2000);
			oPage.getcommitCustomer().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	static void modifyCustomer()
	{
		try
		{
			oPage.getEdit().click();
			Thread.sleep(2000);
			oPage.getdescrption().sendKeys("customer 1");
			Thread.sleep(2000);
			oPage.getAction().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	static void deleteCustomer()
	{
		try
		{
			oPage.getAction().click();
			Thread.sleep(2000);
			oPage.getDelete1().click();
			Thread.sleep(2000);
			oPage.getdeletepermanantly().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	static void logout()
	{
		try
		{
			oPage.getLogout().click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void closeApplication()
	{
		try
		{
			oBrowser.close();
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
}
