package selenium_prac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumSRT {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		//SRT 홈페이지를 열기
		driver.get("https://etk.srail.kr/main.do");
		
//		/html/body/div/div[4]/div[1]/div[2]/div[1]/div[1]/form/fieldset/div[1]/select
		
		// 출발역
		Select departure= new Select(driver.findElement(By.name("dptRsStnCd")));
		
//		System.out.println(departure);
		
		departure.selectByVisibleText("동탄");
		
		// 도착역
		
		Select arrival = new Select(driver.findElement(By.name("arvRsStnCd")));
		
		arrival.selectByValue("0551");
		
		
		
	}

}
