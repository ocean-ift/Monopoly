package frontend;

import backend.GameManager;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class SetUp {

    public static Scene getScene() {

        StackPane pane = new StackPane();

        VBox screen = new VBox(10);

        ComboBox<Integer> numPlayers = new ComboBox<>();
        numPlayers.getItems().addAll(2, 3, 4);
        numPlayers.setPromptText("Select Number of Players");

        Button play = createPlayButton(numPlayers);

        screen.getChildren().addAll(numPlayers, play);
        screen.setAlignment(Pos.CENTER);
        pane.getChildren().add(screen);
        Scene setupScene = new Scene(pane, MainScreen.width, MainScreen.height);
        setupScene.getStylesheets().add("/frontend/design/css/SetUpScreen.css");

        return setupScene;

    }

    public static Button createPlayButton(ComboBox<Integer> numPlayers) {
        Button play = new Button("Play");
        play.setOnAction(event -> {
            GameManager.setNumPlayers(numPlayers.getValue());
            GameManager.initGame();
            System.out.println("Inside createPlayButton (Setup) : " + GameManager.getCurrentPlayer().status());
            System.out.println();
            GameManager.getBoardPositions();
            MainScreen.setScene(GameScreen.getScene());
        });
        return play;
    }
}
