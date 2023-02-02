import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTable {

	public static void main(String[] args) throws InterruptedException {
		
		String url="file:///F:/PARESH%20FILES/New%20folder%20(3)/javabykiran-Selenium-Softwares/javabykiran-Selenium-Softwares/Offline%20Website/index.html";
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		

		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("kiran@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123456");
		
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
		
		// 	/html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[1]/th[1]
		driver.findElement(By.xpath("/html/body/div[1]/aside/section/ul/li[3]/a")).click();
		
		List<WebElement> rowelement=driver.findElements(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr"));
		System.out.println(rowelement.size());
		int rowsize=rowelement.size(); 
		
		List<WebElement> colmlements=driver.findElements(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[1]/th"));
		System.out.println(colmlements.size());
		int colmsize=colmlements.size();	
		
		for(int i=2;i<=rowsize;i++) {
			
			for(int j=1;j<=colmsize;j++) {						//		/html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[2]/td[1]
				
				System.out.print(driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr["+ i +"]/td["+ j +"]")).getText()+"  ");
				
			}
			System.out.println();
			
		}
		
	}

}
