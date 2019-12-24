package UserRegistration;

public class UserRegistration {

    public boolean checkFirstName(String firstname) {
        return ((firstname.matches("^[A-Z]{1}[a-zA-Z]{2,}$")));
    }

    public boolean checkLastName(String lastname) {
        return  ((lastname.matches("^[A-Z]{1}[a-zA-Z]{2,}$")));
    }

}
