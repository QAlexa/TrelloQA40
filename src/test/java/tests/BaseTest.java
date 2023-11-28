package tests;

import dto.UserDtoLombok;
import manager.ApplicationManager;
import manager.LoginHelper;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


public class BaseTest {
    static ApplicationManager app = new ApplicationManager();
    LoginHelper loginHelper = new LoginHelper();

    UserDtoLombok user = UserDtoLombok.builder()
            .email("av.abramzon@gmail.com")
            .password("123456Aa$")
            .build();
    @BeforeSuite(alwaysRun = true)
    public void preconditions() {
        ApplicationManager.init();
    }
    @AfterSuite(alwaysRun = true)
    public void postConditions() {
       ApplicationManager.tearDown();
    }
}
