package hi.verkefni.vidmot;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HelloApplication extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        // Note the leading slash!
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/hi.verkefni.vidmot/hello.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Halló heimur");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
