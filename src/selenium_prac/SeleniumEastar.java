package selenium_prac;

import java.util.ArrayList;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumEastar {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        // 땡처리 이스타항공 페이지에서 시작
        driver.get("https://www.eastarjet.com/newstar/PGWBA00001");

        // 출발지
        WebElement departure = driver.findElement(By
                .xpath("/html/body/div[1]/div[4]/div/div[1]/section/article/div[4]/div/div[2]/div/div[1]/dl[1]/dd/a"));
        departure.click();
        Thread.sleep(1000);

        WebElement CJJ = driver.findElement(By.xpath(
                "/html/body/div[1]/div[4]/div/div[5]/div[2]/div[2]/div/div/div/div[2]/ul/li[1]/div/div/dl[1]/dd[4]/a"));
        CJJ.click();
        Thread.sleep(1000);

        // 도착지
        WebElement arrival = driver.findElement(By.xpath(
                "/html/body/div[1]/div[4]/div/div[5]/div[2]/div[2]/div/div/div/div[2]/ul/li[2]/div/div/dl[1]/dd/a"));
        arrival.click();

        WebElement click1 = driver
                .findElement(By.xpath("/html/body/div[1]/div[4]/div/div[5]/div[2]/div[2]/div/div/div/div[3]/a"));
        click1.click();
        Thread.sleep(1000);

        // 날짜버튼 (19~21)
        WebElement date1 = driver.findElement(By.xpath(
                "/html/body/div[1]/div[4]/div/div[6]/div[2]/div[2]/div/div[1]/div[3]/table[1]/tbody/tr[3]/td[6]/span/a[1]"));
        date1.click();

        WebElement date2 = driver.findElement(By.xpath(
                "/html/body/div[1]/div[4]/div/div[6]/div[2]/div[2]/div/div[1]/div[3]/table[1]/tbody/tr[4]/td[1]/span/a[1]"));
        date2.click();

        WebElement date3 = driver
                .findElement(By.xpath("/html/body/div[1]/div[4]/div/div[6]/div[2]/div[2]/div/div[2]/a[2]"));
        date3.click();
        Thread.sleep(1000);

        // 탑승인원 선택
        WebElement people = driver.findElement(
                By.xpath("/html/body/div[1]/div[4]/div/div[7]/div[2]/div[2]/div/div/div/div[1]/div[1]/div/a[2]"));
        people.click();
        people.click();

        WebElement click2 = driver
                .findElement(By.xpath("/html/body/div[1]/div[4]/div/div[7]/div[2]/div[2]/div/div/div/div[3]/a[2]"));
        click2.click();

        // 항공편 조회 버튼 클릭
        WebElement click3 = driver
                .findElement(By.xpath("/html/body/div[1]/div[4]/div/div[1]/section/article/div[6]/a"));
        click3.click();
        Thread.sleep(3000);

        Thread.sleep(1500);
        // 항공편 선택 : 가는 편

        List<WebElement> webElementList = driver.findElements(By.xpath(
                "/html/body/div[1]/div[4]/div[1]/section/form/article/div[1]/div[1]/div/div[1]/div/div[2]/table/tbody/tr"));

        List<String> moneyList = new ArrayList<>();

        int i = 1;
        // WebElement 리스트를 순회하며 가격 정보 추출
        for (WebElement webElement : webElementList) {

            System.out.println(webElementList.size());

            // 텍스트 추출
            String text = webElement.getText();
//            /html/body/div[1]/div[4]/div[1]/section/form/article/div[1]/div[1]/div/div[1]/div/div[2]/table/tbody
            System.out.println(webElement);

            /// html/body/div[1]/div[4]/div[1]/section/form/article/div[1]/div[1]/div/div[1]/div/div[2]/table/tbody/tr[1]/td[3]/label/span[2]
            /// html/body/div[1]/div[4]/div[1]/section/form/article/div[1]/div[1]/div/div[1]/div/div[2]/table/tbody/tr[3]/td[3]/label/span[2]
            //// html/body/div[1]/div[4]/div[1]/section/form/article/div[1]/div[1]/div/div[1]/div/div[2]/table/tbody/tr[5]/td[3]/label/span[2]
            /// html/body/div[1]/div[4]/div[1]/section/form/article/div[1]/div[1]/div/div[1]/div/div[2]/table/tbody/tr[7]/td[3]/label/span[2]
            /// html/body/div[1]/div[4]/div[1]/section/form/article/div[1]/div[1]/div/div[1]/div/div[2]/table/tbody/tr[9]/td[3]/label/span[2]
            WebElement element = driver.findElement(By.xpath(
                    "html/body/div[1]/div[4]/div[1]/section/form/article/div[1]/div[1]/div/div[1]/div/div[2]/table/tbody/tr["
                            + i + "]/td[3]/label/span[2]"));

            System.out.println(element.getText());

            String prevNumber = element.getText();
            int number = Integer.parseInt(prevNumber.replace(",", ""));

            if (number < 30000) {
                element.click();
                // 닫기 버튼
                Thread.sleep(500);
                WebElement closeButton = driver
                        .findElement(By.xpath("/html/body/div[1]/div[4]/div[35]/div[2]/div[2]/ul/li/a"));
                closeButton.click();
                break;

            }

            i += 2;
        }

        int j = 1;

        /// html/body/div[1]/div[4]/div[1]/section/form/article/div[1]/div[1]/div/div[2]/div/div[2]/table/tbody/tr[1]/td[3]/label/span[2]
        /// html/body/div[1]/div[4]/div[1]/section/form/article/div[1]/div[1]/div/div[2]/div/div[2]/table/tbody/tr[3]/td[3]/label/span[2]

        for (WebElement webElement : webElementList) {

            System.out.println(webElementList.size());

            // 텍스트 추출
            String text = webElement.getText();
            System.out.println(webElement);

            WebElement element = driver.findElement(By.xpath(
                    "html/body/div[1]/div[4]/div[1]/section/form/article/div[1]/div[1]/div/div[2]/div/div[2]/table/tbody/tr["
                            + j + "]/td[3]/label/span[2]"));
            System.out.println(element.getText());

            String prevNumber = element.getText();
            int number = Integer.parseInt(prevNumber.replace(",", ""));

            if (number < 30000) {
                element.click();
                // 닫기 버튼
                Thread.sleep(500);
                WebElement closeButton = driver
                        .findElement(By.xpath("/html/body/div[1]/div[4]/div[35]/div[2]/div[2]/ul/li/a"));
                closeButton.click();
                break;

            }

            j += 2;
        }

        WebElement click4 = driver
                .findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/section/form/article/div[2]/ul/li[2]/a"));
        click4.click();
        Thread.sleep(1000);

    }
}
