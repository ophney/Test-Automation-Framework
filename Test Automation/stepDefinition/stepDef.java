package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.Iterator;
import java.util.Set;

public class stepDef {
    WebDriver driver;

    @Given("^User navigate to wamly landing page$")
    public void user_navigate_to_wamly_landing_page() throws Throwable {
        System.setProperty("webdriver.chrome.driver","/home/cmdq3/IdeaProjects/chromedriver_linux64/chromedriver");
        driver= new ChromeDriver();
        driver.get("https://ui.uatwamly.co.za/");
        driver.manage().window().maximize();
    }

    @When("^user log in using username (.+) and password (.+)$")
    public void user_log_in_using_username_and_password(String username, String password) throws Throwable {
        //System.out.println(driver);
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        //id="login-btn7"
        Thread.sleep(5000);

    }

    @Then("^home page is displayed$")
    public void home_page_is_displayed() throws Throwable {
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id='root']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/nav[1]/ul[1]/li[7]/a[1]/span[1]")).click();
    }

    @When("^user selects the user to edit using email (.+)$")
    public void user_selects_the_user_to_edit_using_email(String email) throws Throwable {
        Thread.sleep(5000);
        //driver.findElement(By.xpath("//*[@id=\"myGrid\"]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/div[3]/div[5]/div[1]/button[1]/span[1]")).click();

        //driver.findElement(By.xpath("//*[@id=\"long-menu\"]/div[1]")).click();
        int usersLength = driver.findElements(By.xpath("//*[@id=\"myGrid\"]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/div")).size();

        for(int z = 1; z< usersLength; z++){
            //System.out.println(driver.findElement(By.xpath("//*[@id=\"myGrid\"]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/div["+z+"]/div[2]")).getText());
            System.out.println(driver.findElement(By.xpath("//*[@id=\"myGrid\"]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/div["+z+"]/div[2]")).getText());
            String emaill = driver.findElement(By.xpath("//*[@id=\"myGrid\"]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/div["+z+"]/div[2]")).getText();
            if(emaill.equals(email)){
                driver.findElement(By.xpath("//*[@id=\"myGrid\"]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/div["+z+"]/div[5]/div[1]/button[1]/span[1]")).click();
                Thread.sleep(2000);
                driver.findElement(By.xpath("//*[@id=\"long-menu\"]/div[3]/ul[1]/li[1]")).click();
                break;
            }

        }
    }

    @Then("^user enters firstname (.+), lastname (.+), mobile number (.+), role (.+) and department (.+)$")
    public void user_enters_firstname_lastname_mobile_number_role_and_department(String firstname, String lastname, String mobilenumber, String role, String department) throws Throwable {
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/main[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).clear();
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/main[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys(firstname);
          Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/main[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[2]/input[1]")).clear();
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/main[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[2]/input[1]")).sendKeys(lastname);
          Thread.sleep(5000);


       driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/main[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[2]/input[1]")).clear();
        Thread.sleep(5000);
       driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/main[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[2]/input[1]")).sendKeys(mobilenumber);
        Thread.sleep(5000);

          driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/main[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[3]/div[1]/div[3]/span[1]/label[1]/span[1]")).click();
          Thread.sleep(5000);
    }

    @And("^user clicks the update button$")
    public void user_clicks_the_update_button() throws Throwable {
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/main[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]")).click();



//        Thread.sleep(5000);
//        driver.findElement(By.xpath("//*[@id=\"myGrid\"]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/div[2]/div[5]/div[1]/button[1]/span[1]")).click();
//
//        driver.findElement(By.xpath("//*[@id=\"long-menu\"]/div[3]/ul[1]/li[1]")).click();
    }
    @And("^user clicks the Edit button (.+)$")
    public void user_clicks_the_edit_button(String email) throws Throwable {
        Thread.sleep(5000);
        //driver.findElement(By.xpath("//*[@id=\"myGrid\"]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/div[3]/div[5]/div[1]/button[1]/span[1]")).click();

        //driver.findElement(By.xpath("//*[@id=\"long-menu\"]/div[1]")).click();
        int usersLength = driver.findElements(By.xpath("//*[@id=\"myGrid\"]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/div")).size();

        for(int z = 1; z< usersLength; z++) {
            //System.out.println(driver.findElement(By.xpath("//*[@id=\"myGrid\"]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/div["+z+"]/div[2]")).getText());
            System.out.println(driver.findElement(By.xpath("//*[@id=\"myGrid\"]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/div[" + z + "]/div[2]")).getText());
            String emaill = driver.findElement(By.xpath("//*[@id=\"myGrid\"]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/div[" + z + "]/div[2]")).getText();
            if (emaill.equals(email)) {
                driver.findElement(By.xpath("//*[@id=\"myGrid\"]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/div[" + z + "]/div[5]/div[1]/button[1]/span[1]")).click();
                Thread.sleep(2000);
                driver.findElement(By.xpath("//*[@id=\"long-menu\"]/div[3]/ul[1]/li[1]")).click();
                break;
            }
        }
        Thread.sleep(5000);
    }

    @Then("^user checks if firstname (.+) is updated$")
    public void user_checks_if_firstname_is_updated(String firstname) throws Throwable {
        String name = driver.findElement(By.name("name")).getAttribute("value");
        System.out.println(name+ " is the name");
        Assert.assertEquals(name,firstname);

    }

    @And("^user checks if lastname (.+) is updated$")
    public void user_checks_if_lastname_is_updated(String lastname) throws Throwable {
        Thread.sleep(5000);
        String surname = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/main[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[2]/input[1]")).getAttribute("value");
        System.out.println(surname+ " is the surname");
        Assert.assertEquals(surname,lastname);
    }

    @And("^user checks if mobile number (.+) is updated$")
    public void user_checks_if_mobile_number_is_updated(String mobilenumber) throws Throwable {
        String number = driver.findElement(By.name("phone")).getAttribute("value");
        System.out.println(number+ " is the number");
        Assert.assertEquals(number,mobilenumber);
    }

    @And("^user checks if role (.+) is updated$")
    public void user_checks_if_role_is_updated(String role) throws Throwable {
        boolean isSystemManger = driver.findElement(By.id("roleStatus1")).isSelected();
        boolean isAdministrator = driver.findElement(By.id("roleStatus2")).isSelected();
        boolean isRater = driver.findElement(By.id("roleStatus3")).isSelected();

        System.out.println(isSystemManger);
        System.out.println(isAdministrator);
        System.out.println(isRater);

        switch (role){
            case "System Manger":
                Assert.assertTrue(isSystemManger);
                break;
            case "Administrator":
                Assert.assertTrue(isAdministrator);
                break;
            case "Rater":
                Assert.assertTrue(isRater);
                break;
        }
    }

    @And("^user checks if department (.+) is updated$")
    public void user_checks_if_department_is_updated(String department) throws Throwable {

    }



}
