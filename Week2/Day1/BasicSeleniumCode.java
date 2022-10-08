package Week2.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicSeleniumCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("Demosalesmanager");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("crmsfa");
		WebElement login = driver.findElement(By.className("decorativeSubmit"));
		login.click();
		WebElement link = driver.findElement(By.linkText("CRM/SFA"));
		link.click();
		WebElement create = driver.findElement(By.linkText("Create Lead"));
		create.click();
		WebElement CompanyName = driver.findElement(By.id("createLeadForm_companyName"));
		CompanyName.sendKeys("Olam Agri");
		WebElement FirstName = driver.findElement(By.id("createLeadForm_firstName"));
		FirstName.sendKeys("Prashanth");
		WebElement LastName = driver.findElement(By.id("createLeadForm_lastName"));
		LastName.sendKeys("Veeramuthu");
		WebElement DepartmentName = driver.findElement(By.id("createLeadForm_departmentName"));
		DepartmentName.sendKeys("SCM");
		WebElement Description = driver.findElement(By.id("createLeadForm_description"));
		Description.sendKeys("Olam Information Service private limited");
		WebElement Email = driver.findElement(By.id("createLeadForm_primaryEmail"));
		Email.sendKeys("Vprashanth17@gmail.com");
		WebElement createbutton = driver.findElement(By.className("smallSubmit"));
		createbutton.click();
		WebElement Edit = driver.findElement(By.className("subMenuButton"));
		Edit.click();
		WebElement Description1 = driver.findElement(By.id("createLeadForm_description"));
		Description1.clear();
		WebElement ImportantNote = driver.findElement(By.className("inputBox"));
		ImportantNote.sendKeys("Im an selenium expert");
		WebElement Update = driver.findElement(By.className("smallSubmit"));	
		Update.click();
		System.out.println("The title is:"+ driver.getTitle());
		
		
		
		
		
		
		
		
		
		// driver.close();
		
		
	}

}
