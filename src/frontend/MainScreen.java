package frontend;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainScreen extends Application {

    static Stage stage;
    static int width = 1000;
    static int height = 600;

    public static void setScene(Scene scene) {
        stage.setScene(scene);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        stage = primaryStage;
        stage.setScene(WelcomeScreen.getScene());
        stage.show();
    }
}
