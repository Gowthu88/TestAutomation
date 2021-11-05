package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimePageAdavancedScenario {
	public ActiTimePageAdavancedScenario(WebDriver oBrowser)
	{
		PageFactory.initElements(oBrowser, this);
	}

	private WebElement username;
	public WebElement getUserName()
	{
		return username;
	}

	private WebElement pwd;
	public WebElement getPassword()
	{
		return pwd;
	}
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement oLogin;
	public  WebElement getLogin()
	{
		return oLogin;
	}
	private  WebElement gettingStartedShortcutsPanelId;
	public  WebElement gettingStartedShortcutsPanelId()
	{
		return gettingStartedShortcutsPanelId;
	}
	@FindBy(xpath="//div[text()='USERS']")
	private WebElement oUsers;
	public WebElement getUsers()
	{
		return oUsers;
	}
	@FindBy(xpath="//div[text()='Add User']")
	private WebElement oAddUser;
	public WebElement getAddUser()
	{
		return oAddUser;
	}
	private WebElement userDataLightBox_firstNameField;
	public WebElement getFname()
	{
		return userDataLightBox_firstNameField;
	}
	private WebElement userDataLightBox_lastNameField;
	public WebElement getlname()
	{
		return userDataLightBox_lastNameField;
	}
	private WebElement userDataLightBox_emailField;
	public WebElement getEmail()
	{
		return userDataLightBox_emailField;
	}
	private WebElement userDataLightBox_usernameField;
	public WebElement getUserName1()
	{
		return userDataLightBox_usernameField;
	}
	private WebElement userDataLightBox_passwordField;
	public WebElement getpassword()
	{
		return userDataLightBox_passwordField;
	}
	private WebElement userDataLightBox_passwordCopyField;
	public WebElement getRetypePassword()
	{
		return userDataLightBox_passwordCopyField;
	}
	private WebElement userDataLightBox_commitBtn;
	public WebElement getCommit()
	{
		return userDataLightBox_commitBtn;
	}
	private WebElement logoutLink;
	public WebElement getLogout()
	{
		return logoutLink;
	}
	@FindBy(xpath="//span[text()='Start exploring actiTIME']")
	private WebElement oExplore;
	public WebElement getExplore()
	{
		return  oExplore;
	}
	@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]")
	private WebElement ouser1;
	public WebElement getUser1()
	{
		return  ouser1;
	}
	@FindBy(xpath="//span[text()='Save Changes']")
	private WebElement oSaveChanges;
	public WebElement getSaveChanges()
	{
		return oSaveChanges;
	}
	@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[3]/td[1]/table/tbody/tr/td/div[1]")
	private WebElement ouser2;
	public WebElement getUser2()
	{
		return  ouser2;
	}
	@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[4]/td[1]/table/tbody/tr/td/div[1]")
	private WebElement ouser3;
	public WebElement getUser3()
	{
		return  ouser3;
	}
	@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]")
	private WebElement ouser22;
	public WebElement getUser22()
	{
		return  ouser22;
	}
	@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]")
	private WebElement ouser33;
	public WebElement getUser33()
	{
		return  ouser33;
	}
	private WebElement userDataLightBox_deleteBtn;
	public WebElement getdeleteuser()
	{
		return  userDataLightBox_deleteBtn;
	}
	@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[3]/td[1]/table/tbody/tr/td/div[1]")
	private WebElement ouser222;
	public WebElement getUser222()
	{
		return  ouser222;
	}
	@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]")
	private WebElement ouser111;
	public WebElement getUser111()
	{
		return  ouser111;
	}
}
