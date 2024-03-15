package src.controller;

import src.view.RegistrationForm;

public class PeerController {

    private RegistrationForm registrationForm;

    public PeerController() {
        registrationForm = new RegistrationForm();
    }

    public void startApplication() {
        registrationForm.setVisible(true);
    }

}
