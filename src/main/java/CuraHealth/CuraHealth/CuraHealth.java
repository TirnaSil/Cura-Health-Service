package CuraHealth.CuraHealth;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CuraHealth {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver= new ChromeDriver();
driver.get("https://katalon-demo-cura.herokuapp.com/");
System.out.println(driver.getTitle());
driver.manage().window().maximize();
Thread.sleep(2000);
driver.findElement(By.id("btn-make-appointment")).click();

driver.findElement(By.id("txt-username")).sendKeys("John Doe");
driver.findElement(By.id("txt-password")).sendKeys("ThisIsNotAPassword");
Thread.sleep(1000);

driver.findElement(By.id("btn-login")).click();
driver.manage().deleteAllCookies();

//static dropdown
WebElement staticdropdown = driver.findElement(By.id("combo_facility"));
Select dropdown = new Select(staticdropdown);
dropdown.selectByIndex(1);
Thread.sleep(1000);
  System.out.println(dropdown.getFirstSelectedOption().getText());
  
  
  driver.findElement(By.xpath("//span[@class='glyphicon glyphicon-calendar']")).click();	
  
  driver.findElement(By.xpath("//td[normalize-space()='31']")).click();
driver.findElement(By.cssSelector(".form-horizontal")).click();
  
  driver.findElement(By.id("txt_comment")).sendKeys("I hope this message finds you well. I am writing to request an appointment with you at your earliest convenience. I have been experiencing [briefly mention symptoms or reason for appointment] for [duration of symptoms].\r\n"
  		+ "\r\n"
  		+ "Could you please schedule a time for me to come in and discuss this further? I am available [mention your availability, such as weekdays after 3 pm or specific dates].\r\n"
  		+ "\r\n"
  		+ "Thank you very much for your attention to this matter. I look forward to hearing from you soon.\r\n"
  		+ "\r\n"
  		+ "Best regards,");
  Thread.sleep(2000);
  driver.findElement(By.xpath("//input[@id='radio_program_medicaid']")).click();
  
  driver.findElement(By.id("chk_hospotal_readmission")).click();
  
  driver.findElement(By.id("btn-book-appointment")).click();
  
  Thread.sleep(1000);
  driver.findElement(By.cssSelector(".btn.btn-default")).click();
  driver.close();
	}

}
