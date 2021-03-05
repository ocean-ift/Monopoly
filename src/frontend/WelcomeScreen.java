package frontend;

import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;

public class WelcomeScreen {

    public static Scene getScene() {

        StackPane pane = new StackPane();
        VBox screen = new VBox(10);
        Button play = new Button("Play");
        pane.getChildren().addAll(play);
        play.setOnAction(e -> {
            MainScreen.setScene(SetUp.getScene());
        });
        Scene welcomeScene = new Scene(pane, MainScreen.width, MainScreen.height);
        welcomeScene.getStylesheets().add("/frontend/design/css/WelcomeScreen.css");

        return welcomeScene;

    }
}
