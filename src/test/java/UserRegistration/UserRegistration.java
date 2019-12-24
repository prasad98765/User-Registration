package UserRegistration;

public class UserRegistration {


    public boolean checkFirstName(String name) {
        return ((name.matches("^[A-Z]{1}[a-zA-Z]{2,}$")));
    }
}
