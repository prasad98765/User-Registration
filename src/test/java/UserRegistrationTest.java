import UserRegistration.UserRegistration;
import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {

    public static UserRegistration checkUserRegistration  = new UserRegistration();
    @Test
    public void whenGivenName_CheckFirstCharCapital_ShouldReturnBoolean() {
        Assert.assertTrue(checkUserRegistration.checkFirstName("Prasad"));
    }

    @Test
    public void whenGivenName_CheckFirstCharNotCapital_ShouldReturnBoolean() {
        Assert.assertFalse(checkUserRegistration.checkFirstName("prasad"));
    }

    @Test
    public void whenGivenLastName_CheckFirstCharCapital_ShouldReturnBoolean() {
        Assert.assertTrue(checkUserRegistration.checkLastName("Chaudhari"));
    }

    @Test
    public void whenGivenLastName_CheckFirstCharNotCapital_ShouldReturnBoolean() {
        Assert.assertFalse(checkUserRegistration.checkLastName("chaudhari"));
    }

    @Test
     public void whenGivenEmail_CheckEmailValid_ShouldReturnBoolean() {
        Assert.assertTrue(checkUserRegistration.checkEmail("abc.xyz@bl.co.in"));
    }

    @Test
    public void whenGivenEmail_CheckEmailInvalid_ShouldReturnBoolean() {
        Assert.assertFalse(checkUserRegistration.checkEmail("abc123@.com"));
    }

    @Test
    public void whenGivenMobileNumber_CheckMobileNumberValid_ShouldReturnBoolean() {
        Assert.assertTrue(checkUserRegistration.checkMobileNumber("+91 7798917132"));
    }

    @Test
    public void whenGivenMobileNumber_CheckMobileNumberNotValid_ShouldReturnBoolean() {
        Assert.assertFalse(checkUserRegistration.checkMobileNumber("+9 7798917132"));
    }

    @Test
    public void whenGivenPassword_CheckEightCharacters_ShouldReturnBoolean() {
        Assert.assertTrue(checkUserRegistration.checkPassword("asdF$123"));
    }

    @Test
    public void whenGivenPassword_CheckNotEightCharacters_ShouldReturnBoolean() {
        Assert.assertFalse(checkUserRegistration.checkPassword("asd123"));
    }

    @Test
    public void whenGivenPassword_CheckAtleastOneUpperCase_ShouldReturnBoolean() {
        Assert.assertTrue(checkUserRegistration.checkPassword("abcdE$12"));
    }

    @Test
    public void whenGivenPassword_CheckWithoutUpperCase_ShouldReturnBoolean() {
        Assert.assertFalse(checkUserRegistration.checkPassword("asdf123"));
    }

    @Test
    public void whenGivenPassword_CheckOneNumericNumber_ShouldReturnBoolean() {
        Assert.assertTrue(checkUserRegistration.checkPassword("asdF$124"));
    }

    @Test
    public void whenGivenPassword_CheckWithoutNumericNumber_ShouldReturnBoolean() {
        Assert.assertFalse(checkUserRegistration.checkPassword("asdF"));
    }

}
