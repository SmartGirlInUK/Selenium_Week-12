package uk.co.library.testsuite;

import uk.co.library.testbase.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import resources.testdata.TestData;

public class JobSearchTest extends TestBase {
    @Test(dataProvider = "JobSearchData", dataProviderClass = TestData.class)

    public void JobSearch(String jobTitle, String location, String distance, String salaryMin,
                          String salaryMax, String salaryType, String jobType, String result) throws InterruptedException {
        driver.switchTo().frame("gdpr-consent-notice");
        clickOnElement(By.cssSelector("button#save"));
        driver.switchTo().defaultContent();
        clickOnElement(By.id("toggle-hp-search"));
        sendTextToElement(By.id("keywords"),jobTitle);
        sendTextToElement(By.id("location"),location);
        selectByValueFromDropDown(By.id("distance"),distance);
        sendTextToElement(By.id("salarymin"),salaryMin);
        sendTextToElement(By.id("salarymax"),salaryMax);
        selectByVisibleTextFromDropDown(By.id("salarytype"),salaryType);
        selectByVisibleTextFromDropDown(By.id("tempperm"),jobType);
        clickOnElement(By.id("hp-search-btn"));
        String resultText=jobType+" "+jobTitle+" jobs in "+location;
        Assert.assertEquals(resultText,result);
    }
}
