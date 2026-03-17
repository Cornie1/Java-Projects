public class LoginSystem {
    private User user;
    private boolean isLoggedIn = false;

    public LoginSystem(User user) {
        this.user = user;
    }

    public String registerUser() {
        if (!Validator.checkUserName(user.getUsername())) {
            return "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than five characters in length.";
        } else if (!Validator.checkPasswordComplexity(user.getPassword())) {
            return "Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.";
        } else {
            return "Username and password successfully captured.";
        }
    }

    public String checkPhoneNumber() {
        return Validator.checkCellPhoneNumber(user.getPhoneNumber()) ?
            "Cell phone number successfully added." :
            "Cell phone number incorrectly formatted or does not contain international code.";
    }

    public boolean loginUser(String username, String password) {
        isLoggedIn = username.equals(user.getUsername()) && password.equals(user.getPassword());
        return isLoggedIn;
    }

    public String returnLoginStatus() {
        return isLoggedIn ?
            "Welcome " + user.getFirstName() + ", " + user.getLastName() + " it is great to see you again." :
            "Username or password incorrect, please try again.";
    }
}