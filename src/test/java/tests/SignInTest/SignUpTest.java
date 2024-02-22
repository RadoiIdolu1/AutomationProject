package tests.SignInTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import pages.SignInPage.SignInPage;
import tests.BaseTest;

public class SignUpTest extends BaseTest {
    public static final Logger LOG = LoggerFactory.getLogger(SignUpTest.class);

    @Test
    public void signUp() {
        String email="RadoiIdolu1@gmail.com";

    LOG.info("input email address");
        signInPage.emailSignUp(email);

        LOG.info("Press the 'Sign Up' button");
        signInPage.signUpButton();
    }

}