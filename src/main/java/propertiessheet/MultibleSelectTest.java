package propertiessheet;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.controlsfx.control.ListSelectionView;

public class MultibleSelectTest extends Application {
    @Override
    public void start(Stage primaryStage) {
        ListSelectionView<String> objectListSelectionView = new ListSelectionView<>();
        ObservableList<String> objects = FXCollections.observableArrayList("a", "b", "c");
        objectListSelectionView.setSourceItems(objects);
        VBox vBox = new VBox(objectListSelectionView);
        Scene scene = new Scene(vBox, 600, 600);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
