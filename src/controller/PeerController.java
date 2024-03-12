package src.controller;

// import src.view.RegistrationForm;
// import src.view.LoginForm;
import src.view.SearchScreen;
// import src.view.SearchInformationScreen;

public class PeerController {

    // private RegistrationForm registrationForm;
    // private LoginForm loginForm;
    private SearchScreen searchScreen;
    // private SearchInformationScreen searchInformationScreen;

    public PeerController() {
        // registrationForm = new RegistrationForm();
        // loginForm = new LoginForm();
        searchScreen = new SearchScreen();
        // searchInformationScreen = new SearchInformationScreen();
    }

    public void startApplication() {
        // registrationForm.setVisible(true);
        // loginForm.setVisible(true);
        searchScreen.setVisible(true);
    }

}
