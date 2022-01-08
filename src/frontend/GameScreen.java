package frontend;

import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;

import javax.swing.text.Element;

public class GameScreen {

    private static Scene gameScreen;

    public static Scene getScene() {
        StackPane screen = new StackPane();
        gameScreen = new Scene(screen, MainScreen.width, MainScreen.height);
        Image image = new Image("frontend/images/Board.jfif");
        ImageView imageV = new ImageView(image);
        screen.getChildren().addAll(imageV);

        return gameScreen;
    }
}
