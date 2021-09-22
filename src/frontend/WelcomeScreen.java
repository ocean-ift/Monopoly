package frontend;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;

public class WelcomeScreen {

    public static Scene getScene() {

        StackPane pane = new StackPane();
        VBox screen = new VBox(10);
        Button play = createPlayButton();
        Button options = createOpButton();
        screen.getChildren().addAll(play, options);
        pane.getChildren().add(screen);
        Scene welcomeScene = new Scene(pane, MainScreen.width, MainScreen.height);
        welcomeScene.getStylesheets().add("/frontend/design/css/WelcomeScreen.css");

        return welcomeScene;

    }

    private static Button createPlayButton() {
        Button play = new Button("Play");
        play.getStyleClass().add("play");
        play.setOnAction(e -> {
            MainScreen.setScene(SetUp.getScene());
        });
        return play;
    }

    private static Button createOpButton() {
        Button options = new Button("Options");
        options.getStyleClass().add("option");
        options.setOnAction(e -> {
            MainScreen.setScene(Options.getScene());
        });
        return options;
    }
}
