package tests.RegisterTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import pages.BasePage;
import tests.BaseTest;

import static pages.BasePage.driver;
import static pages.BasePage.getBaseUrl;
import static pages.BasePage.sleep;


public class RegisterTest extends BaseTest {
    public static final Logger LOG = LoggerFactory.getLogger(RegisterTest.class);
    private String newUrl = getBaseUrl() + "Register.html";
    String fName ="Popescu";
    String lName ="Ion";
    String addr = "Bulevardul Unirii, bloc E9";
    String email = "RadoiIdolu1@gmail.com";
    String phonenr ="0765896456";
    String co ="Australia";


    @Test
    public void fillRegister(){
        driver.get(newUrl);
        LOG.info("Press the consent button");
        registerPage.pressConsent();

        LOG.info("Insert the names");
        registerPage.insertFullName(fName,lName);

        LOG.info("Insert the address");
        registerPage.insertAddress(addr);

        LOG.info("Insert the email adress");
        registerPage.insertEmail(email);

        LOG.info("Insert the phone number");
        registerPage.insertPhone(phonenr);

        LOG.info("Check male");
        registerPage.checkMale();

        LOG.info("Check hobbies");
        registerPage.checkHobbies();

        //LOG.info("Click the country button");
       // registerPage.clickCountry();

        //LOG.info("Insert the country name");
        //registerPage.selectCountry(co);

    }
}
