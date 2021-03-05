package frontend;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class SetUp {

    public static Scene getScene() {

        StackPane pane = new StackPane();
        ComboBox<Integer> numPlayers = new ComboBox<>();
        numPlayers.getItems().addAll(1, 2, 3, 4);
        numPlayers.setPromptText("Select Number of Players");

        pane.getChildren().add(numPlayers);
        Scene setupScene = new Scene(pane, MainScreen.width, MainScreen.height);
        setupScene.getStylesheets().add("/frontend/design/css/SetUpScreen.css");

        return setupScene;

    }
}
