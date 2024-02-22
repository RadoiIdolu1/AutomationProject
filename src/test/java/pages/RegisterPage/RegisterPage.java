package pages.RegisterPage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;



public class RegisterPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(RegisterPage.class);
    public static RegisterPage instance;


    private RegisterPage() {

    }

    public static RegisterPage getInstance() {
        if (instance == null) {
            instance = new RegisterPage();
        }
        return instance;
    }

    private By inputFirstName = By.xpath("//input[@ng-model='FirstName']");
    private By inputLastName = By.xpath("//input[@ng-model='LastName']");
    private By consent = By.xpath("//p[text()='Consent']");
    private By address = By.xpath("//textarea[@ng-model='Adress']");
    private By emailAdr = By.xpath("//input[@ng-model='EmailAdress']");
    private By phone =By.xpath("//input[@ng-model='Phone']") ;
    private By male = By.xpath("//input[@type='radio' and @value='Male']");
    private By movies =By.id("checkbox2");
    private By hockey =By.id("checkbox3");
    private By language = By.id("msdd");
    //private By inputCo = By.xpath("//span[@class='select2-selection__rendered']");
    //private By country = By.xpath("//input[@class='select2-search__field']");




    public void insertFullName(String fName, String lName){
        LOG.info("Inserts the full name");
        driver.findElement(inputFirstName).sendKeys(fName);
        driver.findElement(inputLastName).sendKeys(lName);
    }

    public void pressConsent(){
        LOG.info("Press consent");
        driver.findElement(consent).click();
    }

    public void insertAddress(String addr) {
        LOG.info("Insert address");
        driver.findElement(address).sendKeys(addr);
    }

    public void insertEmail(String email){
        LOG.info("Insert the email");
        driver.findElement(emailAdr).sendKeys(email);
    }

    public void insertPhone (String phonenr){
        LOG.info("Insert th ehpone number");
        driver.findElement(phone).sendKeys(phonenr);
    }

    public void checkMale() {
        LOG.info("Check male button");
        driver.findElement(male).click();
    }

    public void checkHobbies(){
        LOG.info("Check hobbies");
        driver.findElement(movies).click();
        driver.findElement(hockey).click();
    }

    /*public void clickCountry(){
        LOG.info("Click the country");
        driver.findElement(inputCo).click();
    }

    public void selectCountry(String co){
        LOG.info("Insert the country");
        driver.findElement(country).sendKeys(co);
    }

     */


}
