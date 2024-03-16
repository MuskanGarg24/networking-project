package src.controller;

import src.view.RegistrationForm;
import src.view.LoginForm;
import src.view.SearchScreen;
import src.model.Peer;

import java.util.ArrayList;

public class PeerController {

    // Instance variables for the registration form, login form, search screen and
    // the list of peers
    private RegistrationForm registrationForm;
    private LoginForm loginForm;
    private SearchScreen searchScreen;
    private ArrayList<Peer> peers;

    // Constructor to initialize the registration form and the list of peers
    public PeerController() {
        registrationForm = new RegistrationForm();
        peers = registrationForm.getPeers();
        registrationForm.setPeerController(this);
        loginForm = null;
        searchScreen = null;
    }

    // Method to start the application
    public void startApplication() {
        registrationForm.setVisible(true);
    }

    // Method to show the login screen after registration
    public void showLoginScreen() {
        if (loginForm == null) {
            loginForm = new LoginForm(peers);
            loginForm.setPeerController(this);
        }
        registrationForm.setVisible(false);
        loginForm.setVisible(true);
    }

    // Method to show the search screen after successful login
    public void showSearchScreen() {
        if (searchScreen == null) {
            searchScreen = new SearchScreen();
        }
        loginForm.setVisible(false);
        searchScreen.setVisible(true);
    }
}
