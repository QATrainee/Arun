


import java.util.Calendar;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class phppage {

    @Test

    public void testDAtePicker() throws Exception{

        //DAte and Time to be set in textbox

      // String date ="12/07/2014 ";
        
        System.setProperty("webdriver.gecko.driver","D:\\arun\\geckodriver.exe");
    	

        WebDriver driver = new FirefoxDriver();

        driver.manage().window().maximize();
        
        driver.get("http://www.phptravels.net/");
       driver.findElement(By.xpath(".//*[@id='s2id_autogen3']/a/span[1]")).click();
//Thread.sleep(1000);
        driver.findElement(By.xpath(".//*[@id='select2-drop']/div/input")).sendKeys("sin");
        Thread.sleep(3000);
       // driver.navigate().to("select2-chosen");
        Actions act = new Actions(driver);
     WebElement d = driver.findElement(By.xpath(".//*[@id='select2-drop']"));
     act.moveToElement(d);
     act.click().build().perform();
     Thread.sleep(3000);
       // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);*/
        
       // WebDriverWait wait = new WebDriverWait(driver, 30);
        
      /* Actions act = new Actions(driver);
      
       act.clickAndHold(driver.findElement(By.className("select2-chosen"))).perform();
       
      */
       //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        
        //button to open calendar
     driver.findElement(By.xpath("html/body/div[14]/div[1]/table/thead/tr[1]/th[2]")).click();

       WebElement selectDate = driver.findElement(By.xpath("html/body/div[14]/div[1]/table/tbody/tr[3]/td[4]"));
        
        
    selectDate.click();

    //button to move next in calendar

   /* WebElement nextLink = driver.findElement(By.xpath("html/body/div[13]/div[1]/table/thead/tr[1]/th[3]"));

    //button to click in center of calendar header

    WebElement midLink = driver.findElement(By.xpath("html/body/div[13]/div[1]/table/thead/tr[1]/th[2]"));

    //button to move previous month in calendar

    WebElement previousLink = driver.findElement(By.xpath("html/body/div[13]/div[1]/table/thead/tr[1]/th[1]")); 

        //Split the date time to get only the date part

        String date_dd_MM_yyyy[] =(date.split(" ")[0]).split("/");


        //get the year difference between current year and year to set in calander

        int yearDiff = Integer.parseInt(date_dd_MM_yyyy[2])- Calendar.getInstance().get(Calendar.YEAR);

        midLink.click();
        driver.findElement(By.xpath("html/body/div[8]/div/div[2]/div[2]/a/div/div[1]/div/div/img[2]")).click();

        if(yearDiff!=0){

            //if you have to move next year

            if(yearDiff>0){

                for(int i=0;i< yearDiff;i++){

                    System.out.println("Year Diff->"+i);

                    nextLink.click();

                }

            }

            //if you have to move previous year

            else if(yearDiff<0){

                for(int i=0;i< (yearDiff*(-1));i++){

                    System.out.println("Year Diff->"+i);

                    previousLink.click();

                }

            }

        }
        
        Thread.sleep(1000);

        //Get all months from calendar to select correct one

        List<WebElement> list_AllMonthToBook = driver.findElements(By.xpath("html/body/div[13]/div[2]/table/thead/tr/th[2]"));
        
        list_AllMonthToBook.get(Integer.parseInt(date_dd_MM_yyyy[1])-1).click();
        
        Thread.sleep(1000);

        //get all dates from calendar to select correct one

      //  List<WebElement> list_AllDateToBook = driver.findElements(By.xpath("//div[@id='datetimepicker_dateview']//table//tbody//td[not(contains(@class,'k-other-month'))]"));
        
       // list_AllDateToBook.get(Integer.parseInt(date_dd_MM_yyyy[0])-1).click();
        
        ///FOR TIME

       // WebElement selectTime = driver.findElement(By.xpath("//span[@aria-controls='datetimepicker_timeview']"));

        //click time picker button

        //.click();

        //get list of times

        //List<WebElement> allTime = driver.findElements(By.xpath("//div[@data-role='popup'][contains(@style,'display: block')]//ul//li[@role='option']"));
      
        date = date.split(" ")[1]+" "+date.split(" ")[2];

     //select correct time

       // for (WebElement webElement : allTime) {

         //   if(webElement.getText().equalsIgnoreCase(date))

        //    {

         //       webElement.click();

         //   }

      //  }
*/
    }

}