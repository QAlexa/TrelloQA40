package tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class DeleteBoardTest extends BaseTest {
    @BeforeClass
    public void beforeClass(){
        loginHelper.Login(user);
    }

    @AfterClass
    public void afterClass(){
        logoutHelper.logout();
    }

}
