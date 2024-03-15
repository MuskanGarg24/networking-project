package src.controller;

import src.view.RegistrationForm;
import src.view.LoginForm;
import src.model.Peer;

import java.util.ArrayList;

public class PeerController {

    private RegistrationForm registrationForm;
    private LoginForm loginForm;
    public ArrayList<Peer> peers;

    public PeerController() {
        registrationForm = new RegistrationForm();
        peers = registrationForm.getPeers();
        loginForm = new LoginForm(peers);
    }

    public void startApplication() {
        registrationForm.setVisible(true);
    }

    public void startLogin() {
        loginForm.setVisible(true);
    }

    public void closeRegistration() {
        registrationForm.setVisible(false);
    }

}
