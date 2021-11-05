package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimePage {
	public ActiTimePage(WebDriver oBrowser)
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
	@FindBy(xpath="//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")
	private WebElement oUsers;
	public WebElement getUsers()
	{
		return oUsers;
	}
	@FindBy(xpath="//*[@id=\'createUserDiv\']/div")
	private WebElement oUser1;
	public WebElement  getAdduser()
	{
		return oUser1;
	}
	@FindBy(xpath="//*[@id=\'userDataLightBox_firstNameField\']")
	private WebElement oFname;
	public WebElement getFirstName()
	{
		return oFname;
	}
	@FindBy(xpath="//*[@id=\'userDataLightBox_lastNameField\']")
	private WebElement oLname;
	public WebElement getlastName()
	{
		return oLname;
	}
	@FindBy(xpath="//*[@id=\'userDataLightBox_emailField\']")
	private WebElement oEmail;
	public WebElement getEmail()
	{
		return  oEmail;
	}
	private WebElement userDataLightBox_usernameField;
	public WebElement getUserName1()
	{
		return userDataLightBox_usernameField;
	}
	private WebElement userDataLightBox_passwordField;
	public WebElement getPassword1()
	{
		return userDataLightBox_passwordField;
	}
	private WebElement userDataLightBox_passwordCopyField;
	public WebElement getRetypePassword()
	{
		return userDataLightBox_passwordCopyField;
	}
	@FindBy(xpath="//*[@id=\'userDataLightBox_commitBtn\']/div/span")
	private WebElement oCreate;
	public WebElement getCreateUser()
	{
		return oCreate;
	}
	@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")
	private WebElement oSelect;
	public WebElement getSelect()
	{
		return  oSelect;
	}
	@FindBy(xpath="//*[@id=\'userDataLightBox_passwordField\']")
	private WebElement oModify;
	public WebElement getModify()
	{
		return oModify;
	}
	@FindBy(xpath="//*[@id=\'userDataLightBox_passwordCopyField\']")
	private WebElement oModifyPassword;
	public WebElement getModifyPass()
	{
		return oModifyPassword;
	}
	@FindBy(xpath="//*[@id=\'userDataLightBox_commitBtn\']/div/span")
	private WebElement oSaveChanges;
	public WebElement getsaveChanges()
	{
		return oSaveChanges;
	}
	@FindBy(xpath="//*[@id=\'userDataLightBox_deleteBtn\']")
	private WebElement odelete;
	public WebElement getDelete()
	{
		return  odelete;
	}
	private WebElement logoutLink;
	public WebElement getLogout()
	{
		return logoutLink;
	}
	@FindBy(xpath="//*[@id=\'topnav\']/tbody/tr/td[3]/a/div[2]")
	private WebElement oTask;
	public WebElement getTask()
	{
		return oTask;
	}
	@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]/div/div[2]")
	private WebElement oAddnew;
	public WebElement getAddNew()
	{
		return oAddnew;
	}

	@FindBy(xpath="/html/body/div[14]/div[1]")
	private WebElement oAddNewCustomer;
	public WebElement getAddNewCustomer()
	{
		return oAddNewCustomer;
	}

	private WebElement customerLightBox_nameField;
	public WebElement getCustomerName()
	{
		return customerLightBox_nameField;
	}
	@FindBy(xpath="//*[@id=\'customerLightBox_commitBtn\']/div/span")
	private WebElement oCreateCustomer;
	public WebElement getCreateCustomer1()
	{
		return  oCreateCustomer;
	}
	@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
	private WebElement oSettings;
	public WebElement getSettings()
	{
		return  oSettings;
	}
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[1]/div[4]/div/div/div[2]")
	private WebElement oActions;
	public WebElement getAction()
	{
		return  oActions;
	}
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[4]/div/div[3]/div")
	private WebElement odelete1;
	public WebElement getDelete1()
	{
		return odelete1;
	}
	private WebElement customerPanel_deleteConfirm_submitTitle;
	public WebElement getdeletepermanantly()
	{
		return customerPanel_deleteConfirm_submitTitle;
	}
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[2]/div[1]/div[3]/div[2]/div/div[1]/textarea")
	private WebElement oDescription;
	public WebElement getDescription()
	{
		return oDescription;
	}
	@FindBy(xpath="/html/body/div[14]/div[2]")
	private WebElement oNewProject;
	public WebElement getNewProject()
	{
		return oNewProject;
	}
	private WebElement projectPopup_projectNameField;
	public WebElement getProjectName()
	{
		return projectPopup_projectNameField;
	}
	@FindBy(xpath="//*[@id=\'projectPopup_commitBtn\']/div/span")
	private WebElement oCommit;
	public WebElement getCommit()
	{
		return oCommit;
	}
    @FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")
    private WebElement oSettings1;
    public WebElement getSettings1()
    {
    	return oSettings1;
    }
    @FindBy(xpath="//*[@id=\'taskListBlock\']/div[4]/div[1]/div[2]/div[3]/div/div/div[2]")
    private WebElement oAction1;
    public WebElement getAction1()
    {
    	return  oAction1;
    }
    @FindBy(xpath="//*[@id=\'taskListBlock\']/div[4]/div[4]/div/div[3]/div")
    private WebElement odelete2;
    public WebElement getdelete2()
    {
    	return odelete2;
    }
	@FindBy(xpath="//*[@id=\'projectPanel_deleteConfirm_submitTitle\']")
	private  WebElement oDeletepermanently1;
	public  WebElement getdeletepermanently1()
	{
		return oDeletepermanently1;
	}
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[1]/div[1]/div[3]/div/div[2]")
	private WebElement oAddTask1;
	public WebElement getAddtask()
	{
		return oAddTask1;
	}
	@FindBy(xpath="/html/body/div[13]/div[1]")
	private WebElement oCreatetAsk;
	public WebElement getcreateTask()
	{
		return oCreatetAsk;
	}
	@FindBy(xpath="//*[@id=\'createTasksPopup_createTasksTableContainer\']/table/tbody/tr[1]/td[1]/input")
	private WebElement oTask1;
	public WebElement getTask1()
	{
		return oTask1;
	}
	@FindBy(xpath="//*[@id=\'createTasksPopup_commitBtn\']/div/span")
	private WebElement oCommitTask;
	public WebElement getCommitTask()
	{
		return  oCommitTask;
	}
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[1]/div[2]/div[1]/table[1]/tbody/tr/td[2]/div/div[2]")
	private WebElement ogetTask;
	public WebElement  getTaskd()
	{
		return ogetTask;
	}
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[3]/div[1]/div[2]/div[3]/div/div/div[2]")
	private WebElement oTaskAction;
	public WebElement getTaskAction()
	{
		return oTaskAction;
	}
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[3]/div[4]/div/div[3]/div")
	private WebElement oTaskdelete;
	public WebElement getdeleteTask()
	{
		return  oTaskdelete;
	}
	private WebElement taskPanel_deleteConfirm_submitTitle;
	public WebElement getdeleteTaskpermanently()
	{
		return  taskPanel_deleteConfirm_submitTitle;
	}
}
