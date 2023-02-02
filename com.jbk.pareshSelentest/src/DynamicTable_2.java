import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTable_2 {
	
	//HOW MANY ROWS ND COLUMNS IN TABLE
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("file:///F:/PARESH%20FILES/New%20folder%20(3)/javabykiran-Selenium-Softwares/javabykiran-Selenium-Softwares/Offline%20Website/pages/examples/users.html");
		driver.manage().window().maximize();
		
		//1) how many rows in table
		int rows=driver.findElements(By.xpath("//table[@class=\"table table-hover\"]/tbody/tr")).size();
		System.out.println("total number of rows are:-  "+rows);
		
		//20 how many columns
		int cols=driver.findElements(By.xpath("//table[@class=\"table table-hover\"]/tbody/tr/th")).size();
		System.out.println("total number of columns are:-  "+cols);
		
		
		//TO ITERATE THE WHOLE TABLE
		for(int i=2;i<=rows;i++){
			
			for(int j=1;j<=cols;j++) {
				
				String value=driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.print(value+"  ");
			}
		System.out.println();
		}
		
		
		for(int i=2;i<=rows; i++) {
			
			String name=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
			if(name.equals("Monica")) {
				
				String email=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText();
				String course=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();
				
				System.out.println(email+"    "+ course + "    ");
			}
			
		}
		
		
		
		
	}
		
	}


