package tests;

import dto.UserDto;
import dto.UserDtoWith;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {

    @AfterMethod
    public void preConditions() {
        //if login to do logout
        //if error sign up - just go to main page

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
    @Test
    public void PositiveLogin() {
    loginHelper.Login(user);
    Assert.assertTrue(loginHelper.validateTextBoardsExist());

    }
    @Test
    public void NegativeEmailValidTest() {
        loginHelper.clickBtnLoginMainPage();
        loginHelper.printEmailForLogin("av.abramzn@gmail.com");
        loginHelper.clickBtnSubmitEmailForLogin(user);
        Assert.assertTrue(loginHelper.validateTextSignUpH5Displays());

    }
}
