import UserRegistration.UserRegistration;
import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    @Test
    public void whenGivenName_CheckFirstCharCapital_ShouldReturnBoolean() {
        UserRegistration checkUserRegistration  = new UserRegistration();
        Assert.assertTrue(checkUserRegistration.checkFirstName("Prasad"));
    }

    @Test
    public void whenGivenName_CheckFirstCharNotCapital_ShouldReturnBoolean() {
        UserRegistration checkUserRegistration = new UserRegistration();
        Assert.assertFalse(checkUserRegistration.checkFirstName("prasad"));
    }

    @Test
    public void whenGivenLastName_CheckFirstCharCapital_ShouldReturnBoolean() {
        UserRegistration checkUserRegistration  = new UserRegistration();
        Assert.assertTrue(checkUserRegistration.checkLastName("Chaudhari"));
    }

    @Test
    public void whenGivenLastName_CheckFirstCharNotCapital_ShouldReturnBoolean() {
        UserRegistration checkUserRegistration = new UserRegistration();
        Assert.assertFalse(checkUserRegistration.checkLastName("chaudhari"));
    }

    @Test
     public void whenGivenEmail_CheckEmailValid_ShouldReturnBoolean() {
        UserRegistration checkUserRegistration  = new UserRegistration();
        Assert.assertTrue(checkUserRegistration.checkEmail("abc.xyz@bl.co.in"));
    }

    @Test
    public void whenGivenEmail_CheckEmailInvalid_ShouldReturnBoolean() {
        UserRegistration checkUserRegistration  = new UserRegistration();
        Assert.assertFalse(checkUserRegistration.checkEmail("abc123@.com"));
    }
}
