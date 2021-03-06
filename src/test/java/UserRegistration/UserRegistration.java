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

    public boolean checkMobileNumber(String mobilenumber) {
        return  ((mobilenumber.matches("^[+_]?[0-9]{2}?[ ]?[0-9]{10}$")));
    }

    public boolean checkPassword(String password) {
        return  ((password.matches("^(?=.{8}$)(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&]).*$")));
    }


}
