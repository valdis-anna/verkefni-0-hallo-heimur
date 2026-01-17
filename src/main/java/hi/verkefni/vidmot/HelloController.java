package hi.verkefni.vidmot;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {

    @FXML
    private Label greetingLabel;

    @FXML
    protected void sayHello() {
        greetingLabel.setText("Halló nemandi!");
    }
}

