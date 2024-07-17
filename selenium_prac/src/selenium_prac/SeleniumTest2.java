package selenium_prac;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		// 증권사 페이지에서 시작
		driver.get("https://finance.naver.com/");
		
//		/html/body/div[2]/div[1]/div/div[2]/div[1]/form/input[1]
		
		WebElement searchBar = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/div[1]/form/input[1]"));;
		searchBar.sendKeys("삼성전자");
		
		searchBar.sendKeys(Keys.ENTER);
	}

}
