package frontend;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollBar;
import javafx.scene.layout.StackPane;

public class Options {

    private static Scene opScene;

    public static Scene getScene() {
        StackPane screen = new StackPane();
        opScene = new Scene(screen, MainScreen.width, MainScreen.height);
        screen.getChildren().add(backButton());

        return opScene;
    }

    private static Button backButton() {
        Button back = new Button("Return to Main");
        back.setOnAction(actionEvent -> {
            MainScreen.setScene(WelcomeScreen.getScene());
        });
        return back;
    }

}
