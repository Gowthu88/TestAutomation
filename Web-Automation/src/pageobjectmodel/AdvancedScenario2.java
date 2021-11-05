package pageobjectmodel;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvancedScenario2 {
	public static WebDriver oBrowser=null;
	public static  ActiTimePageAdavancedScenario oPage=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyWindow();
		createUser();
		logout();
		loginasuser1();
		createUser1();
		logout();
		loginasuser2();
		createUser2();
		logout();
		loginasuser3();
		logout();
		loginasuser22();
		ModifyUser3();
		logout();
		loginasuser33();
		logout();
		loginasuser11();
		 ModifyUser2();
		 logout();
		 loginasuser222();
		 logout();
		 login();
		 ModifyUser1();
		 logout();
		 loginasuser111();
		 logout();
		 loginasuser222();
		 deleteuser3();
		 logout();
		 loginasuser111();
		 deleteuser2();
		 logout();
		 login();
		 deleteUser1();
		 logout();
		 closeApplication();
	}
	static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "E:\\EXAMPLE\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oPage=new ActiTimePageAdavancedScenario(oBrowser);
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
			Thread.sleep(2000);
			oPage.getAddUser().click();
			Thread.sleep(2000);
			oPage.getFname().sendKeys("Demo");
			Thread.sleep(2000);
			oPage.getlname().sendKeys("User1");
			Thread.sleep(2000);
			oPage.getEmail().sendKeys("demo@gmail.com");
			Thread.sleep(2000);
			oPage.getUserName1().sendKeys("DemoUser1");
			Thread.sleep(2000);
			oPage.getpassword().sendKeys("1234");
			Thread.sleep(2000);
			oPage.getRetypePassword().sendKeys("1234");
			Thread.sleep(2000);
			oPage.getCommit().click();
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
	static void loginasuser1()
	{
		try
		{
          oPage.getUserName().sendKeys("DemoUser1");
          oPage.getPassword().sendKeys("1234");
          oPage.getLogin().click();
          Thread.sleep(4000);
          oPage.getExplore().click();
          Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	static void createUser1()
	{
		try
		{
			oPage.getUsers().click();
			Thread.sleep(2000);
			oPage.getAddUser().click();
			Thread.sleep(2000);
			oPage.getFname().sendKeys("Demo");
			Thread.sleep(2000);
			oPage.getlname().sendKeys("User2");
			Thread.sleep(2000);
			oPage.getEmail().sendKeys("demo2@gmail.com");
			Thread.sleep(2000);
			oPage.getUserName1().sendKeys("DemoUser2");
			Thread.sleep(2000);
			oPage.getpassword().sendKeys("12345");
			Thread.sleep(2000);
			oPage.getRetypePassword().sendKeys("12345");
			Thread.sleep(2000);
			oPage.getCommit().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	static void loginasuser2()
	{
		try
		{
          oPage.getUserName().sendKeys("DemoUser2");
          oPage.getPassword().sendKeys("12345");
          oPage.getLogin().click();
          Thread.sleep(4000);
          oPage.getExplore().click();
          Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	static void createUser2()
	{
		try
		{
			oPage.getUsers().click();
			Thread.sleep(2000);
			oPage.getAddUser().click();
			Thread.sleep(2000);
			oPage.getFname().sendKeys("Demo");
			Thread.sleep(2000);
			oPage.getlname().sendKeys("User3");
			Thread.sleep(2000);
			oPage.getEmail().sendKeys("demo3@gmail.com");
			Thread.sleep(2000);
			oPage.getUserName1().sendKeys("DemoUser3");
			Thread.sleep(2000);
			oPage.getpassword().sendKeys("123456");
			Thread.sleep(2000);
			oPage.getRetypePassword().sendKeys("123456");
			Thread.sleep(2000);
			oPage.getCommit().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	static void loginasuser3()
	{
		try
		{
          oPage.getUserName().sendKeys("DemoUser3");
          oPage.getPassword().sendKeys("123456");
          oPage.getLogin().click();
          Thread.sleep(4000);
          oPage.getExplore().click();
          Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	static void loginasuser22()
	{
		try
		{
          oPage.getUserName().sendKeys("DemoUser2");
          oPage.getPassword().sendKeys("12345");
          oPage.getLogin().click();
          Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	static void ModifyUser3()
	{
		try
		{
			oPage.getUsers().click();
			Thread.sleep(2000);
			oPage.getUser3().click();
			Thread.sleep(2000);
			oPage.getpassword().sendKeys("abc");
			Thread.sleep(2000);
			oPage.getRetypePassword().sendKeys("abc");
			Thread.sleep(2000);
			oPage.getSaveChanges().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	static void loginasuser33()
	{
		try
		{
          oPage.getUserName().sendKeys("DemoUser3");
          oPage.getPassword().sendKeys("abc");
          oPage.getLogin().click();
          Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	static void loginasuser11()
	{
		try
		{
          oPage.getUserName().sendKeys("DemoUser1");
          oPage.getPassword().sendKeys("1234");
          oPage.getLogin().click();
          Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	static void ModifyUser2()
	{
		try
		{
			oPage.getUsers().click();
			Thread.sleep(2000);
			oPage.getUser2().click();
			Thread.sleep(2000);
			oPage.getpassword().sendKeys("abcde");
			Thread.sleep(2000);
			oPage.getRetypePassword().sendKeys("abcde");
			Thread.sleep(2000);
			oPage.getSaveChanges().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	static void loginasuser222()
	{
		try
		{
          oPage.getUserName().sendKeys("DemoUser2");
          oPage.getPassword().sendKeys("abcde");
          oPage.getLogin().click();
          Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	static void ModifyUser1()
	{
		try
		{
			oPage.getUsers().click();
			Thread.sleep(2000);
			oPage.getUser1().click();
			Thread.sleep(2000);
			oPage.getpassword().sendKeys("abcd");
			Thread.sleep(2000);
			oPage.getRetypePassword().sendKeys("abcd");
			Thread.sleep(2000);
			oPage.getSaveChanges().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	static void loginasuser111()
	{
		try
		{
          oPage.getUserName().sendKeys("DemoUser1");
          oPage.getPassword().sendKeys("abcd");
          oPage.getLogin().click();
          Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	static void deleteuser3()
	{
		try
		{
			oPage.getUsers().click();
			Thread.sleep(2000);
			oPage.getUser3().click();
			Thread.sleep(2000);
			oPage.getdeleteuser().click();
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
	static void deleteuser2()
	{
		try
		{
			oPage.getUsers().click();
			Thread.sleep(2000);
			oPage.getUser222().click();
			Thread.sleep(2000);
			oPage.getdeleteuser().click();
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
	static void deleteUser1()
	{
		try
		{
			oPage.getUsers().click();
			Thread.sleep(2000);
			oPage.getUser111().click();
			Thread.sleep(2000);
			oPage.getdeleteuser().click();
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
