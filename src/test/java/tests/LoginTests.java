package tests;

import dto.UserDto;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {

    @Test
    public void LoginPositiveUserDto() {
        UserDto user = new UserDto("av.abramzon@gmail.com","123456Aa$");
        loginHelper.LoginUserDto(user);
        Assert.assertTrue(loginHelper.validateTextBoardsExist());

    }
}
