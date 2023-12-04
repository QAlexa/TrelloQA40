package tests;

import dto.UserDto;
import dto.UserDtoWith;
import manager.ApplicationManager;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class LoginTests extends BaseTest {

    @AfterMethod(alwaysRun = true)
    public void postCondAfterMethod(Method method) {
        if (flagNeedLogout) {
            logoutHelper.logout();
            flagNeedLogout = false;
            logger.info("flagNeedLogout = " + flagNeedLogout);
            logger.info("method info: " + method.getName());
        } else if (flagNeedOpenMainPage) {
            ApplicationManager.navigateToMainPage();
            flagNeedOpenMainPage = false;
            logger.info("flagNeedOpenMainPage = " + flagNeedOpenMainPage);
        }
    }
//    @Test
//    public void LoginPositiveUserDto() {
//        UserDto user = new UserDto("av.abramzon@gmail.com","123456Aa$");
//        loginHelper.LoginUserDto(user);
//        Assert.assertTrue(loginHelper.validateTextBoardsExist());
//
//    }

//    @Test
//    public void LoginPositiveUserDtoWith(){
//        UserDtoWith userWith = new UserDtoWith()
//                .withEmail("av.abramzon@gmail.com")
//                .withPassword("123456Aa$");
//        loginHelper.LoginUserDtoWith(userWith);
//        Assert.assertTrue(loginHelper.validateTextBoardsExist());
//    }

    // if login todo logout
    //if error sign up - just go to main page

        @Test
        public void PositiveLogin () {
            loginHelper.Login(user);
            Assert.assertTrue(loginHelper.validateTextBoardsExist());

        }
        @Test
        public void negativeEmailValidNotExistTest () {
            loginHelper.clickBtnLoginMainPage();
            loginHelper.printEmailForLogin("av.abramzn@gmail.com");
            loginHelper.clickBtnSubmitEmailForLogin(user);
            flagNeedOpenMainPage = true;
            logger.info("FlagNeedOpenMainPage" + flagNeedOpenMainPage);
            Assert.assertTrue(loginHelper.validateTextSignUpH5Displays());

        }
    }

