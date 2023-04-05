import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class GoogleSearch extends Parameeter {

	@Test
	public void veifiy_the_search_results() {

		driver.findElement(By.name("q")).sendKeys("mahdi tawalbeh" + Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\"Rzn5id\"]/div/a[2]")).click();

		String search_result = driver.findElement(By.id("result-stats")).getText();
		System.out.println(search_result);
		
		String splitText []=search_result.split(" ");
		
		String theNumOfSearchResult=splitText[1];
		
		String theNumOfSearchResultUpdated=theNumOfSearchResult.replace(",", "");
		
		int actualResult =Integer.parseInt(theNumOfSearchResultUpdated);
		
		int expectedNumber=10;
		
		ass.assertEquals(actualResult, expectedNumber);
		ass.assertAll();
		
	}

}
