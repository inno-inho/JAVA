package Ch06;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

// 크롬서버.jar 다운로드 경로(셀레니움 공식 홈페이지)
// https://www.selenium.dev/downloads/

// 크롬드라이브 다운로드 경로
// https://googlechromelabs.github.io/chrome-for-testing/#stable

public class C10SelenumApiMain {
	private static final String WEB_DRIVER_ID = "webdriver.chrome.driver";
	private static final String WEB_DRIVER_PATH = "src/Drivers/chromedriver.exe";		//  drivers 파일이 있는 위치
	
	public static void main(String[] args) {
		// Selenum 3.x 기준 브라우저 활성화 방법(4.x부터는 chromedriver.exe를 윈도우 path에 등록시 경로설정 필요없음)
		System.setProperty(WEB_DRIVER_ID, WEB_DRIVER_PATH);
		// 크롬브라우저 옵션 설정
		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--headless");			// 백그라운드 실행
//		options.addArguments("--no-sandbox");		// 리눅스환경 sendbox 사용 여부
		
		
		// 크롬부라우저 활성화
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.naver.com");
		
		// 특정 요소 위치 선택(키워드 입력하기)
		WebElement searchEl = driver.findElement(By.id("query"));		// id가 query인 위치 특정	-> 검색창
		
		// 키워드 입력
		searchEl.sendKeys("모니터");
		
		// 엔터키 전달
		searchEl.sendKeys(Keys.RETURN);		// Keys.RETURN == enter키
		
		// 쇼핑버튼 클릭(.api_flicking_wrap .tab:nth-child(1) -> 쇼핑버튼의 선택자 )
		WebElement shoppingBtnEl = driver.findElement(By.cssSelector(".api_flicking_wrap .tab:nth-child(1)"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].removeAttribute('target')", shoppingBtnEl);
		shoppingBtnEl.click();
		
		// 리뷰 좋은 순 클릭(.subFilter_sort_4Q_hb._nlog_click._nlog_impression_element)
		WebElement reviewBtnEl = driver.findElement(By.cssSelector(".subFilter_sort_4Q_hb._nlog_click._nlog_impression_element"));
		reviewBtnEl.click();
		
		
//		driver.close();				// 창 닫기
	}

}
