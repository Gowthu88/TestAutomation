package pageobjectmodel;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ModifyUser {
	public static WebDriver oBrowser=null;
	public static ActiTimePage oPage=null;

	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyWindow();
		createUser();
		addUser();
		firstname();
		lastname();
		Email();
		 User1();
		 Password();
		 Retypepassword();
		 AddUser();
		 ModifyUser1();
		 deleteUser();
		 logout();
		 closeApplication();
	}

	static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "E:\\EXAMPLE\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oPage=new ActiTimePage(oBrowser);
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
	
	static void createUser()
	{
		try
		{
		  oPage.getUsers().click();
		  Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void addUser()
	{
		try
		{
			oPage.getAdduser().click();
			Thread.sleep(4000);		
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void firstname()
	{
		try
		{
			oPage.getFirstName().sendKeys("Demo");
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void lastname()
	{
		try
		{
			oPage.getlastName().sendKeys("User");
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void Email()
	{
		try
		{
			oPage.getEmail().sendKeys("demo@gmail.com");
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	static void User1()
	{
	try
	{
		oPage.getUserName1().sendKeys("DemoUser1");
		Thread.sleep(4000);
	}catch(Exception e)
	{
		e.printStackTrace();		
	}
}
	static void Password()
	{
		try
		{
			oPage.getPassword1().sendKeys("123456");
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	static void Retypepassword()
	{
		try
		{
			oPage.getRetypePassword().sendKeys("123456");
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	static void AddUser()
	{
		try
		{
			oPage.getCreateUser().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	static void ModifyUser1()
	{
		try
		{
			oPage.getSelect().click();
			Thread.sleep(4000);
			oPage.getModify().sendKeys("123");
			Thread.sleep(2000);
			oPage.getModifyPass().sendKeys("123");
			Thread.sleep(2000);
			oPage.getsaveChanges().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void deleteUser()
	{
		try
		{
			oPage.getSelect().click();
			Thread.sleep(4000);
			oPage.getDelete().click();
			Thread.sleep(2000);
			Alert oAlert=oBrowser.switchTo().alert();
			String str=oAlert.getText();
			System.out.println(str);
			oAlert.accept();
			Thread.sleep(4000);
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


