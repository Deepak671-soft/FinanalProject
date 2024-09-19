package Finalproject;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class GURU99DEMOSITE {

	

		WebDriver driver;


	    @BeforeSuite
	    public void launchbrowser() {
	        System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\OneDrive\\Desktop\\Selenium drivers\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
	        driver = new ChromeDriver();
	    }
	    
	    @Test(priority = 0)
	    public void openGuru99() {
	        driver.get("https://demo.guru99.com/telecom/index.html");
	        driver.manage().window().maximize();
	    }
	    @Test(priority = 1)
	    public void Guru99() throws InterruptedException, IOException {
	    	
	    	Actions action=new Actions(driver);
	    	 WebElement click=driver.findElement(By.xpath("//*[@id=\"one\"]/div/div[1]/div[1]/h3/a"));
	 	    action.doubleClick(click).build().perform();
	        Thread.sleep(1000);


	        WebElement Donechkbox = driver.findElement(By.xpath("//*[@id=\"main\"]/div/form/div/div[1]/label"));
	        Donechkbox.click();
	        
	        WebElement Fname = driver.findElement(By.xpath("//*[@id=\"fname\"]"));
	        Fname.click();
	        Fname.sendKeys("Deepak");
	        Thread.sleep(1000);
	        
	        WebElement Lname = driver.findElement(By.xpath("//*[@id=\"lname\"]"));
	        Lname.click();
	        Lname.sendKeys("Vijayan");
	        Thread.sleep(1000);

	        WebElement Email = driver.findElement(By.xpath("//*[@id=\"email\"]"));
	        Email.click();
	        Email.sendKeys("deepakvijayan07@gmail.com");
	        Thread.sleep(1000);
	        
	        WebElement Address = driver.findElement(By.xpath("/html/body/section/div/form/div/div[7]/textarea[1]"));
	        Address.sendKeys("Thanuvelil house vazhamuttom west po omalloor");
	        Thread.sleep(1000);
	        
	        WebElement Mnumber = driver.findElement(By.xpath("//*[@id=\"telephoneno\"]"));
	        Mnumber.click();
	        Mnumber.sendKeys("8075780969");
	        Thread.sleep(1000);
	        
	        WebElement Submit = driver.findElement(By.xpath("//*[@id=\"main\"]/div/form/div/div[9]/ul/li[1]/input"));
	        Submit.click();
	        Thread.sleep(1000);
	        
	        String loc="C:\\Users\\user\\OneDrive\\Pictures\\Addcustomer.png";
	    	File file1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);   
	        FileUtils.copyFile(file1,new File(loc+"AddResult_jpg.jpg"));
	        
	        WebElement Home = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/ul/li/a"));
	        Home.click();
	        Thread.sleep(1000);
	        }
	        
	        @Test(priority = 2)
	        public void Reset() throws InterruptedException, IOException {
	        	Actions action=new Actions(driver);
	        	WebElement click=driver.findElement(By.xpath("//*[@id=\"one\"]/div/div[1]/div[1]/h3/a"));
		 	    action.doubleClick(click).build().perform();
		        Thread.sleep(1000);
		        
		        WebElement Pendingchkbox = driver.findElement(By.xpath("//*[@id=\"main\"]/div/form/div/div[2]/label"));
		        Pendingchkbox.click();
		        
	        	WebElement Fname = driver.findElement(By.xpath("//*[@id=\"fname\"]"));
	 	        Fname.click();
	 	        Fname.sendKeys("Arjun");
	 	        Thread.sleep(1000);
	 	        
	 	        WebElement Lname = driver.findElement(By.xpath("//*[@id=\"lname\"]"));
	 	        Lname.click();
	 	        Lname.sendKeys("Shankar");
	 	        Thread.sleep(1000);

	 	        WebElement Email = driver.findElement(By.xpath("//*[@id=\"email\"]"));
	 	        Email.click();
	 	        Email.sendKeys("arjunsha07@gmail.com");
	 	        Thread.sleep(1000);
	 	        
	 	        WebElement Address = driver.findElement(By.xpath("/html/body/section/div/form/div/div[7]/textarea[1]"));
	 	        Address.sendKeys("Krishna Vilasam");
	 	        Thread.sleep(1000);
	 	        
	 	        WebElement Mnumber = driver.findElement(By.xpath("//*[@id=\"telephoneno\"]"));
	 	        Mnumber.click();
	 	        Mnumber.sendKeys("8113029829");
	 	        Thread.sleep(1000);
	 	        
	 	        WebElement Reset = driver.findElement(By.xpath("//*[@id=\"main\"]/div/form/div/div[9]/ul/li[2]/input"));
	 	        Reset.click();
	 	        
	 	       String loc="C:\\Users\\user\\OneDrive\\Pictures\\Resetcustomer.png";
		    	File file1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);   
		        FileUtils.copyFile(file1,new File(loc+"REResult_jpg.jpg"));
		        
 	            WebElement Menu = driver.findElement(By.xpath("//*[@id=\"header\"]/nav/a[1]"));
 	            Menu.click();
	            Thread.sleep(1000);
	 	        
	 	       WebElement Add = driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[3]/a"));
		        Add.click();
		        Thread.sleep(1000);
	        }
	        @Test(priority = 3)
	        public void Addtariffplan() throws InterruptedException, IOException {
	        
	        	WebElement Mrentel = driver.findElement(By.xpath("//*[@id=\"rental1\"]"));
	            Mrentel.click();
	            Mrentel.sendKeys("1000");
	            Thread.sleep(1000);
	            
	           WebElement FLminutes = driver.findElement(By.xpath("//*[@id=\"local_minutes\"]"));
	           FLminutes .click();
	           FLminutes.sendKeys("100");
	           Thread.sleep(1000);
	           
	           WebElement FIminutes = driver.findElement(By.xpath("//*[@id=\"inter_minutes\"]"));
	           FIminutes.click();
	           FIminutes.sendKeys("120");
	           Thread.sleep(1000);
	           
	          WebElement FRsms = driver.findElement(By.xpath("//*[@id=\"sms_pack\"]"));
	           FRsms.click();
	           FRsms.sendKeys("100");
	           Thread.sleep(1000);

	          WebElement LPminutes = driver.findElement(By.xpath("//*[@id=\"minutes_charges\"]"));
	           LPminutes.click();
	           LPminutes.sendKeys("1");
	           Thread.sleep(1000);
	           
	          WebElement INTcharges = driver.findElement(By.xpath("//*[@id=\"inter_charges\"]"));
	           INTcharges.click();
	           INTcharges.sendKeys("3");
	           Thread.sleep(1000);

	          WebElement SMcharges = driver.findElement(By.xpath("//*[@id=\"sms_charges\"]"));
	           SMcharges.click();
	           SMcharges.sendKeys("1");
	           Thread.sleep(1000);
	           
	          WebElement Submit = driver.findElement(By.xpath("//*[@id=\"main\"]/div/form/div/div[36]/ul/li[1]/input"));
	           Submit.click();
	           Thread.sleep(1000);
	           
	           String loc="C:\\Users\\user\\OneDrive\\Pictures\\Addtariffplan.png";
		    	File file1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);   
		        FileUtils.copyFile(file1,new File(loc+"AddTAResult_jpg.jpg"));
	           
	           WebElement Home = driver.findElement(By.xpath("//*[@id=\"main\"]/div/ul/li/a"));
	           Home.click();
	           Thread.sleep(1000);
	       }
	        @Test(priority = 4)
	        public void Resettariffplan() throws InterruptedException, IOException {
	        	Actions action=new Actions(driver);
	        	WebElement click=driver.findElement(By.xpath("//*[@id=\"one\"]/div/div[3]/div[1]/h3/a"));
	        	action.doubleClick(click).build().perform();
	            Thread.sleep(1000);
	            
	            WebElement Mrentel = driver.findElement(By.xpath("//*[@id=\"rental1\"]"));
	            Mrentel.click();
	            Mrentel.sendKeys("1000");
	            Thread.sleep(1000);
	            
	           WebElement FLminutes = driver.findElement(By.xpath("//*[@id=\"local_minutes\"]"));
	           FLminutes .click();
	           FLminutes.sendKeys("100");
	           Thread.sleep(1000);
	           
	           WebElement FIminutes = driver.findElement(By.xpath("//*[@id=\"inter_minutes\"]"));
	           FIminutes.click();
	           FIminutes.sendKeys("120");
	           Thread.sleep(1000);
	           
	          WebElement FRsms = driver.findElement(By.xpath("//*[@id=\"sms_pack\"]"));
	           FRsms.click();
	           FRsms.sendKeys("100");
	           Thread.sleep(1000);

	          WebElement LPminutes = driver.findElement(By.xpath("//*[@id=\"minutes_charges\"]"));
	           LPminutes.click();
	           LPminutes.sendKeys("1");
	           Thread.sleep(1000);
	           
	          WebElement INTcharges = driver.findElement(By.xpath("//*[@id=\"inter_charges\"]"));
	           INTcharges.click();
	           INTcharges.sendKeys("3");
	           Thread.sleep(1000);

	          WebElement SMcharges = driver.findElement(By.xpath("//*[@id=\"sms_charges\"]"));
	           SMcharges.click();
	           SMcharges.sendKeys("1");
	           Thread.sleep(1000);
	           
	          WebElement Reset = driver.findElement(By.xpath("//*[@id=\"main\"]/div/form/div/div[36]/ul/li[2]/input"));
	           Reset.click();
	           Thread.sleep(1000);
	           
	           String loc="C:\\Users\\user\\OneDrive\\Pictures\\ResetTariff.png";
		    	File file1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);   
		        FileUtils.copyFile(file1,new File(loc+"AddResult_jpg.jpg"));
	           
	           WebElement Menu = driver.findElement(By.xpath("//*[@id=\"header\"]/nav/a[1]"));
	           Menu.click();
	           Thread.sleep(1000); 
	           WebElement id = driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[4]/a"));
	           id.click();
	           Thread.sleep(1000); 
	           
	        }
	        @Test(priority = 5)
	        public void Addtariffplantocustomer() throws InterruptedException, IOException {
	        
	        	WebElement Customerid = driver.findElement(By.xpath("//*[@id=\"customer_id\"]"));
	            Customerid.click();
	            Customerid.sendKeys("288795");
	            Thread.sleep(1000);
	            
	            WebElement Submit = driver.findElement(By.xpath("//*[@id=\"main\"]/div/form/div/div[6]/input"));
		        Submit.click();
		        Thread.sleep(1000);
		       
		        
		        WebElement Select = driver.findElement(By.xpath("//*[@id=\"main\"]/div/form/div[2]/input"));
		        Select.click();
		        Thread.sleep(1000);
		        
		        String loc="C:\\Users\\user\\OneDrive\\Pictures\\Addtariff.png";
		    	File file1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);   
		        FileUtils.copyFile(file1,new File(loc+"TarResult_jpg.jpg"));
		        
		        
		        WebElement Home = driver.findElement(By.xpath("//*[@id=\"main\"]/div/ul/li/a"));
		        Home.click();
		        Thread.sleep(1000);}
	        
	        @Test(priority = 6)
	        public void Paybilling() throws InterruptedException, IOException {
	        
	        	WebElement Paybilling = driver.findElement(By.xpath("//*[@id=\"one\"]/div/div[3]/div[2]/h3/a"));
	            Paybilling.click();
	            Thread.sleep(1000);
	            
	            WebElement Customerid = driver.findElement(By.xpath("//*[@id=\"customer_id\"]"));
	            Customerid.click();
	            Customerid.sendKeys("591147");
	            Thread.sleep(1000);
	            
	            WebElement Submit = driver.findElement(By.xpath("//*[@id=\"main\"]/div/form/div/div[6]/input"));
		        Submit.click();
		        Thread.sleep(1000);
		        
		        String loc="C:\\Users\\user\\OneDrive\\Pictures\\Paybill.png";
		    	File file1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);   
		        FileUtils.copyFile(file1,new File(loc+"PayResult_jpg.jpg"));
		        
		        driver.get("https://demo.guru99.com/telecom/index.html");
		        
		        
	 	    





	}

}
