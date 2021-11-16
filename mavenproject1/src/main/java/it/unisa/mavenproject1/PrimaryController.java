package it.unisa.mavenproject1;

import java.io.IOException;
import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
        System.out.println("Ciao");
        System.out.println("Emilio");
        System.out.println("Diego");
    }
}
