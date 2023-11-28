package manager;

import dto.UserDto;
import dto.UserDtoLombok;
import dto.UserDtoWith;
import org.openqa.selenium.By;

public class LoginHelper extends BaseHelper {
//    clickBase(By.xpath("//a[contains(@data-uuid, 'login')]"));
//    sendKeysBase(By.xpath("//input[@id='username']"), "juliagordyin@gmail.com");
//    clickBase(By.xpath("//button[@id='login-submit']"));
//    sendKeysBase(By.xpath("//input[@id='password']"), "123456Aa$");
//    clickBase(By.xpath("//button[@id='login-submit']"));
//    String boardText = driver.findElement(By.xpath("//span[text()='Boards']")).getText();
//        Assert.assertEquals(boardText, "Boards", "text not Boards");

    By btnLoginMainPage = By.xpath("//a[contains(@data-uuid, 'login')]");
    By inputEmail = By.xpath("//input[@id='username']");
    By btnSubmitEmailPassword = By.xpath("//button[@id='login-submit']");
    By inputPassword = By.xpath("//input[@id='password']");
    By textBoards = By.xpath("//span[text()='Boards']");
    By textH5SignUp = By.xpath("//h5[.='Sign up to continue']");


    public boolean validateTextBoardsExist() {

        return isTextActualEqualToExpected(textBoards, "Boards");
    }
    public  boolean validateTextSignUpH5Displays() {
        return isTextActualEqualToExpected(textH5SignUp,"Sign up to continue");
    }
    public void Login(UserDtoLombok user){

       // clickBase(btnLoginMainPage);
        clickBtnLoginMainPage();

        //sendKeysBase(inputEmail, user.getEmail());
        printEmailForLogin(user.getEmail());

       // clickBase(btnSubmitEmailPassword);
        clickBtnSubmitEmailForLogin(user);

        //sendKeysBase(inputPassword, user.getPassword());
        printPasswordForLogin(user.getPassword());

       // clickBase(btnSubmitEmailPassword);
        clickBtnSubmitEmailPassword(user);

}
public void clickBtnLoginMainPage() {
    clickBase(btnLoginMainPage);
}
public void printEmailForLogin(String email) {
    sendKeysBase(inputEmail, email);
}

public void printPasswordForLogin(String password) {
    sendKeysBase(inputPassword,password);
}

public void clickBtnSubmitEmailForLogin(UserDtoLombok user) {
    clickBase(btnSubmitEmailPassword);
}
public void clickBtnSubmitEmailPassword(UserDtoLombok user) {
    clickBase(btnSubmitEmailPassword);
}



//    public void LoginUserDto(UserDto user) {
//        clickBase(btnLoginMainPage);
//        sendKeysBase(inputEmail, user.getEmail());
//        clickBase(btnSubmitEmailPassword);
//        sendKeysBase(inputPassword, user.getPassword());
//        clickBase(btnSubmitEmailPassword);
//
//    }

//    public void LoginUserDtoWith(UserDtoWith user) {
//        clickBase(btnLoginMainPage);
//        sendKeysBase(inputEmail, user.getEmail());
//        clickBase(btnSubmitEmailPassword);
//        sendKeysBase(inputPassword, user.getPassword());
//        clickBase(btnSubmitEmailPassword);
//    }


}
