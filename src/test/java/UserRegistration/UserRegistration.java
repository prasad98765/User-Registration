package UserRegistration;

public class UserRegistration {

    public boolean checkFirstName(String firstname) {
        return ((firstname.matches("^[A-Z]{1}[a-zA-Z]{2,}$")));
    }

    public boolean checkLastName(String lastname) {
        return  ((lastname.matches("^[A-Z]{1}[a-zA-Z]{2,}$")));
    }

    public boolean checkEmail(String email) {
        return  ((email.matches("^[a-zA-Z0-9]{1,}[._+-]?[a-zA-Z0-9]{1,}[@][a-zA-Z0-9]{1,}([.][a-zA-Z]{2,4}){1,2}$")));
    }
}
