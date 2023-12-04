package tests;

import dto.UserDtoLombok;
import manager.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.*;

import java.lang.reflect.Method;

@Listeners(TestNgListener.class)
public class BaseTest {
    static ApplicationManager app = new ApplicationManager();
    LoginHelper loginHelper = new LoginHelper();
    LogoutHelper logoutHelper = new LogoutHelper();
    BoardsHelper boardsHelper = new BoardsHelper();
    Logger logger = LoggerFactory.getLogger(BaseTest.class);
    UserDtoLombok user = UserDtoLombok.builder()
            .email("av.abramzon@gmail.com")
            .password("123456Aa$")
            .build();

    boolean flagNeedLogout = false;
    boolean flagNeedOpenMainPage = false;
    @BeforeSuite(alwaysRun = true)

    public void preconditions() {
        logger.info("open browser and navigate to main page");
        ApplicationManager.init();
    }
    @AfterSuite(alwaysRun = true)

    public void postConditions() {
       logger.info("close");
        ApplicationManager.tearDown();
    }

    @BeforeMethod(alwaysRun = true)
    public void beforeEachMethod(Method method) {
        logger.info("started method"+method.getName());
    }

    @AfterMethod(alwaysRun = true)
    public void afterEachMethod(Method method){
        logger.info("stopped method" + method.getName());
    }


}
