package selenium_prac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest1 {

	public static void main(String[] args) {
		// 사용할 크롬드라이버를 불러오기
		WebDriver driver = new ChromeDriver();
		
		// 드라이버를 이용해서 페이지를 열기
		driver.get("https://www.naver.com/");
		//#shortcutArea > ul > li:nth-child(6) > a
//		WebElement financeButton = driver.findElement(By.cssSelector("#shortcutArea > ul > li:nth-child(6) > a"));
		
//		System.out.println(financeButton);
		
		// xpath : HTML 문서의 구조를 보여주는 패스 -> 태그의 경로를 알려줌'
		// full xpath : html 최상단에서부터 모든걸 가져옴.
		// /html/body/div[2]/div[1]/div/div[6]/ul/li[6]/a
		WebElement financeButton = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[6]/ul/li[6]/a"));
		
		// element에 click 명령을 내림.
		financeButton.click();
	}

}
