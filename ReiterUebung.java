import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ReiterUebung extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        Group root = new Group();
        Scene scene = new Scene(root, 300, 300);

        primaryStage.setTitle("FH-SWF");
        primaryStage.getIcons().add(new Image("file:fhswf.png"));

        TabPane tabPane = new TabPane();
        VBox vboxToggleOuterContainer = new VBox();

        for (int i = 0; i < 5; i++) {
            Tab tab = new Tab();
            tab.setText("Reiter " + i);
            HBox hBox = new HBox();
            hBox.getChildren().add(new Label("Inhalt von Reiter " + i));
            tab.setContent(hBox);
            tabPane.getTabs().add(tab);
        }

        VBox vBox = new VBox();
        vBox.getChildren().addAll(vboxToggleOuterContainer, tabPane);
        root.getChildren().add(vBox);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
